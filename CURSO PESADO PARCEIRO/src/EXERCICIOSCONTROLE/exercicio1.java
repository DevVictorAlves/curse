package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um numero de 1 ate 10: ");
		int num1 = teclado.nextInt();
		if(num1 % 2 == 0 && num1 <= 10) {
			System.out.println("o numero e par: " + num1);
			System.out.println("\no numero esta entre os 10: " + num1);
					
		} else {
			System.out.println("o numero e impar: " + num1);
			System.out.println("\no numero nao esta entre os 10: " + num1);
		}
		
	

	

		
		
		teclado.close();
	
	}

}