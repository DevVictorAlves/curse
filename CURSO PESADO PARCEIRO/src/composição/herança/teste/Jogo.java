package composição.herança.teste;

import composição.herança.Heroi;
import composição.herança.direcao;
import composição.herança.monstro;

public class Jogo {

	public static void main(String[] args) {
		//se quiser coloca jogador como instância, tbm é possível
		//o jogador é uma classe mais genérica, já o monstro e heroi
		//ficam mais específicas
		
		monstro monstro = new monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10,1);
		heroi.x = 10;
		heroi.y = 11;
		
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("O heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		//crtl + shift + c para comentar linha
		monstro.andar(direcao.NORTE);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);	
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("O heroi tem => " + heroi.vida);
		
	}
}
