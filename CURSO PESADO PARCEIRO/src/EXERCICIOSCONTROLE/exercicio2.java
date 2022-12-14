package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("digite o ano : ");
		int ano = teclado.nextInt();
		
		boolean  bissexto = ano % 4 == 0 ^ (ano % 100 == 0);
		//true pq trabalhamos com uma expressão booleana
		System.out.println(2024 % 100);
		if(bissexto == true) {
			System.out.println("o ano e bissexto");
			System.out.println("o ano e: " + ano);

		}else {
			System.out.println("o ano nao e bissexto");
			System.out.println("ano: " + ano);
		}

				System.out.println((double)2024 / (double)400);
				
				teclado.close();
	}
}
