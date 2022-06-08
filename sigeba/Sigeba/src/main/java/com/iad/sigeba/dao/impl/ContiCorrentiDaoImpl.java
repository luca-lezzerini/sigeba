package com.iad.sigeba.dao.impl;

import com.iad.sigeba.dao.ContiCorrentiDao;
import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import java.util.ArrayList;
import java.util.List;

public class ContiCorrentiDaoImpl implements ContiCorrentiDao{

private final List<ContoCorrente> conticorrenti = new ArrayList<>();
    private Long idCorrente = 1L;

    @Override
    public List<ContoCorrente> cercaCCPerCliente(Cliente cli, String cc) {
        
    }

    @Override
    public ContoCorrente salvaCC(ContoCorrente cc) {
        
    }

    @Override
    public ContoCorrente leggiCC(Long idContoCorrente) {
        
    }

    @Override
    public void rimuoviCC(Long idContoCorrente) {
        
    }


}
