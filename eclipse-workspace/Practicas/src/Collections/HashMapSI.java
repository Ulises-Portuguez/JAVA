package Collections;
import java.util.HashMap;
public class HashMapSI {
	
	public static void main(String[] args) {
		HashMap<String,Integer> people = new HashMap<String,Integer>();
	
		people.put("Guillermo", 34);
		people.put("Rosa", 27);
		people.put("Mario", 28);
		
		System.out.println(people);
	}
}
