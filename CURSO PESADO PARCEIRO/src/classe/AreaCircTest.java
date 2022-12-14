package classe;

public class AreaCircTest {

	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		//a1.pi = 10;
	
		AreaCirc a2 = new AreaCirc(5);
		a1.raio = 100;

		//a2.pi = 5;
	    //posso acessar atraves da classe AreaCircuferência
		//AreaCirc.PI = 3.1415; nao da pra mudar quando coloca final static
		System.out.println(a1.areaCirc());
		//AreaCirc.Pi = 3.1555
		System.out.println(a2.areaCirc());
		//mas da pra acessar o valor do pi atraves do system.out.println
		System.out.println(Math.PI);
		System.out.println(AreaCirc.PI);
		System.out.println(AreaCirc.areaCirc(100));
	}
	
}
