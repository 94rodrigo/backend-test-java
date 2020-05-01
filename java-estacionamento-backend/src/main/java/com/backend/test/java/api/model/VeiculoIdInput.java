package com.backend.test.java.api.model;

import javax.validation.constraints.NotNull;

public class VeiculoIdInput {
	
	@NotNull
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
