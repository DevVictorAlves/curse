package classe;

public class ProdutoTest {
	public static void main(String[] args) {
		//objeto 1
		
	Produto p1 = new Produto("Notebook", 4356.99);
		//p1.nome = "Notebook";
       	//p1.preco = 4356.99;
		//p1.desconto = 0.25;
	
		/*/objeto 2*/
//posso criar sem parametro, ou seja sem nada dentro do (), pq eu defini um construto na classe molde nos atributos, ou seja defini um construtor padrao e o outro que pode colocar ou adciionar nome
		var p2 = new Produto();
		p2.nome = "caneta";
		p2.preco = 12.56;
		
		//3267,74 nao muda pq o produto com desconto ou seja membro da classe, ou seja eu mudei um mebro da classe
		//eu mudei abaixo do p1 entao so conta abaixo do p1
		//membro de uma classe nao pode mudar
		
		System.out.printf("%s %.2f \n", p1.nome, p1.precoComDesconto());
		
		Produto.desconto = 0.30;
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double somaDosProdutos =  p1.precoComDesconto();
		double somaDosProdutos1 =  p2.precoComDesconto();
		
		System.out.println("\n" + somaDosProdutos);
		System.out.println("\n" + somaDosProdutos1);
		
		double somafinal = ( (somaDosProdutos + somaDosProdutos1) / 2);
		
		System.out.printf("\no resultado da soma dos carrinho em base de media e de... RS %.2f", somafinal );

	System.out.println("\n" + p1.precoComDesconto());
	System.out.println(Produto.desconto);
	
	
	}

}
