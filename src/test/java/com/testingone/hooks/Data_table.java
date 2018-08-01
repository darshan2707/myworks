package com.testingone.hooks;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.testingone.stepdef.Hooks;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Data_table {

	
	@Given("^Get the values$")
	public void get_the_values(DataTable data) {
	  List<List<String>> values=     data.raw();
	    
	  int i= values.size();
	   
	  System.out.println(i);
	  for(int v=0;v<i;v++) {
		  for(int j=0;j<values.get(v).size();j++) {
		  System.out.println(values.get(v).get(j));
			}		  
	  }
	  
	  values.get(1).size();
	  System.out.println( values.get(1).size());
	  
	  
	  System.out.println(data.getPickleRows());
	}
	
	@Then("^test map values$")
	public void test_map_values(DataTable address) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).1
		//  address.asMap(keyType, valueType)
		
	    	
	for(Map<String,String> add	:address.asMaps(String.class, String.class)) {
		System.out.println(add.get("City"));
		System.out.println(add.get("State"));
	}
		
		for(Map<String,String> ad:address.asMaps(String.class, String.class)){
			System.out.println(ad.get("City"));
			System.out.println(ad.get("State"));
		}
	
	for(Map<String,String> adr: address.asMaps(String.class, String.class)) {
	
		
		System.out.println(adr.get("State"));
	}
		
		
	}

	
	 public void databaseConnection(String dbUrl,String username,String password) {
		 
		 String query="";
		 try {
			 
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 Connection con = DriverManager.getConnection(dbUrl, username, password);
			 Statement stm = con.createStatement();
			 ResultSet rs=stm.executeQuery(query);
					 
			while(rs.next()){
				
				String s = rs.getString(1);
				System.out.println(s);
			}		 
					 con.close();
		 }catch(SQLException e) {
			 e.printStackTrace();
			 System.out.println();
		 } catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		 
		 
	 }

	 public void takeScreenShot() {
		 File srcFile = ((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(srcFile,new File("D:/screenshot/er1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 }
}
