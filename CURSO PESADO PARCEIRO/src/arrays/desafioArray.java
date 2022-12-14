package arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class desafioArray {

	public static void main(String[] args) {
		//fique de olho nos tipos das variaveis
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("insira a quantidade de notas: ");
		int numeroDoScanner = teclado.nextInt();

		int[] a = new int [numeroDoScanner];
		System.out.println();
		
		double notas = 0;
		double somaTotal = 0;
		int passagem = 0;
		for(int i = 0 ;i < a.length ; i++) {
			switch(passagem) {
			case 0:
				System.out.print("insira o primeiro numero: ");
				break;
			case 1:
				System.out.print("insira o segundo numero: ");
				break;
			case 2:
				System.out.print("insira o terceiro numero: ");
				break;
			case 3:
				System.out.print("insira o quarto numero: ");
				break;
			case 4:
				System.out.print("insira o quinto numero: ");
				break;
			}
			
			notas = teclado.nextDouble();
			somaTotal += notas;
			passagem++;
			
		}
		
				System.out.println("a divisao das notas e: " + somaTotal / a.length);
				
				System.out.print("insira a quantidade de nota do aluno 2: ");
				int numeroDoScanner2 = teclado.nextInt();
				int b[] = new int[numeroDoScanner2];
				
				double notas2 = 0;
				double somaTotal2 = 0;
				for(int numero: b) {
					
					System.out.println(numero);
					System.out.println();
					notas2 = teclado.nextDouble();
					somaTotal2 += notas2;
				}
				double somaFinal = somaTotal2 + somaTotal;
				System.out.println("a soma total dos dois alunos e de: " + new DecimalFormat("#,##.00").format(somaFinal));
		
		
		teclado.close();
	}
}
