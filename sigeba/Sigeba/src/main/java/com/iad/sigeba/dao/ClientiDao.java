package com.iad.sigeba.dao;

import com.iad.sigeba.model.Cliente;
import java.util.List;

public abstract interface ClientiDao {
    
    List<Cliente> cercaCliente(String cliente);

    void salvaCliente(Cliente cli);

    void leggiCliente(long idCli);

    void rimuoviCliente(long idCli);
    
}
