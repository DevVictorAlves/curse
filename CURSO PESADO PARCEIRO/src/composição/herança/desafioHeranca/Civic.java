package composição.herança.desafioHeranca;

public class Civic extends Carro {

	public Civic(){
		this(200);
	}
	public Civic(int velocidademaxima){
		super(velocidademaxima);
		setDelta(15);
		
	}
 
	


	/*
	 * void acelerar() { super.acelerar += 7;
	 * 
	 * }
	 */
}

