package arrays;

import java.util.Scanner;

public class TamanhoDeUmArray {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("insira a quantidade do tamanho que ira inserir");
		int receptor = teclado.nextInt();
		
		double[] array2 = new double[receptor];
		double tamanho = array2.length;
		
		if(tamanho < 8) {
			System.out.println("O numero é menor que 8" );
		} else
		if(tamanho > 8) {
			System.out.println("o numero é maior que 8");
		} else {
			System.out.println("o numero é igual a 8");
		}
		
		
		teclado.close();
		
		
	}
}
