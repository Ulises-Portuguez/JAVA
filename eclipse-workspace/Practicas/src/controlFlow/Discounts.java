package controlFlow;

import java.util.Scanner;

public class Discounts {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�Ingresa tu edad?");
		Double edad = s.nextDouble();
		Double descuento;
		
		if ( edad >=60 ) {
			// Ejecutar declaraci�n de bloque;}
			descuento = 7*.45;
			System.out.println("Debes pagar: "+ descuento +" euros");
			}
			else if(edad > 5 && edad<60) {
			// Ejecutar segunda declaraci�n de bloque de condici�n;
				System.out.println("No aplicas a descuento, pagar�s 7 euros");
			}else if(edad>=0 && edad <=5) {
			// Ejecutar segunda declaraci�n de bloque de condici�n;
				descuento = 7*.40;
				System.out.println("Debes pagar: "+ descuento +" euros");
			}else{
			// Ejecutar otra declaraci�n de bloque;
				System.out.println("No hay edades negativas");
			}
	}
}
