package controle;

import java.util.Scanner;

public class DOWHILE {

	public static void main(String[] args) {
		// if(...) setença: ou {}
		// while(...) setença; ou {}
		// for(...; ...; ...) setença ou {}
		
		// do {} while (...);
		
		Scanner teclado = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("pague o aluguel");
			System.out.println("quer sair?");
			texto = teclado.nextLine();
	} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("obrigado");
		
		teclado.close();
	}
}

