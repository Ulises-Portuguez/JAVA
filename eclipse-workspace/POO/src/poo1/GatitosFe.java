package poo1;



public class GatitosFe { //Definimos nuestra clase "Gatito". Esta clase nos ayudar� a darle caracter�sticas generales a nuestros gatitos.

	//Le vamos a dar atributos a nuestra clase
	private String nombre; //Variable de tipo cadena
	private String color; //Variable de tipo cadena
	private String raza; //Variable de tipo cadena
	private int edad; //Variable de tipo int
	
	// C�mo podemos ver, para agregar atributos, primero escribimos el tipo y el nombre del atributo.
	
	// Ahora creamos nuestros m�todos (ser�n las acciones que har� nuestro gatito)
	
	
	// Primer m�todo: Constructor. Nos permitir� instanciar un objeto de la clase a la que pertenece. En pocas palabras, crearemos un gatito.
	
	
	// Utilizamos this en los constructores y en los m�todos set para referirnos a los atributos del objeto creado.
	
	public GatitosFe (String nom, String col, String raz, int ed) {
		this.nombre = nom;
		this.color = col;
		this.raza = raz;
		this.edad = ed;
	}

	/* Un constructor simplemente es un metodo que nos devuelve un objeto, y puede llamarse igual que la clase.
	 * Podemos crear constructores sin parametros si no los queremos establecer de antemano.
	 */
	
	// Tambi�n podemos crear constructores sin par�metros
	
	public GatitosFe() {
		this.nombre= ""; //nombre vac�o
		this.color= ""; // color vac�o
		this.raza= ""; // raza vac�a
		this.edad= 0 ; // edad cero
	}
	
	//Ahora crearemos m�todos para consultar los datos de nuestro gatito.

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
    
    //Ahora crearemos los metodos para agregar los datos del gatito
    
    public void establecerNombre(String nom) {
    	this.nombre=nom;
    }

    public void establecerColor(String col) {
    	this.color=col;
    }
    
    public void establecerRaza(String raz) {
    	this.raza=raz;
    }
    
    public void establecerEdad(int ed) {
    	this.edad=ed;
    }
    
    public static void main(String[] args) {
		
    	GatitosFe gatito1 = new GatitosFe();//Creaci�n del objeto dentro de la clase Gatito
    	
    	//Asiganci�n de valores mediante los m�todos Setters
    	gatito1.establecerNombre("Cilantro");
    	gatito1.establecerColor("Blanco");
    	gatito1.establecerRaza("Main");
    	gatito1.establecerEdad(3);
    	
    	
    	//Visualizaci�n dentro de consola del objeto
    	System.out.println("El nombre del gatito es: "+gatito1.consultarNombre());
    	System.out.println("El color del gatito es: "+gatito1.consultarColor());
    	System.out.println("La raza del gatito es: "+gatito1.consultarRaza());
    	System.out.println("La edad del gatito es: "+gatito1.consultarEdad());
	}
	}
