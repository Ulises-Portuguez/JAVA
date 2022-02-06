package git;
import java.util.Scanner;

public class YourWeight {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		   System.out.println("Please enter your weight in kilograms ");
		   double str1 = s.nextDouble();
		   System.out.println("Please enter your height in meters ");
		   double str2 = s.nextDouble();
		   
		   double imc = str1/(str2*str2);
	    
	    if (imc<18.5) {
	 	   System.out.println("Low weight");
	    }else if(imc>=18.5&&imc<24.9){
	 	   System.out.println("Normal");
	    }else if(imc>=25&&imc<29.9){
	 	   System.out.println("Overweight");
	    }else if(imc>30){
	 	   System.out.println("Obessity");
	    }else {
	 	   System.out.println("Error");
	}	       
	}

}
