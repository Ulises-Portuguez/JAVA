package Collections;

import java.util.HashSet;

public class colleHashSet {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Vovlo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BWM");
		cars.add("Mazda");
		System.out.println(cars);
		
		System.out.println(cars.contains("Mazda"));
		
		cars.remove("Volvo");
		cars.clear();
		cars.size();
		for (String i : cars) {System.out.println(i); }
		
	}
	
}
