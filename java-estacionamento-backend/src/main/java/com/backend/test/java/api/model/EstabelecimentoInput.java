package com.backend.test.java.api.model;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;


public class EstabelecimentoInput {

	@NotBlank
	private String nome;
	
	@NotBlank
	private String cnpj;
	
	@NotBlank
	private String endereco;
	
	@NotBlank
	private String telefone;
	
	@Valid
	private VeiculoIdInput veiculoIdInput;
	
	@NotBlank
	private Integer qtdeVagasMoto;
	
	@NotBlank
	private Integer qtdeVagasCarro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public VeiculoIdInput getVeiculoIdInput() {
		return veiculoIdInput;
	}
	public void setVeiculoIdInput(VeiculoIdInput veiculoIdInput) {
		this.veiculoIdInput = veiculoIdInput;
	}
	public Integer getQtdeVagasMoto() {
		return qtdeVagasMoto;
	}
	public void setQtdeVagasMoto(Integer qtdeVagasMoto) {
		this.qtdeVagasMoto = qtdeVagasMoto;
	}
	public Integer getQtdeVagasCarro() {
		return qtdeVagasCarro;
	}
	public void setQtdeVagasCarro(Integer qtdeVagasCarro) {
		this.qtdeVagasCarro = qtdeVagasCarro;
	}
	
	
}
