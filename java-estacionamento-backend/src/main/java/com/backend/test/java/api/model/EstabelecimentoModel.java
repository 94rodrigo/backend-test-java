package com.backend.test.java.api.model;

public class EstabelecimentoModel {

	private Long id;
	private VeiculoResumoModel veiculo;
	private String nomeEstabelecimento;
	private String cnpjEstabelecimento;
	private Integer qtdeVagasMoto;
	private Integer qtdeVagasCarro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}
	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}
	public String getCnpjEstabelecimento() {
		return cnpjEstabelecimento;
	}
	public void setCnpjEstabelecimento(String cnpjEstabelecimento) {
		this.cnpjEstabelecimento = cnpjEstabelecimento;
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
	public VeiculoResumoModel getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(VeiculoResumoModel veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
}
