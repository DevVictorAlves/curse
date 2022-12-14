package composição.desafio;

import java.util.ArrayList;

public class cliente {

	String nome;
	cliente(String nome){
		this.nome = nome;
	}
	final ArrayList<compra> compras = new ArrayList<>();
	
	double obterValorTotal() {
		double total = 0;
		
		for(compra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
	void adicionarCompra(compra compra) {

		this.compras.add(compra);
	}
	
}

