package MyFirstVariableNaming;
import java.util.Scanner;

public class MyFirstVariableNaming {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		   System.out.println("Please enter your name ");
		   String name = s.next();
		   
		   System.out.println("Please enter your genre ");
		   String genre = s.next();
		   
		   System.out.println("Please enter your job preference ");
		   String job = s.next();
		   
		   System.out.println("Please enter your nationality ");
		   String nationality = s.next();
		   
		   System.out.println("Please enter your blood type ");
		   String blood = s.next();
		   
		   Scanner i = new Scanner(System.in);
		   System.out.println("Please enter your age ");
		   int age = i.nextInt();
		   
		   int year = 2022-age; 
		   
		   System.out.println("My name is "+ name);
		   System.out.println("My age is "+ age);
		   System.out.println("My genre is "+ genre);
		   System.out.println("My job is "+ job);
		   System.out.println("My nacionality is "+ nationality);
		   System.out.println("My type blood is "+ blood);
		   System.out.println("My born year is "+ year);
		  
	}

}

