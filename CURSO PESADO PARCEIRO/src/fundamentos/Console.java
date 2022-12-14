package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		
		System.out.print("bom");
		System.out.println("dia");
		System.out.print("bom");
		System.out.print("dia\n\n\n");
		System.out.printf("mega sena %d %d %d %d %n", 1, 2, 3, 4);
		System.out.printf("\nsalario %.1f%n", 1234.5878);
		System.out.printf("Nome: %s%n", "joao");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome:");
		
		String nome = entrada.nextLine().replace(",", ".");
	
		
		System.out.print("Digite o seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite o sua idade:");
		
		int idade = entrada.nextInt();
		
		System.out.printf("\n\n %s %s tem %d de anos.", nome, sobrenome, idade);
		
		
		
		entrada.close();
		
	}
}
