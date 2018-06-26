package br.pro.diegoquirino.calculadora.util;

import br.pro.diegoquirino.calculadora.model.Cliente;

public class ClienteAStub implements Cliente {

	@Override
	public String getTipoCliente() {
		return "A";
	}

	@Override
	public void setTipoCliente(String tipo) {
		;
	}

}
