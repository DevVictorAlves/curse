package fundamentos.operadores;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
	
	public static void main(String[] args) {
		
		//Trablho na terça ( V ou F )... tv 50 tv 32 tomou sorvete ou ficou mais saudavel
		//Trabalho na quinta ( V ou F )
		
		boolean trabalho1 = true; //xor exclusivo
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		System.out.println("comprou tv de 50? " + comprouTV50);
		
		boolean comproTV32 = trabalho1 ^ trabalho2;
		System.out.println("comprouTV32?" + comproTV32);
		
		boolean tomouSorvete = trabalho1 ^ trabalho2;
		System.out.println("tomouSorvete?" + tomouSorvete);
		
		boolean ficouSaudavel = trabalho1 && trabalho2;
		System.out.println("ficou saudavel?" + ficouSaudavel);
		
		boolean comprouTV50ou32 = trabalho1 || trabalho2;
		System.out.println("comprou a tv?" + comprouTV50ou32);
		
		
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite verdadeiro: ".replace("verdadeiro", "true") );
		boolean trabalho3 = entrada.nextBoolean();
		
		System.out.print("digite o falso: " );
		boolean trabalho4 = entrada.nextBoolean();
		
		boolean trabalho = trabalho3 && trabalho4;
		boolean comprouTV32 = trabalho3 || trabalho4;
		boolean TomouSorvete = trabalho3 || trabalho4;
		boolean ComprouAlgumaTv = trabalho3 ^ trabalho4;
		boolean contradicao = !trabalho3;
		boolean vacilo = !trabalho;
		
		System.out.println("o individuo comprou a tv de 50? "+ !trabalho);
		
		System.out.println("o individuo comprou a tv de 32\"?\" " + comprouTV32);
		
		System.out.println("ComprouOPrometido? " + ComprouAlgumaTv);
			
		System.out.println("tomou sorvete? " + TomouSorvete);
		
		System.out.println("voce contrapos o que diz\"?\"" + contradicao);
		
	System.out.println("voce vacilou \"?\"" + vacilo);
	
	}

}
