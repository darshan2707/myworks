package com.testingone.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritetoFile {
  public static void main(String[] args) {
	
	Properties prop = new Properties();
	OutputStream output = null;

	try {

		output = new FileOutputStream(System.getProperty("user.dir")+"/src/test/resources/properties/writeproperty.properties");
		///cucumberafw/src/test/resources/properties/
		// set the properties value
		prop.setProperty("database", "localhost");
		prop.setProperty("dbuser", "user");
		prop.setProperty("dbpassword", "password");

		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
  }
}