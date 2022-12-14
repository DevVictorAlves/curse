package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio3ComIF {

		public static void main(String[] args) {
		//versao if aprendizado
		
		Scanner teclado = new Scanner(System.in);

		double nota = 0;
		double quantidadeDeNota = 0;
		double totalDasNotasSomadas = 0;

		while(nota != -2) {
			System.out.print("Insira uma nota: ");
			nota = teclado.nextDouble();
			
		if(nota <= 10 && nota >= 0) {
			totalDasNotasSomadas += nota;
			quantidadeDeNota++;
		} else
		if(nota != -2) {
		System.out.println("por favor. Digite uma nota valida");
	
		}
		} 
		
		double somadasnotas = totalDasNotasSomadas / 3 ;
		System.out.println( "voce somou total de vezes: "+ quantidadeDeNota);
		// somadasnotas /= 3;
		
		if(somadasnotas >= 8.0) {
		System.out.println("Conceito A");
		System.out.println("sua nota e: " + somadasnotas);
		} else
		if(somadasnotas <= 7.9 && somadasnotas >= 6.0) {
		System.out.println("Conceito B");
		System.out.println("sua nota e: " + somadasnotas);
		} else 
		if(somadasnotas <= 5.9 && somadasnotas >= 4.0) {
		System.out.println("Conceito C");
		System.out.println("sua nota e: " + somadasnotas);
		} else
		if(somadasnotas <= 3.9 && somadasnotas >= 2.9) {
		System.out.println("Conceito D");
		System.out.println("sua nota e: " + somadasnotas);
		} else
		if(somadasnotas <= 2.8 && somadasnotas >= 0.1) {
		System.out.println("Conceito E, Reprovado direto");
		System.out.println("sua nota e: " + somadasnotas);
		}
		

		
		
		
		
		
		teclado.close();
	}
}
