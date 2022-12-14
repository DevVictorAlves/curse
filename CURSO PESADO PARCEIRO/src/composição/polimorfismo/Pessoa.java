package composição.polimorfismo;

public class Pessoa {

	private double Peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.Peso += comida.getPeso();
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
