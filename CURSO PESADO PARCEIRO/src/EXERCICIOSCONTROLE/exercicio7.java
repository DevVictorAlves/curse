package EXERCICIOSCONTROLE;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		
		while(numero >= 0) {
		    System.out.print("\ndigite um numero positivo (menos fcha o programa): ");
		    numero = teclado.nextInt();
		if(numero >= 0){
			soma += numero;
			System.out.printf("seu numero e positivo... %d", soma);
		}
		//detalhe fica atendo aos fechamneo da chave, errei por causa disso, lembre-se delas {while{----if(){}----}}

		}
		
		teclado.close();
		} 
		
		
		
		
	}

