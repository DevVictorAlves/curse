package fundamentos.operadores;

import java.util.Scanner;

public class Operacao2grau {

	public static void main(String[] args) {
		
		System.out.println("operacao 2 grau  (ax2 + bx + c = 0)");
		//Use como exemplo a = 1, b = 12 e c = -13
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de \"a\" :  ");
		
		double a = teclado.nextDouble();
		System.out.print("\n Digite o valor de \"b\" :  ");
		double b = teclado.nextDouble();
		
		System.out.print("\n digite o valor de \"c\" :  ");
		double c = teclado.nextDouble();
		
		double delta1 = Math.pow(b, 2);
		
		double delta =  delta1 - (4 *a *c);
		
		System.out.printf("\nsua equacao e %.2f² + %.2f + %.2f = 0" ,a , b , c);
		System.out.println("\n\no delta e : " + delta);
		
		
		double x1 = - b + Math.sqrt(delta) / (2 * a);
		System.out.println("\no valor de x1 e : " + x1);
		
		double x2 = - b - Math.sqrt(delta) / (2 * a);
		System.out.println("\no valor de x2 e : " + x2);
		
		teclado.close();
		
		
		
				
		
		
		
	}
}
