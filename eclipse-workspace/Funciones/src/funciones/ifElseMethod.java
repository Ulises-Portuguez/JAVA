package funciones;

import java.util.Scanner;

public class ifElseMethod {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int input = data.nextInt();
		acces(input);
	}
	
	static void acces(int age) {
		if(age<18) {
			System.out.println("Acceso denegado");
		} else {
			System.out.println("Acceso permitido");
		}
	}
}
