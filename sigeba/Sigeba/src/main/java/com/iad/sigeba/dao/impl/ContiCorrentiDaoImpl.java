package com.iad.sigeba.dao.impl;

import com.iad.sigeba.dao.ContiCorrentiDao;
import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import java.util.ArrayList;
import java.util.List;

public class ContiCorrentiDaoImpl implements ContiCorrentiDao {

    private final List<ContoCorrente> contiCorrenti = new ArrayList<>();
    private Long idCorrente = 1L;

    @Override
    public List<ContoCorrente> cercaCCPerCliente(Cliente cli, String cc) {
        // 1) cercare tutti i clienti che hanno la stringa cc nel nome o cognome
        // e metterli in una lista
        
        // 2) per ciascun cliente trova tutti i C/C che gli sono associati
        
        
        // 3) trova tutti i C/C che hanno nel loro codice la stringa cc 
        List<ContoCorrente> risultato = new ArrayList<>();
        for (ContoCorrente cc : contiCorrenti) {
            if (cc.getNome().contains(testoDaCercare)
                    || cc.getCognome().contains(testoDaCercare)) {
                risultato.add(cc);
            }
        }

        return risultato;
    }

    @Override
    public ContoCorrente salvaCC(ContoCorrente contoCorrenteDaSalvare) {
        ContoCorrente risultato = null;
        if (contoCorrenteDaSalvare.getId() == null) {
            contoCorrenteDaSalvare.setId(idCorrente++);
            contiCorrenti.add(contoCorrenteDaSalvare);
            risultato = contoCorrenteDaSalvare;
        } else {
            boolean trovato = false;
            for (ContoCorrente cc : contiCorrenti) {
                if (cc.getId().equals(contoCorrenteDaSalvare.getId())) {
                    cc.setNumero(contoCorrenteDaSalvare.getNumero());
                    risultato = cc;
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
    public ContoCorrente leggiCC(Long idContoCorrente) {
        return null;
    }

    @Override
    public void rimuoviCC(Long idContoCorrente) {
        for (ContoCorrente cc : contiCorrenti) {
            if (cc.getId().equals(idContoCorrente)) {
                contiCorrenti.remove(cc);
            }
        }
    }

    @Override
    public List<ContoCorrente> cercaContoEsteso(String stringCC) {
        return null;
    }

}
