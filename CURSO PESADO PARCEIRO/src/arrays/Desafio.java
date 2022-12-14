package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		
		int qtdNotas = teclado.nextInt();
		
		double[] notas = new double[qtdNotas];
		
	for (int i = 0; i < notas.length; i++) {
		System.out.print("informe a nota " + (i + 1) + ": ");
		notas[i] = teclado.nextDouble();
	}
		System.out.println(Arrays.toString(notas));
		teclado.close();
	
		double total = 0;
		
		for(double nota: notas) {
		total += nota;
		
		}	
		double media = total / notas.length;
		System.out.println("a media e " + media + "!");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ana");
		
		list.forEach(l1 -> System.out.println(l1.toString()));
	}
	


}
