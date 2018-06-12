/*package com.testingone.execute;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class FailureScenarios {
	
	//@RunWith(Cucumber.class)
	@CucumberOptions(
	    monochrome = true,
	    features = "report/failure.txt", //Cucumber picks the failed scenarios from this file 
	    		//features = "src/test/resources/features/LoginPage.feature",
	    		plugin = { 
	    		"html:reports/HTML/",
	    		"json:reports/JASON/cucumber.json", 
	    		"pretty:reports/TEXT/cucumber-pretty.txt",
	    		"usage:reports/USAGE/cucumber-usage.json", 
	    		"junit:reports/JUNIT/cucumber-results.xml"
	    		//"rerun:report/failure.txt"
	    		
	    		},

	            glue = {"com.test.stepdef"
	            		 } ,
	            dryRun=false)
	
	
	@RunWith(Cucumber.class)
	@CucumberOptions( monochrome = true, 
					  features = "@report/rerun.txt", // Cucumber picks the failed scenarios from this
					  plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json" },
                      glue = { "com.testingone.stepdef", "com.testingone.hooks" }, 
                      dryRun = false, 
                      strict = true)

	public class FailedScenarios {

	}

}
*/