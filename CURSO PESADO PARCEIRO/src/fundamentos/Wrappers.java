package fundamentos;

import java.util.Scanner;

public class Wrappers {
	
	public static void main(String[] args) {
		
	//	Scanner scan = new Scanner(System.in);
		
		
		//byte
		Byte b = 100;
		Short s = 1000;
	//   Integer.parseInt(scan.next());
		Integer i = 10000;
		Long l = 10000000L;
		
	    System.out.println(b.byteValue());
	    System.out.println(s.toString());
	    System.out.println(i);
	    

	    Boolean bo = Boolean.parseBoolean("true");
	    System.out.println(bo.toString().toUpperCase());
	    
	    Character c = 'a';
	    boolean ativo = true;
	    boolean abc = 5 > 3;
	    
	    System.out.println();
	    
	    
	    boolean verdade = 10 > 5;
	    


	    	
	    
	   System.out.println( "e verdade "); 
	   
	    
	   
	}

}
