package composição;

public class Carro {

	final Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}
	void acelerar() {
		if(motor.fatorInjeção < 2.6) {
			motor.fatorInjeção += 0.4;			
		}
	}
	
	void frear() {
		if(motor.fatorInjeção > 0.5) {
			motor.fatorInjeção -= 0.4;
			}
	}
	
	void ligar() {
		motor.ligado = true;
		
	}

	void desligar() {
		motor.ligado = false;
	}
	boolean estarLigado() {
		return motor.ligado;
	}
}
