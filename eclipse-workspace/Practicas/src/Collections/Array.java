package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
	public static void main(String[] args) {
		
		//String[] arreglo = {"Mau","Sofi","Sam","Abril"};
		//System.out.println(arreglo[1]);
		// Usando la clase ArrayList
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Fiat");
		cars.add("Volvo");
		
		
		Collections.sort(cars); //Ordena alfabeticamente el arreglo
		
		//for(int i =0;i<cars.size();i++) {
			//System.out.println(cars.get(i));
		//}
		
		//Usando for each
		for(String i : cars) {
			System.out.println(i);
		}
		
		//Acceder a un elemento
		cars.get(0);
		System.out.println(cars.get(0));
		String a = new String(cars.get(0));	
		System.out.println(a);
		//Cambiar un elemento
		cars.set(0, "Opel");
		System.out.println(cars);
		//Elminar un elemento
		cars.remove(0);
		System.out.println(cars);
		//Tamaño del arreglo
		cars.size();
		int b = (cars.size());
		System.out.println(cars.size()+ " "+ b);
	}
}
