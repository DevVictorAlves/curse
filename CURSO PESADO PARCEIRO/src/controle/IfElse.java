package controle;

import javax.swing.JOptionPane;

public class IfElse {

	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("informe um numero");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("numero par");	
		}
		if(numero % 2 == 1) {
			System.out.println("numero impar");
		}
		System.out.println(145 % 2);
		//else seria ao contrario de if''segue abaixo exemplo;
		
		if(numero % 2 == 0) {
			System.out.println("par");
     	} else {
			System.out.println("impar");
		}
		
	}
}
