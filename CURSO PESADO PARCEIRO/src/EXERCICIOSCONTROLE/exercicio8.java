package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		//8 - Criar um programa que receba uma palavra e imprime no console letra por letra.		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("insira uma palavra para separa-la: ");
		String valor1 = teclado.nextLine();
// char - caracter letras ''[]''?? o que signifca, ''toChardArray''??
		char letras[] = valor1.toCharArray();
		
		for(int i = 0; i < letras.length; i++) {
		
			System.out.println(letras[i]);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		teclado.close();
	
	}
}
