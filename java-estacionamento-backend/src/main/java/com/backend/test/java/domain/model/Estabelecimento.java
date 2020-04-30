package com.backend.test.java.domain.model;

public class Estabelecimento {

	private Long id;
	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	private int qtdeVagasMoto;
	private int qtdeVagasCarro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public int getQtdeVagasMoto() {
		return qtdeVagasMoto;
	}
	public void setQtdeVagasMoto(int qtdeVagasMoto) {
		this.qtdeVagasMoto = qtdeVagasMoto;
	}
	public int getQtdeVagasCarro() {
		return qtdeVagasCarro;
	}
	public void setQtdeVagasCarro(int qtdeVagasCarro) {
		this.qtdeVagasCarro = qtdeVagasCarro;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estabelecimento other = (Estabelecimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
