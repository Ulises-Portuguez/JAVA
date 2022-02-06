package eje;

import java.util.Scanner;

public class nombres {

	public static void main(String[] args) {
		Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );

	}

    private static void printNameLength( String name )
    {
      int s = name.length();
      System.out.println("La longitud de tu nombre es de: "+ s);
    }

    private static void printNameCharacters( String name )
    {
    	for(int i=0;i<name.length();i++) {
    		char letter= name.charAt(i);
    		System.out.println(letter);
    	}
    }

}
