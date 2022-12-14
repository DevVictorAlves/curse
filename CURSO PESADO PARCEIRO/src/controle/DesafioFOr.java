package controle;


public class DesafioFOr {

	public static void main(String[] args) {
	
		
		for(Integer valor1 = 1000; valor1 <= 10; valor1++ ) {
			valor1.toString();
			System.out.println(valor1);
		
		} 
		
		//nao pode usar o valor numerico
		for(String v = "#"; !v.equals("#######"); v += "#") {
			
			System.out.println(v);
		}
		
		String valor2 = "Oi";
		for(int valor1 = 1; valor1 <= 5; valor1++) {
			System.out.println(valor2);
			valor2 += "Oi";
		}
	}
}
