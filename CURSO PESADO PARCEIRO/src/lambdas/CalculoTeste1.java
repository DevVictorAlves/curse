package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(3, 2));

		Calculo multiplicacao = new multiplicar();
		System.out.println(multiplicacao.executar(2, 2));
	}
}
