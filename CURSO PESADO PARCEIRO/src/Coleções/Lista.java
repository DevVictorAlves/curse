package Coleções;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Pessoa> p = new ArrayList<>();
		p.add(new Pessoa("Victor"));
		p.add(new Pessoa("Dudu"));
		p.add(new Pessoa("Lia"));
		p.add(new Pessoa("Manu"));
		
		System.out.println(p.get(2).nome);

		System.out.println("remove ----> " + p.remove(0));		
		System.out.println(p.size());
		p.remove(2);
		System.out.println("--->" +  p.remove(1));
		System.out.println(p.remove(new Pessoa("Manu")));
		System.out.println("tem?" + p.contains( new Pessoa("Dudu")));
		
		System.out.println();
		for(Pessoa u: p) {
			System.out.println(u.nome);
			System.out.println( u);
		}
	}
}
