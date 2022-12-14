package classe;

public class ValorNull {

	public static void main(String[] args) {
		
		String a = "";
		System.out.println(a.concat("!!!"));

		DaTa d1 = Math.random() > 0.5 ? new DaTa() : null;

		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.dataFormatada());
			
		}
		
		String a2 = Math.random() > 0.5 ? "neymar?" : null;
		if (a2 != null) {
			System.out.println(a2.concat("???"));
		}
	
	
	
	}
}
