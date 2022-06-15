package com.iad.sigeba.dao;

import java.util.List;

import com.iad.sigeba.model.Cliente;
import com.iad.sigeba.model.ContoCorrente;

public interface ContiCorrentiDao {

	List<ContoCorrente> cercaCCPerCliente(Cliente cli,String cc);

	ContoCorrente salvaCC(ContoCorrente cc);

	ContoCorrente leggiCC(Long idContoCorrente);

	void rimuoviCC(Long idContoCorrente);

	List <ContoCorrente> cercaContoEsteso (String stringCC);
}