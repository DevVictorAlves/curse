package classe;

public class AreaCirc {
//raio ao quadrado
	double raio;
	static final double PI = 3.14;
	
	 AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	 
	 double areaCirc() {
		 return PI * (Math.pow(raio, 2));
	 }
	 
	 static double areaCirc(double raio) {
		 return PI * (Math.pow(raio, 2));
		 
	 }
}
