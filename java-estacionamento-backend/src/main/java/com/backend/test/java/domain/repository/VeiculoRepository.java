package com.backend.test.java.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.test.java.domain.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

	List<Veiculo> findByMarca(String marca);
	List<Veiculo> findByMarcaContaining(String marca);
	List<Veiculo> findByModelo(String modelo);
	Veiculo findByPlaca(String placa);
}
