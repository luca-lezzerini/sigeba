package com.iad.sigeba.proxies;

import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.service.ClientiService;
import com.iad.sigeba.service.impl.ClientiServiceImpl;
import java.util.List;

public class ClientiServiceProxy implements ClientiService{

    private final ClientiService clientiService = new ClientiServiceImpl();
    
    @Override
    public List<Cliente> cercaCliente(String cliente) {
        return clientiService.cercaCliente(cliente);
    }

    @Override
    public Cliente salvaCliente(Cliente cli) {
        return clientiService.salvaCliente(cli);
    }

    @Override
    public Cliente leggiCliente(Long idCli) {
        return clientiService.leggiCliente(idCli);
    }

    @Override
    public void rimuoviCliente(Long idCli) {
        clientiService.rimuoviCliente(idCli);
    }

}