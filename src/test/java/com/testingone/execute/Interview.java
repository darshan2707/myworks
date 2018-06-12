package com.testingone.execute;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Interview {
	
	public static void main(String[] args) {
		
		Map<String,String> test = new LinkedHashMap<>();
		
		test.put("one", "apple");
		test.put("two", "banana");
		
		
		for(Map.Entry<String,String> entry:test.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		
		test.get("one");
		System.out.println(test.get("one"));
		List<String> ar = new ArrayList<>();
		
		ar.add("testone");
	}	
	
	
}
