package com.iad.sigeba.proxies;

import com.iad.sigeba.factories.SigebaServiceFactory;
import com.iad.sigeba.model.MovimentoCC;
import com.iad.sigeba.service.MovimentiService;

public class MovimentiServiceProxy implements MovimentiService{
    
    private final MovimentiService movimentiService = SigebaServiceFactory.getMovimentiService();

    @Override
    public void versa(MovimentoCC versa) {
        movimentiService.versa(versa);
    }
    
}
