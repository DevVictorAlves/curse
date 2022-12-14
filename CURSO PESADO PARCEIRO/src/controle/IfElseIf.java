package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		double nota = teclado.nextDouble();
		if(nota > 10 || nota < 0) {
			System.out.println("nota invalida");
		} else 
		if(nota >= 8.1) {
			System.out.println("conceit A");
		} else 
		if(nota >= 6.1) {
			System.out.println("conceito b");
		} else
		if(nota >= 4.1) {
			System.out.println("conceito c");
		} else if(nota >= 2.1) {
			System.out.println("coneito d");
		} else if(nota >= 0 || nota >= 1.1) {
			 System.out.println("neymar bate o penal");
}
			
		
		
		
		
		System.out.println("fim!");
		teclado.close();
		
		} 
	}

