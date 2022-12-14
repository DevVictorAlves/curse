 package composição;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new item(nome, quantidade, preco));
	}
	
	void adicionarItem(item item) {
		itens.add(item);
		item.compra = this;
	}
	double valorTotal() {
		double total = 0;
		for(item item: itens) {
			total += item.quantidade * item.preço;
		}
		return total;
	}
}
