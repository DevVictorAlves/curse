package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		String conceito = "";
		System.out.print("informe a nota: ");
		
		int nota = teclado.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
//		case 9: posso colocar abaixo do 10, ou ate msm na msm linha assim; acima.
//			conceito = "A";
		case 8: case 7:
			conceito = "B";
			break;
			
		case 6: 
		case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
			
		default:
			conceito = "nao informado";
		}
		
		System.out.println("conceito : " + conceito);

		
		
		
		String conceito1 = "";
		System.out.print("informe a nota: ");
		
		int nota1 = teclado.nextInt();
		
		switch(nota1) {
		case 10: case 9:
			conceito1 = "A";
			System.out.println("conceito é" + conceito1);
			break;
//		case 9: posso colocar abaixo do 10, ou ate msm na msm linha assim; acima.
//			conceito = "A";
		case 8: case 7:
			conceito1 = "B";
			System.out.println("conceito é" + conceito1);
			break;
			
		case 6: 
		case 5:
			conceito1 = "C";
			System.out.println("conceito é" + conceito1);
			break;
		case 4: case 3:
			conceito1 = "D";
			System.out.println("conceito é" + conceito1);
			break;
		case 2: case 1: case 0:
			conceito1 = "E";
			System.out.println("conceito é" + conceito1);
			break;
		
		default:
			conceito1 = "nao informado";
			System.out.println("conceito " + conceito1);
			
			
			
			teclado.close();
			
		}
		
	}
}
