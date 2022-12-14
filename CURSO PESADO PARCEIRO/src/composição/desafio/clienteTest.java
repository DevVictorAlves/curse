package composição.desafio;

public class clienteTest {

	public static void main(String[] args) {
		cliente cliente = new cliente("Matheus");
		
		compra compra1 = new compra();
		compra1.adicionarItem("caneta", 9.67, 1);
		compra1.adicionarItem(new produto("notebook", 100),2 );
		
		compra compra2 = new compra();
		compra2.adicionarItem("caderno", 10, 10);
		compra2.adicionarItem(new produto("impressora", 998.90),1 );

		cliente.compras.add(compra1);
		System.out.println(cliente.obterValorTotal());
		cliente.adicionarCompra(compra2);
		System.out.println(cliente.obterValorTotal());
	}
}
