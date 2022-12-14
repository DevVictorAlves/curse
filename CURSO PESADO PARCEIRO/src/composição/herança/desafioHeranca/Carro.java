package composição.herança.desafioHeranca;

public abstract class Carro {
	public final int VELOCIDADE_MAXIMA;
	protected int acelerar;
	protected int delta = 5;
	  
	 
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	public void frear() {
		if(acelerar > 0) {
			acelerar -= 10;
		}
		
	}
 	
	
	public void acelerar() {
		if(acelerar + getDelta() > VELOCIDADE_MAXIMA) {
			acelerar = VELOCIDADE_MAXIMA;
		}	else {
		acelerar += getDelta();
		}
	}
	
	
	public String toString() {
		return "velocidade atual é " + acelerar + " km/h";
	}


	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}

	
}
