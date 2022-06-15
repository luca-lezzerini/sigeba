package com.iad.sigeba.dao;

import java.util.List;

import com.iad.sigeba.model.Cliente;

public interface ClientiDao {

	List<Cliente> cercaCliente(String cliente);

	Cliente salvaCliente(Cliente cli);

	Cliente leggiCliente(Long idCli);

	void rimuoviCliente(Long idCli);
}