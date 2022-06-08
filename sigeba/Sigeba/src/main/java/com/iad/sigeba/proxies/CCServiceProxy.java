package com.iad.sigeba.proxies;

import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import com.iad.sigeba.service.ContiCorrentiService;
import java.util.List;

public class CCServiceProxy implements ContiCorrentiService{
  
    
    
    private final ContiCorrentiService contiCorrentiService = new ContiCorrentServiceImpl();

    @Override
    public List<ContoCorrente> cercaCCPerCliente(Cliente cli, String stringCC) {
        return contiCorrentiService.cercaConto(conto);
    }

    @Override
    public ContoCorrente salvaCC(ContoCorrente cc) {
        return contiCorrentiService.salvaCC(cc);
    }

    @Override
    public ContoCorrente leggiCC(Long id) {
       return contiCorrentiService.leggiCC(id);
    }

    @Override
    public void rimuoviCC(ContoCorrente cc) {
        contiCorrentiService.rimuoviCC(cc);
    }




}
