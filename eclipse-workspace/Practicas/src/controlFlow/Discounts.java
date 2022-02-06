package controlFlow;

import java.util.Scanner;

public class Discounts {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Ingresa tu edad?");
		Double edad = s.nextDouble();
		Double descuento;
		
		if ( edad >=60 ) {
			// Ejecutar declaración de bloque;}
			descuento = 7*.45;
			System.out.println("Debes pagar: "+ descuento +" euros");
			}
			else if(edad > 5 && edad<60) {
			// Ejecutar segunda declaración de bloque de condición;
				System.out.println("No aplicas a descuento, pagarás 7 euros");
			}else if(edad>=0 && edad <=5) {
			// Ejecutar segunda declaración de bloque de condición;
				descuento = 7*.40;
				System.out.println("Debes pagar: "+ descuento +" euros");
			}else{
			// Ejecutar otra declaración de bloque;
				System.out.println("No hay edades negativas");
			}
	}
}
