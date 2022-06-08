package com.iad.sigeba.factories;

import com.iad.sigeba.service.ClientiService;
import com.iad.sigeba.service.ContiCorrentiService;
import com.iad.sigeba.service.MovimentiService;
import com.iad.sigeba.service.impl.ClientiServiceImpl;
import com.iad.sigeba.service.impl.ContiCorrentiServiceImpl;
import com.iad.sigeba.service.impl.MovimentiServiceImpl;

public class SigebaServiceFactory {

    private static final ClientiService clientiService = new ClientiServiceImpl();
    private static final ContiCorrentiService contiCorrentiService = new ContiCorrentiServiceImpl() ;
    private static final MovimentiService movimentiService = new MovimentiServiceImpl() ;


    public static ClientiService getClientiService() {
        return clientiService;
    }
    
    public static ContiCorrentiService getContiCorrentiService() {
        return contiCorrentiService;
    }
    
    public static MovimentiService getMovimentiService() {
        return movimentiService;
    }
}
