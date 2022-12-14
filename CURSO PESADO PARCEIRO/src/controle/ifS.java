package controle;

import java.util.Scanner;

public class ifS {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe a media");
		double media = teclado.nextDouble();
		
		if(media <= 10 && media >=7) {
			
			System.out.println("Aprovado");	
		
		System.out.println("Parabéns");
		
		}
		
		if(media < 7 && media >= 4.5) {
			
			System.out.println("recuperação");
				
		}
		
		//&& operação logica e", os dois tem que ser verdadeiro para prosseguir a operação...
		boolean criterioReprovação = media < 4.5 && media >= 0;
		if(criterioReprovação) {
			System.out.println("reprovado");
			
		}
		
		
		teclado.close();
		
		
	}
}

