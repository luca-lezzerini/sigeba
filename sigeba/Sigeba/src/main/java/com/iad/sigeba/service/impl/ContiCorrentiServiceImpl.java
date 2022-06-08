
package com.iad.sigeba.service.impl;

import com.iad.sigeba.dao.ContiCorrentiDao;
import com.iad.sigeba.factories.SigebaDaoFactory;
import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import com.iad.sigeba.service.ContiCorrentiService;
import java.util.List;

public class ContiCorrentiServiceImpl implements ContiCorrentiService{
    
    private final ContiCorrentiDao contiCorrentiDao = SigebaDaoFactory.getContiCorrentiDao();

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
    public void rimuoviCC(Long id) {
        if (id == null) {
            throw new RuntimeException();
        }
        contiCorrentiDao.rimuoviCC(id);
    }

    @Override
    public List<ContoCorrente> cercaContoEsteso(String stringCC) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<ContoCorrente> cercaContoEsteso(String stringCC) {
        if (stringCC == null || stringCC.contains(" ")) {
            throw new RuntimeException();
        }
        return contiCorrentiDao.cercaContoEsteso(stringCC);
    }
    
}
