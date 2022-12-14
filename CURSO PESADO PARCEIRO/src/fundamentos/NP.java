package fundamentos;

public class NP {
	
	public static void main(String[] args) {
		
		String s = "bom dia";
		s = s.toUpperCase();
		s = s.replaceFirst("dia", "neymar king of");
		
		System.out.println(s);
		String m = "neymar king of football".toUpperCase();
		System.out.println(m);
		System.out.println("leo".toUpperCase());
		
	}

}
