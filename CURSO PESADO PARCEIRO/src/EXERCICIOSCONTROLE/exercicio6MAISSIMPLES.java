package EXERCICIOSCONTROLE;

import java.util.Random;
import java.util.Scanner;

public class exercicio6MAISSIMPLES {

	public static void main(String[] args) {
		//usando apenas while, sem o do while
		Random random = new Random();
		Scanner teclado = new Scanner(System.in);

		
		int tentativas = 10;
		int numeroSorteado = random.nextInt(101);
		boolean acertou = false;
		System.out.println("iniciando o jogo... Sera que voce consegue me vencer?\n");
		
		while(tentativas > 0 && acertou == false) {
			System.out.print("tentativa: " + tentativas + "\ninsira um numero de 0 a 100: ");
			int numero = teclado.nextInt();
		if(numero == numeroSorteado) {
			System.out.println("\nparabens voce acertou, ferinha!!!");
			System.out.printf("\nSeu numero: %d \nO numero sorteado: %d",numero, numeroSorteado);
		acertou = true;
		} else
		if(numero > numeroSorteado){
			System.out.printf("seu numero %d e maior que o sorteado \n\n", numero);
			--tentativas;
		} else
		if(numero < numeroSorteado) {
			System.out.printf("seu numero %d e menor que o sorteado \n\n", numero);
			--tentativas;
		}
			
		}
		
		
		
		
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
