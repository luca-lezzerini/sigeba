package com.iad.sigeba.dao.impl;

import com.iad.sigeba.dao.ClientiDao;
import com.iad.sigeba.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClientiDaoImpl implements ClientiDao {

    // corrisponde al nostro database
    private final List<Cliente> clienti = new ArrayList<>();

    @Override
    public List<Cliente> cercaCliente(String testoDaCercare) {
        List<Cliente> risultato = new ArrayList<>();
        for (Cliente cli : clienti) {
            if (cli.getNome().contains(testoDaCercare)
                    || cli.getCognome().contains(testoDaCercare)) {
                risultato.add(cli);
            }
        }
        
        return risultato;
    }

    @Override
    public Cliente salvaCliente(Cliente cli) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente leggiCliente(long idCli) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void rimuoviCliente(long idCli) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
