package com.iad.sigeba.service;

import java.util.List;

public abstract interface ClientiService {
    
    List<Cliente> cercaCliente(String cliente);

    void salvaCliente(Cliente cli);

    void leggiCliente(long idCli);

    void rimuoviCliente(long idCli);

    
}
