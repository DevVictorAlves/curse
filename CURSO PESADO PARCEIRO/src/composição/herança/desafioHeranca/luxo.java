package composição.herança.desafioHeranca;

public interface luxo {

	void ligarAr();
	void desligarAr();
	default int velocidadeDoAr() {
		return 1;
	}
}
