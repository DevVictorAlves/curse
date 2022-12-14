package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
	
		//informação do funcionário
		
		//tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 568789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos uméricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo boleano
		boolean estaDeFerias = false; // true
				
				//tipo caractere
				char status = 'A'; // ativo
				
				//dia de empresa
				System.out.println(anosDeEmpresa * 365);
				
				//numero de viagens
				System.out.println(numeroDeVoos / 2);
				
				//Pontos por real 
				 System.out.println(pontosAcumulados / vendasAcumuladas);
				 
				 System.out.println(id  +  ": ganha --> " +  salario);
				 
				 System.out.println("Ferias? " + estaDeFerias);
				 
				 System.out.println("status = " + status);
	}

}

