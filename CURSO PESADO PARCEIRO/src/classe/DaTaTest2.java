package classe;

public class DaTaTest2 {

	public static void main(String[] args) {
		// aqui sao as instancias (objeto) criada atraves do construtor 
		DaTa d1 = new DaTa(2,10,700);//defini o construtor para recer dia, mes ,ano na classe molde, ou seja na classe onde estao presentes os membros
		d1.imprimirDataFormatada();
		//da pra modificard1.dia = 10;
		//d1.dia = 2;
	    //d1.ano = 1999;
		//d1.mes = 10;
		
	//posso usar a inferência, ou seja ''var''
	// alem do mais eu acesso os membros ou seja, para acessar uma classe dentro de outra eu uso o "."
		var d2 = new DaTa();
		d2.ano = 1990;
	//	d2.dia = 1; criei o padrao na classe molde ou seja DaTa
	//	d2.mes = 1;
	//	d2.ano = 1970;
		//data formatada recebe o membro atrves do construtor la em cima DaTa d1 = new (construtor) DaTa(); mesmo q n tenha paramentro coloque-o
		//acesso atraves do construtor os membros da classe
		//ou seja seus atributos ou metodos e tbm posso dar informações para o construtor
		String dataFormatada = d1.dataFormatada();
		//usando o metodo abaixo, sem precisa ligar os membros dentro do system.ou.println, pq ja liguei no metodo dataformatada
		System.out.println(dataFormatada);

		//usando o  construtor d2, mas ligando os membros dentro do system.out.println, sem o uso do metodo
		System.out.printf("\n%d/%d/%d", d2.dia,	 d2.mes, d2.ano);
		//tbm usnado o dataFormatada
		System.out.println(d2.dataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada2();
		TESTE t1 = new TESTE("broonkly", "gay");
		System.out.println(t1);
	}
	
}
