package Coleções;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoBagunçado {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("neymar"); //String 
		conjunto.add(2); // int -> Integer
		conjunto.add('a'); //char -> Character
	
		System.out.println("conjunto -- ->  "  + conjunto);
		System.out.println("Tamanho é " + conjunto.size());
	
		conjunto.add("neymar");
		System.out.println("tamanho é " +  conjunto.size());
		System.out.println("remover false/true ? \n" + conjunto.remove("neymar"));
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains("neymar"));
		System.out.println(conjunto.contains(true));
		
		@SuppressWarnings("rawtypes")
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		System.out.println(nums.size());
		//conjunto.add(nums); //União entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println("\n\n" + conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		conjunto.clear();
		
	}
}
