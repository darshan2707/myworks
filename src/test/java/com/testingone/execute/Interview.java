package com.testingone.execute;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
		
			int i=10;
			Integer ii = 10;
	    System.out.println(numberValidate("-12222"));
	    
	    getPropertyExample();
	}	
	 public static int numberValidate (String str) {
		 
		   //String str = "-12212";
		   Integer it = Integer.valueOf(str);
		  System.out.println(it);  
		  //5digit <0 <5digit convert to positive
		  if(it<0 && Math.abs(it)<10000)
		  {
			return -1;  
		  }else {
		  Integer pIt = Math.abs(it);
		  	
		  	int tes = pIt, mod, rev=0;
		  	  while(tes>0) {
		  	mod = tes%10; //12212 2
		  	tes=tes/10;
		  	rev = mod+rev*10;
		  	 System.out.println(rev+"  "+mod);
		  	
		  	  }
		  	System.out.println(rev==pIt);
		  
		 return rev;
		  }
	 
	 }
	 
	 public static void getPropertyExample() {
		
		 Properties pr = new Properties();
		    File file = new File("D:/java/pro");
		    File[] files = file.listFiles();
		    
		    for(File f:files) {
		    	
		    	 try {
					pr.load(new FileInputStream(f));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		    }
		     
		     System.out.println(pr.getProperty("city"));
		   
		     
		     Properties prn = new Properties();
		     File fi = new File("D:/java/pro");
		     File[] lfi= fi.listFiles();
		     for(File f:lfi) {
		    	 try {
					prn.load(new FileInputStream(f));
					 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }
		     System.out.println(pr.get("city"));    
	 }
}
