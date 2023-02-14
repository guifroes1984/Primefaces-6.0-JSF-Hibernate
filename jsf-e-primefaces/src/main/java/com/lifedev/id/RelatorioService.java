package com.lifedev.id;

import java.math.BigDecimal;

import javax.inject.Inject;

public class RelatorioService {
	
	@Inject
	private Pedidos pedidos;
	
	public RelatorioService(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	
	public RelatorioService() {
		
	}

	public BigDecimal totalPedidosMesAtual() {
		return pedidos.totalPedidosAtual();
	}
	
	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

}
