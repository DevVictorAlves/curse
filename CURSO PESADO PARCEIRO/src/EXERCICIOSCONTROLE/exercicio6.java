package EXERCICIOSCONTROLE;

import java.util.Random;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Random random = new Random();
	
		int tentativa = 10 ;
		int numeroUsuario = 0;
		int paraContinuar;
		
		do {
			System.out.println("iniciando o jogo. Sorteando um numero de 0 a 100... ");
			int numeroRandom = random.nextInt(101);
			
		
		do {
			
			
			System.out.printf("\ntentativa %d: ", tentativa);
			
			numeroUsuario = teclado.nextInt();
		if(tentativa <= 0) {
				System.out.println("voce perdeu, porem vou dar outra chance... TOME MAIS UMA VIDA..");
				tentativa += 10;
		} else 
		if (numeroRandom < numeroUsuario) {
			System.out.printf("Seu numero e maior que o numero sorteado... %d", numeroUsuario);
			tentativa--;
		} else
		if (numeroRandom > numeroUsuario ) {
			System.out.printf("O numero sorteado e maior que o seu... % d", numeroUsuario);
			tentativa--;
		} else {
			System.out.printf("parabens voce acertou o numero aleatorio\nSeu numero e: %d\nO numero aleatorio: %d\n", numeroUsuario, numeroRandom);
		} 
		
		
		
		 
		} while(numeroUsuario != numeroRandom);
		System.out.println("\npara continuar aperte outro numero, para sair digite 0: ");
		paraContinuar = teclado.nextInt();
		
		} while(paraContinuar != 0);
		
	
		
		
		teclado.close();
	
	
	}
}
