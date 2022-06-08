/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.iad.sigeba.dao;

import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;
import java.util.List;

/**
 *
 * @author Utente
 */
public interface ContiCorrentiDao {
	
    List<ContoCorrente> cercaCCPerCliente(Cliente cli,String cc);

    ContoCorrente salvaCC(ContoCorrente cc);

    ContoCorrente leggiCC(Long idContoCorrente);

    void rimuoviCC(Long idContoCorrente);
    
    List <ContoCorrente> cercaContoEsteso (String stringCC);
}
