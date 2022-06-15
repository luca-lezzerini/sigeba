package com.iad.sigeba.model;

public class Cliente {

	private String cognome;
	private String nome;
	private String indirizzo;
	private Long id;

	public Cliente(String cognome, String nome, String indirizzo, Long id) {
		this.cognome = cognome;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.id = id;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente() {
	}

}