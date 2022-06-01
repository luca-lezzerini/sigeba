package com.iad.sigeba.dao;

import com.iad.sigeba.model.Cliente;
import java.util.List;

public interface ClientiDao {
    
    List<Cliente> cercaCliente(String cliente);

    Cliente salvaCliente(Cliente cli);

    Cliente leggiCliente(Long idCli);

    void rimuoviCliente(Long idCli);
    
}
