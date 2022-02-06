package controlDeFlujo;
import java.util.Scanner;

public class flujoSwitch {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Elige una opcion");
		String enter = s.nextLine();
		
		switch (enter){
			case "1":
				System.out.println("Elegiste opcion 1");
				break;
			case "2":
				System.out.println("Elegiste la opcion 2");
			default:
				System.out.println("Elección incorrecta");
				break;
		}
}
}
