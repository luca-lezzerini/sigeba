package com.iad.sigeba.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.iad.sigeba.dao.MovimentiDao;
import com.iad.sigeba.model.MovimentoCC;

public class MovimentiDaoImpl implements MovimentiDao {

	private final List<MovimentoCC> movimenti = new ArrayList<>();

	@Override
	public void versa(MovimentoCC versamento) {
		movimenti.add(versamento);
	}
}