package fundamentos.operadores;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 4);
		System.out.println(3 <= 4);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean bomcomportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomcomportamento && passouPorMedia;
		
		System.out.println("tem desconto\"?\" " + temDesconto);										
		
		
		
		
	}

}
