package composição.herança.teste;

import composição.herança.desafioHeranca.Carro;
import composição.herança.desafioHeranca.Civic;
import composição.herança.desafioHeranca.ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		ferrari ferrari1 = new ferrari(400);
		
		
		
		

	    ferrari1.ligarTurbo();
	    ferrari1.acelerar();
	    System.out.println("Atual nível do ar é " + ferrari1.velocidadeDoAr());
	
		System.out.println(ferrari1);
		
		Carro Civic1 = new Civic();
		Civic1.acelerar();

		System.out.println(Civic1);
	}
}
