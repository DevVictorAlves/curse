package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		int contadorquandoonumeronaoeprimo = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("digite um numero primo: ");
		
		int numeroPrimo = teclado.nextInt();
		
		
		for(int i = 2; numeroPrimo > i; i++) {
			if(numeroPrimo % i == 0) {
				
			contadorquandoonumeronaoeprimo++;
			}
		}
		switch(contadorquandoonumeronaoeprimo) {
		case 0:
			System.out.println("o numero e primo: " + numeroPrimo);
			break;
		default:
			System.out.println("o numero nao e primo: " + numeroPrimo);
		
		}
		
		
		teclado.close();
		
	}
}
