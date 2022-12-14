package composição.polimorfismo;

public abstract class Comida {

	private double Peso;

	public Comida(double peso) {
		setPeso(peso);
	}
	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
		Peso = peso;
		}
	}
}
