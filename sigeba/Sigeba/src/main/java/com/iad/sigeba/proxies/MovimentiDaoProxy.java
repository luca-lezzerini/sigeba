package com.iad.sigeba.proxies;

import com.iad.sigeba.dao.MovimentiDao;
import com.iad.sigeba.factories.SigebaDaoFactory;
import com.iad.sigeba.model.MovimentoCC;

public class MovimentiDaoProxy implements MovimentiDao{

	private final MovimentiDao movimentiDao = SigebaDaoFactory.getMovimentiDao();

	@Override
	public void versa(MovimentoCC versa) {
		movimentiDao.versa(versa);
	}

}