package fundamentos.operadores;

import java.util.Scanner;

public class CelsiusPFahereint {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("conversao de celsius para fahreint\n");
		System.out.print("digite o numero de celsius para converte para fahreint : ");
		float Celsius = teclado.nextFloat();
		
		float somatotal  = Celsius * 1.8F + 32;
		
	
		System.out.printf("\n o resultado de Celsius P Fahreint e %.1f", somatotal);
		
		
		
		
	}
}
