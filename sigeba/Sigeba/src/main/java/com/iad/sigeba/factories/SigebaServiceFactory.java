package com.iad.sigeba.factories;

import com.iad.sigeba.service.ClientiService;
import com.iad.sigeba.service.ContiCorrentiService;
import com.iad.sigeba.service.impl.ClientiServiceImpl;
import com.iad.sigeba.service.impl.ContiCorrentiServiceImpl;

public class SigebaServiceFactory {

    private static final ClientiService clientiService = new ClientiServiceImpl();
    private static final ContiCorrentiService contiCorrentiService = new ContiCorrentiServiceImpl() ;


    public static ClientiService getClientiservice() {
        return clientiService;
    }
    
    public static ContiCorrentiService getContiCorrentiService() {
        return contiCorrentiService;
    }
}
