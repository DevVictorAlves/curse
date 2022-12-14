package composição;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("caneta", 20, 7.45);
		compra1.adicionarItem("borracha", 12, 3.89);
		compra1.itens.add(new item("caderno", 3, 18.79));
		
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.valorTotal());
		
		//Só pra mostra a relação bidirecional!!!
		double total = compra1.itens.get(0)
				.compra.itens.get(1).compra.valorTotal();
		
		System.out.println("o total é " + total);
		
	}
}
