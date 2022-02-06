package funciones;

import java.util.Scanner;

public class Calculadora {
	static double suma(double a, double b) {
		return a + b;
	}
	static double resta(double a, double b) {
		return a - b;
	}
	static double multiplicacion(double a, double b) {
		return a * b;
	}
	static double division(double a, double b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		double x = s1.nextDouble();
		System.out.println("Introduce el primer número: ");
		double y = s1.nextDouble();
		
		//double s = suma(x,y); //Se puede agregar la funcion a una variable
		//double r = resta(x,y);
		
		System.out.println("La suma es: "+suma(x,y));
		System.out.println("La resta es: "+resta(x,y));
		System.out.println("La multiplicacion es: "+multiplicacion(x,y));
		System.out.println("La division es: "+division(x,y));
	}
	
	
}
