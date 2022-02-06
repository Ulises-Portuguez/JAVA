package controlDeFlujo;
import java.util.Scanner;

public class condicionalIf {
	public static void main(String[] args) {
		//int age = 34;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		double age = s.nextDouble();
		
		if (age >= 18) {
			System.out.println("Eres mayor de edad"); // Ejecutar declaración de bloque;
			}
			else if( age>0 && age<18) {
			System.out.println("Eres menor de edad"); // Ejecutar segunda declaración de bloque de condición;
			} else{
			System.out.println("No pueden haber una edad negativa"); // Ejecutar otra declaración de bloque;
			}

	}
}
