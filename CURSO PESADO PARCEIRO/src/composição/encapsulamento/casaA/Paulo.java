package composição.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	void testeAcesso() {
//		SYSTEM.OUT.PRINTLN(ESPOSA.SEGREDO);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);

	}
}
