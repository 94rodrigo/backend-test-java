package com.backend.test.java.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.backend.test.java.api.model.EstabelecimentoInput;
import com.backend.test.java.api.model.EstabelecimentoModel;
import com.backend.test.java.domain.model.Estabelecimento;
import com.backend.test.java.domain.repository.EstabelecimentoRepository;
import com.backend.test.java.domain.service.GestaoEstabelecimentoService;


@RestController
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController {

	@Autowired
	private GestaoEstabelecimentoService gestaoEstabelecimentoService;
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EstabelecimentoModel criar(@Valid @RequestBody EstabelecimentoInput estabelecimentoInput) {
		Estabelecimento estabelecimento = toEntity(estabelecimentoInput);
		return toModel(gestaoEstabelecimentoService.criar(estabelecimento));
	}
	
	@GetMapping
	public List<EstabelecimentoModel> listar(){
		return toCollectionModel(estabelecimentoRepository.findAll());
	}
	
	@GetMapping("/{estabelecimentoId}")
	public ResponseEntity<EstabelecimentoModel> buscar(@PathVariable Long estabelecimentoId){
		Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(estabelecimentoId);
		
		if(estabelecimento.isPresent()) {
			EstabelecimentoModel estabelecimentoModel = toModel(estabelecimento.get());
			return ResponseEntity.ok(estabelecimentoModel);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	private EstabelecimentoModel toModel(Estabelecimento estabelecimento) {
		return modelMapper.map(estabelecimento, EstabelecimentoModel.class);
	}
	
	private List<EstabelecimentoModel> toCollectionModel(List<Estabelecimento> estabelecimentos){
		return estabelecimentos.stream()
				.map(estabelecimento -> toModel(estabelecimento))
				.collect(Collectors.toList());
	}
	
	private Estabelecimento toEntity(EstabelecimentoInput estabelecimentoInput) {
		return modelMapper.map(estabelecimentoInput, Estabelecimento.class);
	}
}
