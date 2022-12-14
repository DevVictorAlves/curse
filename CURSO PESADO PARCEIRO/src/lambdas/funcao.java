package lambdas;

import java.util.function.Function;

public class funcao {

	public static void main(String[] args) {
		
	Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";
	System.out.println(parOuImpar.apply(6));
	//parâmetros de entrada, fique de olho
	Function<String, String> oResultadoE = valor -> "O resulta é: " + valor;
	
	Function<String, String> empolgado = valor -> "empolgado!!! " + valor;
	
	Function<String, String> duvida = valor -> "???" + valor;
	
	//trabalhando com 2 lambdas "funcões"
	String resultadoFinal = 
			parOuImpar
			.andThen(oResultadoE)
			.andThen(empolgado)
			.apply(32);
	
	System.out.println(resultadoFinal);
	
	String resultadoFinal2 = 
			parOuImpar
			.andThen(duvida)
			.andThen(oResultadoE)
			.apply(32);
	
	System.out.println(resultadoFinal2);
	
	}
}
