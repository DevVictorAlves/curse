package arrays;

import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		double[] notaAlunoA = new double[5];
		notaAlunoA[0] = 9.0;
		notaAlunoA[1] = 8.7;
		notaAlunoA[2] = 6.0;
		notaAlunoA[3] = 0.0;
		notaAlunoA[4] = 0.0;
		
		double notaFInal = 0;
		for(double a: notaAlunoA) {
			notaFInal += a;
		System.out.println(a);	
		}
		
		System.out.println();
		System.out.println(notaFInal + "\n");
		System.out.println(notaFInal / notaAlunoA.length + "\n");
		
		
		
		
		//
		
		
		
		
		String a = Arrays.toString(notaAlunoA);
		System.out.println(a);

		double notaFinal1 = 0;
		for(int i = 0; i < notaAlunoA.length; i ++) {
			notaFinal1 += notaAlunoA[i];
		}
		//ele irá armazena os valores na variável i 
		System.out.println(notaFinal1 / notaAlunoA.length);
		
		
		
		
		
		
		
		
		
		
	}
}
