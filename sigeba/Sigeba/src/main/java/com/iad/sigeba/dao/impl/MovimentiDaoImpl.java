package com.iad.sigeba.dao.impl;

import com.iad.sigeba.dao.MovimentiDao;
import com.iad.sigeba.model.MovimentoCC;
import java.util.ArrayList;
import java.util.List;

public class MovimentiDaoImpl implements MovimentiDao {

    private final List<MovimentoCC> movimenti = new ArrayList<>();

    @Override
    public void versa(MovimentoCC versamento) {
        movimenti.add(versamento);
    }
}
