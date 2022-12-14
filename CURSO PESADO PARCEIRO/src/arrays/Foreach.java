package arrays;

import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {
		//
		//
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		double[] notas2 = new double[1];
		notas2[0] = 0;
		
		for(int i = 0; i < notas.length; i ++) {
		System.out.println(notas[i]);	
		}
		
//so de usar o system.out.println ela ja imprimi uma nova linha
		System.out.println("\n");
		
		//percorrer o array mais praticamente
		double somaTotal = 0;
		for(double a: notas) {
			somaTotal =+ a;

			System.out.println("a" +  a);
		}
		String a = Arrays.toString(notas);
		System.out.println();
		System.out.println("b " + somaTotal);
		System.out.println(a);
		for(double ab: notas2) {
			
			System.out.println(ab);
		}
		
		
		
		
	}
}
