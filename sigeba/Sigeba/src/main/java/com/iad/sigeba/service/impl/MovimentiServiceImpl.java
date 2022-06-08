package com.iad.sigeba.service.impl;

import com.iad.sigeba.dao.MovimentiDao;
import com.iad.sigeba.factories.SigebaDaoFactory;
import com.iad.sigeba.model.MovimentoCC;
import com.iad.sigeba.service.MovimentiService;

public class MovimentiServiceImpl implements MovimentiService{
    
    private final MovimentiDao movimentiDao = SigebaDaoFactory.getMovimentiDao();

    @Override
    public void versa(MovimentoCC versa) {
        if (versa == null) {
            throw new RuntimeException();
        }
        movimentiDao.versa(versa);
    }
    
}
