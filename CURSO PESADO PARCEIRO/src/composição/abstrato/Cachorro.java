package composição.abstrato;

public class Cachorro extends Mamifero{
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
	public String mover() {
		return "usando as patas";
	}
}
