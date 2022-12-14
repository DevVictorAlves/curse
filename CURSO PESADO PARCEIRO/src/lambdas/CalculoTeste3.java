package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// não, int -> Double 
		//Double a = 1;
		
		//sim, double -> Double
		//Double a = 1.0;
		// função lambda
		
       
		BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
		
		System.out.println(calculo.apply(3.0, 2.0));
		
		calculo = (x, y)-> {return x * y; };
		//ou calculo = (x, y)-> x * y;
	
//		Calculo multi = new multiplicar();
//		multi.executar(1, 2);
		
		
		System.out.println(calculo.apply(7.0, 9.0));
		
	BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; };
		
		System.out.println(calculo2.apply(3, 3));
		
		calculo = (x, y)-> x * y;
		
		System.out.println(calculo2.apply(7, 9));
		
			
	}
}
