package funciones;

public class Mainb {
	static void listado(String nombre, int age, Double altura){
		System.out.println("Tu nombre es: " + nombre + " Chang");
		System.out.println("Tu edad es: " + age);
		System.out.println("Tu estatura es: " + altura + "\n");
	}
	
	public static void main(String[] args) {
		listado("Mike", 23,1.60);
		listado("Abril",24,1.55);
		listado("Briana",22,1.80);
		listado("Sergio",21,1.76);
		listado("Alonso",20,1.56);
	}

}
