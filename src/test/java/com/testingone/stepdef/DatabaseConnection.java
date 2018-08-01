package com.testingone.stepdef;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	
	public static void connetSql() {
		String username="";
		String password="";
		String url="";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try {
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("Query");
				
					while(rs.next()){
					
						String st	= rs.getString(1);
						System.out.println(st);
					}
						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
