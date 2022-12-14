package fundamentos.operadores;

public class TERNARIOS {

	public static void main(String[] args)  {
		double media = 4.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultado =  media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("o aluno esta " + resultado );
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passoupormedia = nota >= 7;
		boolean temdesconto = bomComportamento && passoupormedia;
		String resultadofinal = temdesconto? "sim" : "nao";
		
		System.out.printf("o aluno passou w  %s" , resultadofinal  );
	}
	
	
}
