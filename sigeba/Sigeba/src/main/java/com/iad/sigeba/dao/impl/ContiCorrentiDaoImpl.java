package com.iad.sigeba.dao.impl;

import com.iad.sigeba.dao.ContiCorrentiDao;
import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import java.util.ArrayList;
import java.util.List;

public class ContiCorrentiDaoImpl implements ContiCorrentiDao{

private final List<ContoCorrente> contiCorrenti = new ArrayList<>();
    private Long idCorrente = 1L;

    @Override
    public List<ContoCorrente> cercaCCPerCliente(Cliente cli, String cc) {
         List<ContoCorrente> risultato = new ArrayList<>();
        for (ContoCorrente cc : contiCorrenti) {
            if (cli.getNome().contains(Cliente cli, String cc)
                    || cli.getCognome().contains(Cliente cli, String cc)) {
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
         ContoCorrente risultato = null;
        for (ContoCorrente cc : contiCorrenti) {
            if (cc.getId().equals(idContoCorrente)) {
                risultato = cc;
                break;
            }
        }
        return risultato;
    } 

  

    @Override
    public void rimuoviCC(Long idContoCorrente) {
        for (ContoCorrente cc : contiCorrenti) {
            if (cc.getId().equals(idContoCorrente)) {
                contiCorrenti.remove(cc);
            }
        }
    }


}
