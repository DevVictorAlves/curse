package controle;

import java.util.Scanner;

public class DesafioIFwHile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double quantidadeDeNotas = 0;
		double soma = 0;
		double total = 0;
		
		while(soma != -1) {
			System.out.print("informe a nota: ");
			soma = teclado.nextDouble();
		 if(soma <=10 && soma >= 0 ) {
			total += soma;
			quantidadeDeNotas++;
		} else if(soma != -1) {
			System.out.println("nota invalida");
	  }
	}
		
	double somatotal = total / quantidadeDeNotas;
	
	System.out.println("a media é : " + somatotal);
	
	

		teclado.close();
	}
}
