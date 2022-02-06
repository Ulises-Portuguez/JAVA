package Loops;

import java.util.Scanner;


public class ForLoop {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String str=teclado.nextLine();
		for(int i=0;i<str.length();i++) {
			char letra= str.charAt(i);
			System.out.println(letra);
		}
	}
}
