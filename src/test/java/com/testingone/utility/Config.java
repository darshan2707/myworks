package com.testingone.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
 public static 	Properties pro= new Properties();
 public static  File files = new File(System.getProperty("user.dir")+"/src/test/resources/properties");
 public static	File[] fileArray =files.listFiles();
	
	public static String getProperty(String property) {
		
		
		for(File f : fileArray) {
			try {
				pro.load(new FileInputStream(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		   
		return pro.getProperty(property)  ;  
	}
	
	public static void main(String[] args) {
	 System.out.println(getProperty("browser"));
	 
	// setProperty("state", "Karnataka");
	 System.out.println(getProperty("state"));
	 
	}
	public static void setProperty(String property, String value) {
		//File f = new FileInputStream()
		pro.setProperty(property, property);
	}

	public String getReportConfigPath(){
		String reportConfigPath = pro.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}


}



