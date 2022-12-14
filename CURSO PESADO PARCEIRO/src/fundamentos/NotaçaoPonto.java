package fundamentos;

public class NotaçaoPonto {
		
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "senhora");
		s = s.concat("!!!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "bom dia x".replace("x", "gui");
			System.out.println(y);
			
			
	}

}
