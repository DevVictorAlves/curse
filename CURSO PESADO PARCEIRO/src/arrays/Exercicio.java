package arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		//tipo array
		double[]notaAluno = new double[4];
		System.out.println(Arrays.toString(notaAluno));
		
		notaAluno [0] = 9.0;
		notaAluno [2] = 7.0;
		notaAluno [1] = 10.0;
		notaAluno [3] = 10.0;

		String a = Arrays.toString(notaAluno);
		System.out.println(a);
		//vai dar erro quando...
		//System.out.println(notaAluno[6]);
	//	double[] jp = new double[3];
		//double[] ney = new double["tem q coloca o numero de arrays aqui, senao, nao inicia" ];
		double totalAlunoA = 0;
		for(int i = 0; i < notaAluno.length; i++) {
			totalAlunoA += notaAluno[i];
			
		}
	System.out.println("1 caso " + totalAlunoA / notaAluno.length + "\n");
	
	
	
	
	
	//posso passar o valor das notas diretamente no array atraves do {}
	final double notaArmazenada = 5.9;
	double[] notaAlunoB = {1.0, 2.0, notaArmazenada, 10.0};
	
	double totalAlunoB = 0;
	for(int b = 0;  b < notaAlunoB.length; b++) {
		totalAlunoB += notaAlunoB[b];
	}
	totalAlunoB /= notaAlunoB.length;
	System.out.println("2 caso " + new DecimalFormat("#,##.00").format(totalAlunoB));
	
	System.out.println(notaAlunoB[3]);
	
	
	
	
	
	}
}
