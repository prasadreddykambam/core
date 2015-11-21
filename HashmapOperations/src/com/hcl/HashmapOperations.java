package com.hcl;

import java.util.HashMap;

public class HashmapOperations {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap= new HashMap<>();
		
		hashMap.put("jan", 1);
		hashMap.put("feb", 2);
		hashMap.put("mar", 3);
		hashMap.put("apr",4);
		hashMap.put("may", 5);
		
		System.out.println(hashMap);
	}

}
