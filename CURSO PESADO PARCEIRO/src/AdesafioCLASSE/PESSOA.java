package AdesafioCLASSE;

public class PESSOA {

	String nome;
	double peso;

	PESSOA(){
		
	}
	
	PESSOA(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	void comer (COMIDA comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}

	}
	String apresentar() {
		return "Ola eu sou o " +  nome + " e tenho " + peso + " kgs ";
	}
	
}
