package com.testingone.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IHashMap {

	public static void main(String[] args) {
		
		stringNum();
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
		dupCh("kdsjfldksjfdij");
	}
	
public static void dupchar(String str) {
	
	Map<Character,Integer> dupChar = new HashMap<>();
	
	for(int i=0;i<str.length();i++) {
		
		if(!dupChar.containsKey(str.charAt(i))) {
			
			dupChar.put(str.charAt(i), 1);
			
		}else {
			int count = dupChar.get(str.charAt(i));
			dupChar.put(str.charAt(i), ++count);
			
		}
		
	}
	 System.out.println("Latest  "+dupChar);
	
	
	
		
	
	
//	Map<Character,Integer> charr= new HashMap<>();
//	
//	for(int i=0;i<str.length();i++) {
//		
//		Character c = str.charAt(i);
//		
//		if(charr.containsKey(c)) {
//			int count= charr.get(c);
//			charr.put(c, ++count);
//		}else {
//			charr.put(c, 1);
//		}
//		
//	} System.out.println(charr);
//	
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
	
	public static void dupCh(String str) {
		
		Map<Character,Integer> cha= new HashMap<>();
		
		for(int i=0; i<str.length();i++) {
			
			Character dc = str.charAt(i);
			
			if(cha.containsKey(dc)) {
				
				int charCount = cha.get(dc);
				cha.put(dc, ++charCount);
			}else {
				cha.put(dc, 1);
			}
			
		}
		 System.out.println("4ex --"+cha);
		 
		  for(Map.Entry<Character, Integer> entry:cha.entrySet()) {
			  //System.out.print(entry.getValue());
			  if(entry.getValue()==1) {
				  
				  System.out.print(" non repeated character --"+entry.getKey());
			  }
			  
		  }
	
	}
	
	
	public static void stringNum() {
		
		String str ="abcd14573234sdABCfs23";
		String str1 = str.replaceAll("[a-zA-Z]", "");
		//Integer i = Integer.valueOf(str);
		System.out.println(str1);
//		String ss="";
//		String reverse="";
//		String s3 = "dsfjsdk  vdidk pippo ";
//		String s4[] = s3.split("");
//		for(int i=s4.length-1; i>=0;i--) {
//			System.out.println(s4[i]);
//			reverse = reverse + s4[i];
//					
//		}
//		System.out.println("reversed..."+ reverse);
//		
//		
//		String rev = "";
//		for(int i=0;i<s4.length;i++) {
//			rev = s4[i];
//			System.out.print(rev);
//			int len = rev.length();
//			for(int j=len-1;j>0;j--) {
//				ss=ss+reverse.charAt(j)+" " ;
//			}
//			System.out.print("In second for loop "+ss);
//		}
//		     System.out.print("In first for loop " + ss);
//		//abcdefghijklmnop
//		//cbagfedlkjih
//		
//		StringBuffer sb = new StringBuffer(s3);
//	       
//	    System.out.println(sb.reverse());
//	       
//	    StringBuilder su = new StringBuilder(s3);
//	    System.out.println(su.reverse());    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
