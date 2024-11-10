package ders3_51124;

import java.util.HashMap;

public class ders3_konu {

	public static void main(String[] args) {
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Bolu", 14); // indexi biz belirliyoruz.
		m.put("Ankara", 6);
		m.put("Istanbul", 34);
		
		for (String i : m.keySet() ) {
			System.out.println("Key: "+ i + "  Value: " + m.get(i));
		}
		
		
		
		
		}

}
