package com.hcl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapOperations {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("jan", 1);
		hashMap.put("feb", 2);
		hashMap.put("mar", 3);
		hashMap.put("apr", 4);
		hashMap.put("may", 5);

		System.out.println(hashMap);

		System.out.println("\nExample 1...");
		Iterator<Entry<String, Integer>> iterator = hashMap.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator
					.next();
			System.out.println("Key : " + entry.getKey() + " Value :"
					+ entry.getValue());
		}

		// more elegant way, this should be the standard way, recommend!
		System.out.println("\nExample 2...");
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
		}

		// weired, but works anyway, not recommend!
		System.out.println("\nExample 3...");
		for (Object key : hashMap.keySet()) {
			System.out.println("Key : " + key.toString() + " Value : "
					+ hashMap.get(key));
		}

	}
}
