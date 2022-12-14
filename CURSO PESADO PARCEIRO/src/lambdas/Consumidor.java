package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> Imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.0, 0.34);
		Imprimir.accept(p1);

		Produto p2 = new Produto("Notebook", 1222.0, 0.38);
		Produto p3 = new Produto("caderno", 19.0, 0.38);
		Produto p4 = new Produto("Borracha", 3.0, 0.60);
		Produto p5 = new Produto("lapizera", 5.0, 0.13);
		Produto p6 = new Produto("lapis", 7.0, 0.4);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		produtos.forEach(Imprimir);
		System.out.println();
		
		produtos.forEach(prod1 -> System.out.println(prod1.nome));
		System.out.println();
		
		produtos.forEach(System.out::println);
		
	}

	
}

