package com.iad.sigeba.dao.impl;

import com.iad.sigeba.dao.ClientiDao;
import com.iad.sigeba.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClientiDaoImpl implements ClientiDao {

    // corrisponde al nostro database
    private final List<Cliente> clienti = new ArrayList<>();
    private Long idCorrente = 1L;

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
    public Cliente salvaCliente(Cliente clienteDaSalvare) {
        Cliente risultato = null;
        // se il cliente è nuovo, senza ID ...
        if (clienteDaSalvare.getId() == null) {
            clienteDaSalvare.setId(idCorrente++);
            clienti.add(clienteDaSalvare);
            risultato = clienteDaSalvare;
        } else { // ... altrimenti lo cerco
            boolean trovato = false;
            for (Cliente cli : clienti) {
                // se lo trovo ...
                if (cli.getId().equals(clienteDaSalvare.getId())) {
                    // .. lo modifico
                    cli.setCognome(clienteDaSalvare.getCognome());
                    cli.setIndirizzo(clienteDaSalvare.getIndirizzo());
                    cli.setNome(clienteDaSalvare.getNome());
                    risultato = cli;
                    trovato = true;
                    break;
                }
            }
            if (!trovato) {
                throw new RuntimeException();
            }
        }
        return risultato;
    }

    @Override
    public Cliente leggiCliente(Long idCli) {
        Cliente risultato = null;
        for (Cliente cli : clienti) {
            if (cli.getId().equals(idCli)) {
                risultato = cli;
                break;
            }
        }
        return risultato;
    }

    @Override
    public void rimuoviCliente(Long idCli) {
        for (Cliente cli : clienti) {
            if (cli.getId().equals(idCli)) {
                clienti.remove(cli);
            }
        }
    }
}
