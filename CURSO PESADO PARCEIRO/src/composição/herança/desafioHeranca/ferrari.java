package composição.herança.desafioHeranca;

public class ferrari extends Carro implements Esportivo, luxo{

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public ferrari(){
	this(400);
	}
	
	public ferrari(int velocidademaxima){
		super(velocidademaxima);
		setDelta(17);
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	public void ligarAr() {
		ligarAr = true;
	}
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
		return 35;
		} else if(ligarTurbo && ligarAr){
			
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 17;
		} else {
			return 17;
		}

	}
}
