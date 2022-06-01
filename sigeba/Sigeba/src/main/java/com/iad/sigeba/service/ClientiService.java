package com.iad.sigeba.service;

import com.iad.sigeba.model.Cliente;
import java.util.List;

public interface ClientiService {
    
    List<Cliente> cercaCliente(String cliente);

    Cliente salvaCliente(Cliente cli);

    Cliente leggiCliente(long idCli);

    void rimuoviCliente(long idCli);

}