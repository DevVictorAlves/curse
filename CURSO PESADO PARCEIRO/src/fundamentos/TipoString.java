package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
System.out.println("Olá pessoal".charAt(2));
		
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!!"));
		
		System.out.println(s + "!!!");
		
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		System.out.println(s.length());
		

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		
		System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome + "\n idade: " + idade + "\nsalario: " + salario );
		
		
		
		System.out.printf("o senhor %s %s tem %d de idade e recebe R$ %.2f. ", nome, sobrenome, idade, salario);
		
		
		String frase = String.format("\no senhor %s %s tem %d de idade e recebe R$ %.2f. ", nome, sobrenome, idade, salario);
		
		System.out.println(frase); 
		
		String maisUmaFrase = "o senhor " + nome + " " + sobrenome + " tem " + " idade " 
		+ idade + " de idade" + " e recebe R$ " + salario + " de salario";
		
		System.out.println(maisUmaFrase);
		
		
		System.out.printf("\no senhor %s %s tem %d de idade  e recebe R$ %.2f. \n", nome, sobrenome, idade, salario);
		
		
 System.out.println("qualer uma".contains("neymar"));
		
		
	}
	

}
