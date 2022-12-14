package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio9 {
public static void main(String[] args) {
	//9 - Crie um programa que recebe 10 valores e ao final imprima o maior número.
	Scanner teclado = new Scanner(System.in);
	int i = 0;
	int contador = 0;
	int maiorValor = 0;

	do {
		System.out.print("\ninsira um numero para compara-los..: ");
		i = teclado.nextInt();
		contador++;
		
		if(i > maiorValor) {
			maiorValor = i;

		}
	
	
	} while (contador != 10);
	
	System.out.println(" o maior valo foi :  " + maiorValor);
	
	teclado.close();
	
	
}
}
