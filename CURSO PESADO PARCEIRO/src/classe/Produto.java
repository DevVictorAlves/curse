package classe;

public class Produto {
	
	String nome;
	double preco;
	static  double desconto = 0.25;
	///quando vc coloca static esta dizendo que este atributo pertence a classe
			
	
	Produto(String nomeIncial, double precoInicial){
		nome = nomeIncial;
		preco = precoInicial;

	}				
	Produto(){
		
	}
	//construtor nao possui antes do nome da classe ou variavel void, nem retorno etc
	
	//ja o metodo pode ter void e tbm pode ter static que significa q ele pertence a classe
	//pra acessa um metodo sem o metodo man pra chamar um metodo e necessario um static 
	//
	float precoComDesconto () {
		return (float) (preco * ( 1 - desconto ));
	}
		double precoComDesconto (Double descontoGerente) {
			return preco * ( 1 - desconto + descontoGerente);
	}
		
		
}
