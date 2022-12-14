	package fundamentos.operadores;

import java.util.Scanner;

public class imcDoUsuario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Imc Calculo");
		
		System.out.print("Insira seu peso : ");
		Float peso = (float) teclado.nextFloat();
		
		System.out.print("insira a altura : ");
		
		Float altura = teclado.nextFloat();
		
		Float somaT1 =  (float) Math.pow(altura, 2);
		
		Float somaT2 =  peso / somaT1;
		
		System.out.printf("\n a soma do imc do individuo e : %.4f ", (float)somaT2);
		
		teclado.close();
		
		
		
	}
}
