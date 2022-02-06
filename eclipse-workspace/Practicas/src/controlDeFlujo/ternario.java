package controlDeFlujo;
import java.util.Scanner;

public class ternario {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		double age = s.nextDouble();
		
		//System.out.println(age>=18 ? age>= 150 ? "No admite valores mayores a 150": "Eres mayor de edad": age<0 ? "No acepta valores negativos" : "Eres menor de edad");
		
		System.out.println(age>=18 && age<=150 ? "Eres mayor de edad": age>0 && age < 18 ? "Eres menor de edad" : "Valor fuera de rango");

	}
}