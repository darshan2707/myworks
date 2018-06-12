package com.testingone.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IHashMap {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hMap = new HashMap<>(); 
		
		hMap.put(1, "jan");
		hMap.put(2, "feb");
		hMap.put(3, "mar");
		hMap.put(4, "apr");
		hMap.put(5, "may");
		hMap.put(6, "jun");
		hMap.put(7, "jul");
		hMap.put(null, "");
		hMap.put(null, null);
		hMap.put(null, null);
		
		boolean b= hMap.containsKey(1);
		boolean c= hMap.containsValue("jun");
		System.out.println("both key and value are "+ b+" -- "+c);
	
		Set<Integer> keys = hMap.keySet();
		
		for(Integer k:keys) {
			System.out.println("The Value of  " + k +" is :"+hMap.get(k));
		}
				System.out.println(hMap);
		duplicateCharacter("ksjfk.sjlfksjfl");
		dupchar("sdkfjlksdjJFKSHFHKDGJHflksdjflskjyupdpgopfdflk");
	}
	
public static void dupchar(String str) {
	
	Map<Character,Integer> charr= new HashMap<>();
	
	for(int i=0;i<str.length();i++) {
		
		Character c = str.charAt(i);
		
		if(charr.containsKey(c)) {
			int count= charr.get(c);
			charr.put(c, ++count);
		}else {
			charr.put(c, 1);
		}
		
	} System.out.println(charr);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void duplicateCharacter(String string ) {
	
		Map<Character,Integer> dupChar = new HashMap<>();
		
		int length = string.length();
		
		for(int i=0;i<length;i++) {
			
			Character c = string.charAt(i);
			 
			if(dupChar.containsKey(c)) {
			int count = dupChar.get(c);
			  dupChar.put(c, ++count);
			}else {
				dupChar.put(c, 1);
			}
		}
	
		 System.out.println(dupChar);
	}
	
	
}
