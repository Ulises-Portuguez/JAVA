package Loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j =1;
		int z = 0;
		Scanner console = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        int cont = 0;
		do {
			z = i + j;
			System.out.println(z);
			i = j;
			j = z;
			cont++;
		}
		
		while (cont<num);
	}

}
