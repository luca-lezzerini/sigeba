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
    public Cliente salvaCliente(Cliente clienteDaSalvare) {
        for (Cliente clia : clienti) {
            if (clia.().equals(clienteDaSalvare)) {
                boolean aggiungi = clienti.add(clia);
            }
        }
        return null;
    }

    @Override
    public Cliente leggiCliente(Long idCli) {
        List<Cliente> trova = new ArrayList<>();
        for (Cliente clit : clienti) {
            if (clit.getId().equals(idCli)) {
                System.out.println(clit);
            }
        }
        return null;
    }

    @Override
    public void rimuoviCliente(Long idCli) {
        List<Cliente> rimuoviCliente = new ArrayList<>();
        for (Cliente clir : clienti) {
            if (clir.getId().equals(idCli)) {
                boolean rimuovi = clienti.remove(clir);
            }
        }
    }
}
