package fundamentos;

public class DesafioAritmeticosDOIS {

	public static void main(String[] args) {
		int superiorA = (int )Math.pow(6* (3 + 2), 2);
		int denA = 10 * 2;
		
		int superiorB = (1 - 5) * (2 - 7);
		int denB = 2;
		
		int superiorAA = superiorA / denA;
		int superiorBB = (int) Math.pow(superiorB / denB, 2);
		
		
		int superior = (int) Math.pow(superiorAA - superiorBB, 3);
		int inferior = (int) Math.pow(10, 3);
		
		int somatotal = superior / inferior;
		System.out.println("numero inserido totaliza, então:  " + somatotal);
		

		

		
		
		
	}
}
