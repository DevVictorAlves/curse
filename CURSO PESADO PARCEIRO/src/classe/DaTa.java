package classe;

public class DaTa {
// atributos ou seja as caracteristicas 
	int dia;
	int mes;
	int ano;
	
	//assim como o metodo um construtor tbm pode ter parametros e sequencias de passos dentro dele pegando
	//sempre os objetos ate mesmo fora dentro, mas dentro da classe
	//so nao obtem tipo, exemplo void'', string, pq ele n retorna nada
	DaTa(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970);
		
		// byte, short, int, long -> 0
		//float, doube -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// objeto -> null

		
	}
	DaTa(int dia, final int mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	
	
//melhor metodo abaixo
    String dataFormatada() {
    	String formato = "\n%d/%d/%d";
		return String.format(formato, dia, mes,ano);
	}
    //void e adicionado quando nao haver nada dentre 
   void imprimirDataFormatada(){
    	System.out.printf("%d/%d/%d", this.dia , mes , ano);
    }
   void imprimirDataFormatada2(){
   	System.out.printf(this.dataFormatada());
   }
   //static void imprimirDaTa() {
	  //nao vale pos o this'' so vale para metodos de instancia this.dia = 3;
   //}
   
}
