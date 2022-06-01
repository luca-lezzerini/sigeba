package com.iad.sigeba.model;

public class ContoCorrente {

	private Long id;
	private String numero;

	public ContoCorrente(Long id, String numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "ContoCorrente [id=" + id + ", numero=" + numero + "]";
	}

}