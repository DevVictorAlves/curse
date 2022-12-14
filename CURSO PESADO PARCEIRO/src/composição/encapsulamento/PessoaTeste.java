package composição.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
	Pessoa p1 = new Pessoa("João","Alves", -30);
	p1.setIdade(-30); //alterar o valor da variável
	
	System.out.println(p1.getIdade()); //ler
	System.out.println(p1.toString());
	System.out.println(p1.getNomeCompleto()); //ler nome completo
	
	
	}
}
