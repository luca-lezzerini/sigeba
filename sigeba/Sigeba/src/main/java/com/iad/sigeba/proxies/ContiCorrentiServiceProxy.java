package com.iad.sigeba.proxies;

import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import com.iad.sigeba.service.ContiCorrentiService;
import com.iad.sigeba.service.impl.ContiCorrentiServiceImpl;
import java.util.List;

public class ContiCorrentiServiceProxy implements ContiCorrentiService {

    private final ContiCorrentiService contiCorrentiService = new ContiCorrentiServiceImpl();

    @Override
    public List<ContoCorrente> cercaCCPerCliente(Cliente cli, String stringCC) {
        return contiCorrentiService.cercaCCPerCliente(cli, "");
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
    public void rimuoviCC(Long id) {
        contiCorrentiService.rimuoviCC(id);
    }

    @Override
    public List<ContoCorrente> cercaContoEsteso(String stringCC) {
        return contiCorrentiService.cercaContoEsteso(stringCC);
    }

}
