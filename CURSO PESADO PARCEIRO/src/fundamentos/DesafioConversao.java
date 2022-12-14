package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Aqui inseri a primeira nota do aluno:  ");
		String valor1 = teclado.next().replace(",", ".");
		
		System.out.print("Aqui inseri a segunda nota do aluno:  ");
		String valor2 = teclado.next().replace(",", ".");
				
		System.out.print("Aqui inseri a terceira nota do aluno:  ");
		String valor3 = teclado.next().replace(",", ".");
		
		System.out.print("Aqui inseri a quarta nota do aluno:  ");
		String valor4 = teclado.next().replace(",", ".");
		
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double num3 = Double.parseDouble(valor3);
		double num4 = Double.parseDouble(valor4);
		
		double soma = (num1 + num2 + num3 + num4) / 3;
				System.out.printf("a soma total da media do aluno e: %s  ", soma);
		
		
		teclado.close();
		
		
		
		
		
		
		
		
			
	
		
		
		
		
		
		
		
		
	}
	

}
