package com.iad.sigeba.proxies;

import com.iad.sigeba.model.MovimentoCC;
import com.iad.sigeba.service.MovimentiService;
import com.iad.sigeba.service.impl.MovimentiServiceImpl;

public class MovimentiServiceProxy implements MovimentiService{
    
    private final MovimentiService movimentiService = new MovimentiServiceImpl();

    @Override
    public void versa(MovimentoCC versa) {
        movimentiService.versa(versa);
    }
    
}
