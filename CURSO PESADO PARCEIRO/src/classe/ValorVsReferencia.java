package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
	int a = 2;
	int b = a;
	//atribuição valor (tipo primitivo)
	a++; 
	//atribuição de valor quando uma variavel recebe o valor de outra variavel
	//ela faz uma copia no entanto se eu subtrair o valor de a; nao muda o valor de b
	//ou seja e uma copia, diferentemente quando se trabalha com objeto que sao valores referenciais
	//ou seja, um mexe com o outro
	b--;
	System.out.println(a + " " + b);
	
	DaTa d1 = new DaTa();
	DaTa d2 = d1; // atribuição referência (objeto)
	
	d1.ano = 1000;
	d2.ano = 2000;
	
	System.out.println(d1.ano + "  " + d2.ano);
	System.out.println(d1.dataFormatada() + " " + d2.dataFormatada());

	voltarDataParaValorPadrao(d2);
//alteirei o valor do dia, mes, ano, ao chamar o metodo voltarDATA..
	//
	System.out.println(d1.dataFormatada() + " " +  d2.dataFormatada());
	
	int c = 5;
	alterarPrimitivo(c);
	System.out.println(c);
	
	}
	static void voltarDataParaValorPadrao(DaTa d) {
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
	
}