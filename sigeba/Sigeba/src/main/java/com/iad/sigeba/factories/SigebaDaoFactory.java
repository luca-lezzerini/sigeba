package com.iad.sigeba.factories;

import com.iad.sigeba.dao.ClientiDao;
import com.iad.sigeba.dao.ContiCorrentiDao;
import com.iad.sigeba.dao.impl.ClientiDaoImpl;
import com.iad.sigeba.dao.impl.ContiCorrentiDaoImpl;

public class SigebaDaoFactory {

    private static final ClientiDao clientiDao = new ClientiDaoImpl();
    private static final ContiCorrentiDao contiCorrentiDao = new ContiCorrentiDaoImpl() ;

    private SigebaDaoFactory() {
    }

    public static ClientiDao getClientiDao() {
        return clientiDao;
    }
    
    public static ContiCorrentiDao getContiCorrentiDao() {
        return contiCorrentiDao;
    }
}
