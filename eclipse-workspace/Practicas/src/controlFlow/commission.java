package controlFlow;

import java.util.Scanner;

public class commission {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�Cu�nto vendi�?");
		Double venta = s.nextDouble();
		Double comision;
		
		if ( venta >=10000 ) {
			// Ejecutar declaraci�n de bloque;}
			comision = venta*.30;
			System.out.println("Tu comisi�n es de: "+ comision);
			}
			else if(venta >= 5001 && venta<10000) {
			// Ejecutar segunda declaraci�n de bloque de condici�n;
				comision = venta*.20;
				System.out.println("Tu comisi�n es de: "+ comision);
			}else if(venta >= 1001 && venta<5001) {
			// Ejecutar segunda declaraci�n de bloque de condici�n;
				comision = venta*.10;
				System.out.println("Tu comisi�n es de: "+ comision);
			}else if(venta>=0 && venta < 1001) {
			// Ejecutar segunda declaraci�n de bloque de condici�n;
				System.out.println("No aplicas a comisi�n");
			}else{
			// Ejecutar otra declaraci�n de bloque;
				System.out.println("No puedes tener ventas negativas");
			}
	}
	}

