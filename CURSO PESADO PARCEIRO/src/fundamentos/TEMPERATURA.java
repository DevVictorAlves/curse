package fundamentos;

public class TEMPERATURA {
	// (°F - 32) X 5/9 + °C
	public static void main(String[] args) {
		final double fator = 5.0/9.0;
		final double ajuste = 32;
		
		double fahrenheit = 52;
		double celsius = (fahrenheit - ajuste) * fator;
		System.out.println("o resultado da soma entre fahrenheit e celsius é equivalente a =" + celsius);
		
		fahrenheit = 200;
		celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("o resultado da soma entre fahrenheit e celsius é equivalente a =" + celsius);
		
			
		
	}

}
