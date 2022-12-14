package Coleções;


import java.util.Set;
//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {

	public static void main(String[] args) {
	//	Set<String> listaAprovados = new HashSet<>();
	//	TreeSet<String> listaAprovados = new TreeSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Felipe");
		listaAprovados.add("Victor");
		listaAprovados.add("Pedro");
		for(String nome: listaAprovados) {
			System.out.println(nome);
		}
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		System.out.println(nums);
// nao é possivel nums.get();
		for(int n: nums) {
			System.out.println(n);
		}

	Set<Integer> lista = new TreeSet<Integer>();
		lista.add(2);
		lista.add(3);
		lista.add(4);
		System.out.println(lista.contains(2));
		for(int u: lista) {
			System.out.println(u);
		}
		System.out.println("\n" + lista);
	}
	
}