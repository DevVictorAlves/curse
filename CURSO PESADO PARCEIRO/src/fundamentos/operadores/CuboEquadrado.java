package fundamentos.operadores;

import java.util.Scanner;

public class CuboEquadrado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("insira o primeiro numero: ");
		double num1 = teclado.nextDouble();
		
		
		double qDrado =  Math.pow(num1, 2);
		
		double cubo = Math.pow(num1, 3);
		
		System.out.printf("o valor ao quadrado e:  %.2f \no valor ao cubo e:  %.2f", qDrado, cubo);
	
		
		
		
		
	}
	
}
