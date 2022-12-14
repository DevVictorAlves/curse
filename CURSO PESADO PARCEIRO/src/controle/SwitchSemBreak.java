package controle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {
		//if(bool) ...
		// while(bool)...
		// for(;bool; incremento...)
		// case sem o break, executa todos os codigos abaixo, com break o programa só executará o comando abaixo
		// Um exemplo seria case break "preta"; executaria, apenas o System.out.println("Sei algo..."):
	
		Scanner teclado = new Scanner(System.in);

		String faixa = teclado.next();
		
		switch(faixa.toLowerCase().toUpperCase().toLowerCase()) {
		case "preta":
		System.out.println("Sei o Bassai-Da...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("SeI O Yodan");
		case "laranja":
			System.out.println("Sei o Sandan");
		case "vermelha":
			System.out.println("Sei o Nidan");
		case "amarela":
			System.out.println("Sei o Shodan");
		
//			default:
//			System.out.println("nao sei nada");
		// nao faz sentido ter um default, pq ele fica abaixo, o programa executará tudo que esta abaixo do pedido, sem o break nao tem sentido nenhum.
		//abaixo com o break
			break;
			default:
				System.out.println("nao sei de nada");
		}
		teclado.close();
		
		int neymar = 2;
		
		switch(neymar) {
		case 1:
			System.out.println("ele vai destruir o atletico de madrid");
		case 2:
			System.out.println("como sempre o melhor");
		//	break;
			//default:
				
		case 3:
			System.out.println("neymar");
		}
		
		
		
		
	}
}
