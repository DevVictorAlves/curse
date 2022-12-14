package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        //pela logica, fazemos primeiro a quantidade de arrays que queremos, como vao ser um dentro de outro, fazemos entao um dentro de outro
		System.out.println("Quantos alunos? ");
		int qtdAluno = teclado.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = teclado.nextInt();
		
		double[][] notasDaTurma = new double [qtdAluno][qtdNotas];
		double total = 0;
		//alunos --_
		for(int a = 0; a < notasDaTurma.length; a++) {
			//notas dos alunos
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf("informe a nota %d do aluno %d: ", n + 1, a + 1);
			notasDaTurma[a][n] = teclado.nextDouble();
			total += notasDaTurma[a][n];
			}
		}
		for(double[] notasDosAlunos: notasDaTurma) {
			// para percorrer as notas usando o for com: PARA PERCORRER O ARRAY CRIADO=, SEJA ELE UMA MATRIZ OU UM ARRAY UNICO, TENDO VARIAS FACES
			System.out.println(Arrays.toString(notasDosAlunos));
		}
		
		//somamos a media com *, ate pq 2 x 5 = 10 entao vai da certinho com o tamnho dos dois arrays
		double media = total / (qtdAluno * qtdNotas);
		System.out.println(media);
		//System.out.println(Arrays.toString(notasDaTurma)); deu errado pq tem que criar um laço para percorrer as notas
		teclado.close();
		
		
		//o tutorial acima reflete em...
		
	}
}
