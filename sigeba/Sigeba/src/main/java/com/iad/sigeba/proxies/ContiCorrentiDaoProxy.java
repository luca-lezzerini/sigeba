package com.iad.sigeba.proxies;

import com.iad.sigeba.dao.ContiCorrentiDao;
import com.iad.sigeba.factories.SigebaDaoFactory;
import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import com.iad.sigeba.service.ContiCorrentiService;
import java.util.List;


public class ContiCorrentiDaoProxy implements ContiCorrentiService  {
    
    private final ContiCorrentiDao contiCorrentiDao = SigebaDaoFactory.getContiCorrentiDao();

    @Override
    public List<ContoCorrente> cercaCCPerCliente(Cliente cli, String stringCC) {
        return contiCorrentiDao.cercaCCPerCliente(cli, "");
    }

    @Override
    public ContoCorrente salvaCC(ContoCorrente cc) {
        return contiCorrentiDao.salvaCC(cc);
    }

    @Override
    public ContoCorrente leggiCC(Long id) {
        return contiCorrentiDao.leggiCC(id);
    }

    @Override
    public void rimuoviCC(Long id) {
        contiCorrentiDao.rimuoviCC(id);
    }
    
    @Override
    public List<ContoCorrente> cercaContoEsteso(String stringCC) {
        return contiCorrentiDao.cercaContoEsteso(stringCC);
	}
    
    
    
}
