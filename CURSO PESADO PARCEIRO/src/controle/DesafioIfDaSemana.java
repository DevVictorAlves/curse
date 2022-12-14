package controle;

import java.util.Scanner;

public class DesafioIfDaSemana {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		   System.out.print("digite o nome do dia: ");
	
		   String dia = teclado.next();

		       if(dia.equalsIgnoreCase("domingo")) {
			   System.out.println("1");
		   } else 
			   if("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			   System.out.println("2");
		   } else 
			   if(dia.equalsIgnoreCase("terça")) {
			   System.out.println("3");
		   } else
			   if(dia.equalsIgnoreCase("quarta")) {
			   System.out.println("4");
		   } else
			   if(dia.equalsIgnoreCase("quinta")) {
			   System.out.println("5");
		   } else
			   if(dia.equalsIgnoreCase("sexta")) {
			   System.out.println("6");
		   } else
			   if(dia.equalsIgnoreCase("sabado")) {
			   System.out.println("7");
		   } else {
			   System.out.println("dia inválido");
		   }
				   
		   teclado.close();
	}
}
