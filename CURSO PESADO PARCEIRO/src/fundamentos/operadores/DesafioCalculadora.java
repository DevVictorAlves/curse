package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("CALCULADORA VITAO DO GRAU\n");
		 
		 System.out.print("insira o valor inicial:  ");
		 int num1 = teclado.nextInt();
		 
		 System.out.print("insira a operacao : ");
		 String operação = teclado.next();
		 
		 System.out.print("insira o segundo valor:  ");
		 int num2 = teclado.nextInt();
		 
		 //logica
		 int resultado = "+".equals(operação) ? num1 + num2 : 0;
		 resultado = "-".equals(operação) ? num1 - num2 : resultado;
		  resultado = "*".equals(operação) ? num1 * num2 : resultado;
		  resultado = "/".equals(operação) ? num1 / num2 : resultado;
		  resultado = "%".equals(operação) ? num1 % num2 : resultado;
		 
		 
		 System.out.printf("\n%d %s %d : %d ", num1, operação, num2, resultado);
		 
		 
		 
		 
		 
		 teclado.close();
		 
		 
		 
		 
		 
		 
		 
		 
	}
	 
	
	

	
	

}
