package controlFlow;

import java.util.Scanner;

public class commission {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Cuánto vendió?");
		Double venta = s.nextDouble();
		Double comision;
		
		if ( venta >=10000 ) {
			// Ejecutar declaración de bloque;}
			comision = venta*.30;
			System.out.println("Tu comisión es de: "+ comision);
			}
			else if(venta >= 5001 && venta<10000) {
			// Ejecutar segunda declaración de bloque de condición;
				comision = venta*.20;
				System.out.println("Tu comisión es de: "+ comision);
			}else if(venta >= 1001 && venta<5001) {
			// Ejecutar segunda declaración de bloque de condición;
				comision = venta*.10;
				System.out.println("Tu comisión es de: "+ comision);
			}else if(venta>=0 && venta < 1001) {
			// Ejecutar segunda declaración de bloque de condición;
				System.out.println("No aplicas a comisión");
			}else{
			// Ejecutar otra declaración de bloque;
				System.out.println("No puedes tener ventas negativas");
			}
	}
	}

