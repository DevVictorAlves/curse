package composição.herança;

public class monstro extends jogador{

	public monstro(){
		this(0,0);
	}
	public monstro(int x, int y){
		super(x, y);
	}
	//extends é uma herança, quando uma classe herda características de outra
}
