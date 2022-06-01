package com.iad.sigeba.service.impl;

import com.iad.sigeba.dao.ClientiDao;
import com.iad.sigeba.factories.SigebaDaoFactory;
import java.util.List;

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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente leggiCliente(long idCli) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void rimuoviCliente(long idCli) {
        // TODO Auto-generated method stub

    }

}
