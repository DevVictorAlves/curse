package fundamentos.operadores;

import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("insira a base do triangulo: ");
		double b = teclado.nextDouble();
		
		System.out.print("insira a altura do triangulo: ");
		double h = teclado.nextDouble();
		
		double somatotal = (b * h) / 2 ;
		
		System.out.println("a area do triangulo e igual ha:  " + somatotal);
		teclado.close();
		
		
		
		
		
		
		
	}
	
	
}
