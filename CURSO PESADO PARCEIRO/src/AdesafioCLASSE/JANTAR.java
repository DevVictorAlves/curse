package AdesafioCLASSE;


public class JANTAR {

	public static void main(String[] args) {
		COMIDA c1 = new COMIDA("arroz", 0.200);
		COMIDA c2 = new COMIDA("feijao", 0.300);
		
		PESSOA p = new PESSOA("joao", 99.8);
		System.out.println(p.apresentar());
	
		p.comer(c1);
	System.out.println(p.apresentar());
	PESSOA p2 = new PESSOA("victor", 66.9);
	System.out.println(p2.apresentar());
	p2.comer(c2);
	System.out.println(p2.apresentar());
	System.out.println("\n\n");
	

	}
}
