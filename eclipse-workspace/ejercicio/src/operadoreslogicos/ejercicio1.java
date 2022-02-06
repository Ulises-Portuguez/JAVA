package operadoreslogicos;
import java.util.Scanner; 

public class ejercicio1 {
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		   System.out.println("Please enter your password ");
		   String str1 = s.next();
		   System.out.println("Please confirm your password ");
		   String str2 = s.next();
		   String str3 = new String(str1);
		   
		   int var1 = str1.compareTo( str2 );
	       System.out.println("str1 & str2 comparison: "+var1);

	       int var2 = str1.compareTo( str3 );
	       System.out.println("str1 & str3 comparison: "+var2);

	       int var3 = str2.compareTo("compareTo method example");
	       System.out.println("str2 & string argument comparison: "+var3);
		       
		       
		}
	}


