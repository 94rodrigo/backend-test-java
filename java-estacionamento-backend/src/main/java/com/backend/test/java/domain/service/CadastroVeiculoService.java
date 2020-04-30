package com.backend.test.java.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.test.java.domain.exception.NegocioException;
import com.backend.test.java.domain.model.Veiculo;
import com.backend.test.java.domain.repository.VeiculoRepository;

@Service
public class CadastroVeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public Veiculo salvar(Veiculo veiculo) {
		Veiculo veiculoExistente = veiculoRepository.findByPlaca(veiculo.getPlaca());
		
		if(veiculoExistente != null && !veiculoExistente.equals(veiculo)) {
			throw new NegocioException("Veículo já existente");
		}
		
		return veiculoRepository.save(veiculo);
	}
	
	public void excluir(Long veiculoId) {
		veiculoRepository.deleteById(veiculoId);
	}
}
