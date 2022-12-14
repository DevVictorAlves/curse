package controle;

import java.util.Scanner;

public class WHILE2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
	
		String letra = "";
		
		while(!letra.equalsIgnoreCase("sair")) {
			System.out.println("neymar");
			letra = teclado.next();
		
		}
		
		
		
		String neymar = "";
		while(neymar.equalsIgnoreCase("MESSI")) {
			System.out.print("messi?: ");
			neymar = teclado.next();
	
		}
		teclado.close();
	}
	
}
