package Coleções;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		//offer e add -> adicionam elementos na fila
		// diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lança uma exceção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafael");
		fila.offer("Gui");
		
		// Peek e Element -> obter próximo elemento
		// da fila (sem remover)
		// diferença é o comportamento equando a fila está vazia!
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
	
		// fila.size()
		// fila.clear()
		
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll( ));
		System.out.println(fila.poll( ));
		System.out.println(fila.remove()); // lança uma exceção
		
		//fila.contains(...)
		//fila. ratainAll()
	}
}
