package com.iad.sigeba.factories;

import com.iad.sigeba.service.ClientiService;
import com.iad.sigeba.service.impl.ClientiServiceImpl;

public class SigebaServiceFactory {

    private static final ClientiService clientiService = new ClientiServiceImpl();

    public static ClientiService getClientiservice() {
        return clientiService;
    }
}
