package br.pro.diegoquirino.calculadora.model;

import br.pro.diegoquirino.calculadora.util.DescontoUtils;

import java.util.HashMap;
import java.util.Map;


public class CarrinhoDeCompras {

	private Map<Produto, Integer> produtos;
	
	private Cliente cliente;
	
	public CarrinhoDeCompras() {
		super();
		this.produtos = new HashMap<>();
	}

	public Map<Produto, Integer> getProdutos() {
		return produtos;
	}

	public void setProdutos(Map<Produto, Integer> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addProduto(Produto p, int quant) {
		if(!this.produtos.containsKey(p)) {
			this.produtos.put(p, quant);
		}
	}
	
	public double calcularValorComDesconto(Produto p) {
		DescontoUtils du = new DescontoUtils();
		double valorComDesconto = 0;
		for(Produto prod: this.produtos.keySet()) {
			if(p.equals(prod)) {
				valorComDesconto = prod.getValor() *
						du.calcularFatorDeDesconto(this.cliente.getTipoCliente(),
								produtos.get(prod).intValue());
			}
		}
		return valorComDesconto;
	}
	
}
