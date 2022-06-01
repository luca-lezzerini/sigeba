package com.iad.sigeba.service.impl;

import java.util.List;

import com.iad.sigeba.dao.ClientiDao;
import com.iad.sigeba.factories.SigebaDaoFactory;
import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.service.ClientiService;

public class ClientiServiceImpl implements ClientiService {

	private final ClientiDao clientiDao = SigebaDaoFactory.getClientiDao();

	@Override
	public List<Cliente> cercaCliente(String cliente) {
		if (cliente == null) {
			throw new RuntimeException();
		}
		return clientiDao.cercaCliente(cliente);
	}

	@Override
	public Cliente salvaCliente(Cliente cli) {
		if (cli == null) {
			throw new RuntimeException();
		}
		return clientiDao.salvaCliente(cli);
	}

	@Override
	public Cliente leggiCliente(Long idCli) {
		if (idCli <= 0) {
			throw new RuntimeException();
		}
		return clientiDao.leggiCliente(idCli);
	}

	@Override
	public void rimuoviCliente(Long idCli) {
	}

}