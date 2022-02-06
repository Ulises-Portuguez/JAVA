package Collections;

import java.util.HashMap;

public class colleHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
	
		//Acceder a un artículo
		System.out.println(capitalCities.get("England")); 
		//Eliminar un artículo
		capitalCities.remove("England");
		System.out.println(capitalCities);
		//Para eliminar todos los elementos
		//capitalCities.clear();
		System.out.println(capitalCities);
		//Tamaño de HashMap
		System.out.println(capitalCities.size()); 
		//Recorrer un HashMap
		for (String i : capitalCities.keySet()) { System.out.println(i); }
		for (String i : capitalCities.values()) { System.out.println(i); }
		for (String i : capitalCities.keySet()) {  System.out.println("key: " + i + " value: " + capitalCities.get(i));}

	}

}
