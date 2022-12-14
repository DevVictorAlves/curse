package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		

		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.1288888888; //explicita (cast)
		
		
		System.out.println(b);
		int c = 127;
		byte d = (byte) c;		
		System.out.println(d);
		
		double u = 1.9999;
		int f = (int) u;
		
		System.out.println(f);
		
		
	}
}
