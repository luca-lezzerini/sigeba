package com.iad.sigeba.factories;

import com.iad.sigeba.dao.ClientiDao;
import com.iad.sigeba.dao.impl.ClientiDaoImpl;

public class SigebaDaoFactory {

    private static final ClientiDao clientiDao = new ClientiDaoImpl();

    private SigebaDaoFactory() {
    }

    public static ClientiDao getClientiDao() {
        return clientiDao;
    }
}
