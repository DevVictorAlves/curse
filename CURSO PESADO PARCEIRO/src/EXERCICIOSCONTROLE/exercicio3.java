package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		//calcule duas parciais, dps calcule a media final de forma que o programa entenda reporvado e aprovado no console
		
	Scanner teclado = new Scanner(System.in);

		
		
		double nota = 0;
		double somaNotas = 0;
		double quantidadeTotal = 0;
		
		while(nota != -1) {
		System.out.print("informe a nota: ");
			nota = teclado.nextDouble();
			
		if(nota <= 10 && nota >= 0) {
			 somaNotas += nota;
				quantidadeTotal++;
				
		} else 
		if(nota != -1){
		System.out.println("nota invalida, digite uma nota valida, por favor abaixo : ");
			break;
		}
		

  }
		double neymar = quantidadeTotal + somaNotas;
		neymar /= 2;
		
		if(neymar >= 7.0 || neymar >= 6.1) {
		System.out.println("parabens conceito A");
		System.out.println(neymar);
		} else
		if(neymar >= 4.0 && neymar <= 6.9) {
		System.out.println("recuperaçao");
		System.out.println(neymar);
		} else 
		if(neymar <= 3.9 && nota != -1){
		System.out.println("aluno reprovado");
		} 
		
		
		  
		teclado.close();

	}
		
}
