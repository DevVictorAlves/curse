package composição.desafio;

import java.util.ArrayList;

public class compra {
	
	final ArrayList<item> itens = new ArrayList<>();
	
	void adicionarItem(produto p, int qtde) {
		this.itens.add(new item(p, qtde));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = (new produto(nome, preco));
		this.itens.add(new item(produto, qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
