package com.backend.test.java.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.test.java.domain.model.Estabelecimento;
import com.backend.test.java.domain.repository.EstabelecimentoRepository;

@Service
public class GestaoEstabelecimentoService {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	public Estabelecimento criar(Estabelecimento estabelecimento) {
		
		return estabelecimentoRepository.save(estabelecimento);
	}
}
