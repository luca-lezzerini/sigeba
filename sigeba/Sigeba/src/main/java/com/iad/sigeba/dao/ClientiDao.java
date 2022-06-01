package com.iad.sigeba.dao;

import com.iad.sigeba.model.Cliente;
import java.util.List;

public abstract interface ClientiDao {
    
    List<Cliente> cercaCliente(String cliente);

    Cliente salvaCliente(Cliente cli);

    Cliente leggiCliente(long idCli);

    void rimuoviCliente(long idCli);
    
}
