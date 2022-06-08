package com.iad.sigeba.proxies;

import com.iad.sigeba.dao.ClientiDao;
import com.iad.sigeba.factories.SigebaDaoFactory;
import java.util.List;

import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.service.ClientiService;

public class ClientiDaoProxy implements ClientiService{

	private final ClientiDao clientiDao = SigebaDaoFactory.getClientiDao();

	@Override
	public List<Cliente> cercaCliente(String cliente) {
		return clientiDao.cercaCliente(cliente);
	}

	@Override
	public Cliente salvaCliente(Cliente cli) {
		return clientiDao.salvaCliente(cli);
	}

	@Override
	public Cliente leggiCliente(Long idCli) {
		return clientiDao.leggiCliente(idCli);
	}

	@Override
	public void rimuoviCliente(Long idCli) {
		clientiDao.rimuoviCliente(idCli);
	}

}