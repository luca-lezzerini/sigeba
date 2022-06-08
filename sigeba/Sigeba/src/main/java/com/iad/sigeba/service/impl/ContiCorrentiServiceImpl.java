
package com.iad.sigeba.service.impl;

import com.iad.sigeba.factories.SigebaDaoFactory;
import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import com.iad.sigeba.service.ContiCorrentiService;
import java.util.List;

public class ContiCorrentiServiceImpl implements ContiCorrentiService{
    
    private final ContiCorrentiDao contiCorrentiDao = SigebaDaoFactory.getClientiDao();

    @Override
    public List<ContoCorrente> cercaCCPerCliente(Cliente cli, String stringCC) {
        if (cli == null) {
            throw new RuntimeException();
        }
        return contiCorrentiDao.cercaCCPerCliente(cli, "");
    }

    @Override
    public ContoCorrente salvaCC(ContoCorrente cc) {
        if (cc == null) {
            throw new RuntimeException();
        }
        return contiCorrentiDao.salvaCC(cc);
    }

    @Override
    public ContoCorrente leggiCC(Long id) {
        if (id == null) {
            throw new RuntimeException();
        }
        return contiCorrentiDao.leggiCC(id);
    }

    @Override
    public void rimuoviCC(ContoCorrente cc) {
        if (cc == null) {
            throw new RuntimeException();
        }
        contiCorrentiDao.rimuoviCC(cc);
    }
    
}
