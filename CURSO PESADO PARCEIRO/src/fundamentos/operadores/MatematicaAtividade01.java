package fundamentos.operadores;

import java.util.Scanner;

public class MatematicaAtividade01 {

	public static void main(String[] args) {
		// 0,5 64 cm³
		// area total = 2ab+2bc+2ac
		//volume v = a*b*c
		//area da base = a*b
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("0,5 * 0,5 * q * 0,5 * q² = 64");
		double area = teclado.nextDouble();
		double base = teclado.nextDouble();
		double c = teclado.nextDouble();
		double a = Math.pow(c, 2);
		
		double areatotal = area * area * 1 * area * a;
		
				System.out.println(areatotal);
		
		
		

		teclado.close();
		
	}
}
