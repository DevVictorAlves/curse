package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// Ou seja, um número natural é primo se ele é maior que 1 e é divisível apenas por si próprio e por 1.
		//Ou seja, um número natural é primo se ele é 
		//maior que 1 e é divisível apenas por si próprio e por 1. Um exemplo: o número 2. Ele só é divisível por ele mesmo, e por 1.
		Scanner teclado = new Scanner(System.in);
		int contadorDeDivisores = 0;
		
		System.out.print("insira um numero para dizer se o valor e primo:  ");
		int primo = teclado.nextInt();
		//primo vai pegar o restante da divisao de 2 se nao for igual a zero ele vai exectar o if
		//exemplo 6%2 nao é 0, po risso so da primo pq so vai da certo se for numeor impares
		for(int contador = 2; contador < primo; contador++) {
		if(primo % contador == 0) {
		contadorDeDivisores++;
			}
		}
		if(contadorDeDivisores == 0) {
			System.out.println("\n o numero e primo: " + primo);
		} else {
			System.out.println("nao e primo: " + primo);
		}
		
	
	
	
	
	
	
	
		teclado.close(); 
	
	}
}
