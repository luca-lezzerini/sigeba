package com.iad.sigeba.service;

import java.util.List;

import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;

public interface ContiCorrentiService {

	List <ContoCorrente> cercaCCPerCliente (Cliente cli, String stringCC);

	ContoCorrente salvaCC (ContoCorrente cc);

	ContoCorrente leggiCC (Long id);

	void rimuoviCC (Long id);
	
	List <ContoCorrente> cercaContoEsteso (String stringCC);

    

}