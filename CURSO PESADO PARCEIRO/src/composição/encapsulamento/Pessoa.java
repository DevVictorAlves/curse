package composição.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
//ler
	public String getSobrenome() {
		return sobrenome;
	}
	
//alterar
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	//Getter
	public int getIdade() {
		return idade;
	}
	
	//Stter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		}
	}
	
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	
	@Override
	public String toString() {
	
		return "Olá sou " + getNome() + " e tenho " + getIdade() + " anos ";
	
	}	

}
