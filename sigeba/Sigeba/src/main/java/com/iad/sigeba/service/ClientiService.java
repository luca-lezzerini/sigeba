package com.iad.sigeba.service;

import java.util.List;

import com.iad.sigeba.model.Cliente;

public interface ClientiService {

	List<Cliente> cercaCliente(String cliente);

	Cliente salvaCliente(Cliente cli);

	Cliente leggiCliente(Long idCli);

	void rimuoviCliente(Long idCli);

}