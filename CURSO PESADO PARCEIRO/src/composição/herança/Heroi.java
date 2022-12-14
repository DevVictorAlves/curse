package composição.herança;

public class Heroi extends jogador{
	
	//extends usa para herança para herda características
	public Heroi(int x, int y){
		super(x,y);
	}
	
	public boolean atacar(jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		
		return ataque1 || ataque2 || ataque3;
	}
}
