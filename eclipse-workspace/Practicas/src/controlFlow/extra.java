package controlFlow;

import java.util.Scanner;

public class extra {

	public static void main(String[] args) {
		int edad=0;
		 int boletos=0;
		 Scanner teclado=new Scanner(System.in);
		 System.out.println("¿Cuántos boletos vas a comprar?:");
		 boletos=teclado.nextInt();
		double suma=0;
		 for(int i=0;i<boletos;i++)
		 {
			 System.out.println("¿Cuál es tu edad?:");
			 edad=teclado.nextInt();
			 double precio=7;
			 if ( edad>=5 && edad<60) {
					precio=precio;
					}
					else if( edad>=0 && edad<5) {
						precio-=precio*.6;
						
						
					} else if(edad>=60){
						precio-=precio*.55;
						
			}else {
				System.out.println("No esta dentro del rango");
			}
			 suma+=precio;

		 }
		 if(boletos>=2){
			 suma-=suma*.3;
			 System.out.println("el precio es: "+suma);
		 }else {
			 System.out.println("el precio es: "+suma);
		 }
	}

}
