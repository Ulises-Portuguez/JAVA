package poo1;
//Esta clase ser anuestra plantilla. Nos ayudar a a crear un monton de gatitos.
public class Gatito {// Definimos nuestra clase "Gatito". Esta clase nos ayudara a darle caracteristica geenrales a nuestros gatitos
	//Crear atributos
	private String nombre;//Variable de tipo cadena
	private String color;//Variable de tipo cadena
	private String raza;//Variable de tipo cadena
	private int edad;//Variable de tipo entero

	public Gatito(String nom,String col, String raz, int ed) {
		this.nombre = nom;
		this.color = col;
		this.raza = raz;
		this.edad = ed;
		
		
	}
	
	public Gatito() {
		this.nombre = "";
		this.color = "";
		this.raza = "";
		this.edad = 0;
	}
	
	// Metodos
	
	public String consultarNombre (){ //Consultamos el nombre
	    return nombre;
	}
	public String consultarColor() { //Consultamos el color
		return color;
	}
	public String consultarRaza (){ //Consultamos la raza
	    return raza;
	}
	public int consultarEdad (){ //Consultamos la edad
	    return edad;
	}

	
	public static void main(String[] args) {
		Gatito gatito1 = new Gatito("Perejil","Negro", "Esfinge",3);
		System.out.println(gatito1.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}


