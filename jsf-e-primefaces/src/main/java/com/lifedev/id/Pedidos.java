package com.lifedev.id;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class Pedidos {
	
	@Inject
	private EntityManager manager;
	
	public BigDecimal totalPedidosAtual() {
		return new BigDecimal("100");
	}

}
