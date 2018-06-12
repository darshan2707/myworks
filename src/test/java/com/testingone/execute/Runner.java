package com.testingone.execute;

import org.junit.runner.RunWith;

//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "reports/JASON/cucumber.json",
		overviewReport = true, //default false;
		detailedReport = true, // default false;
		toPDF = true, // default false;
		featureOverviewChart = true, // default false;
	outputFolder = "reports")
*/
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features/LoginPage.feature",
		plugin = { 
		"html:reports/HTML/",
		"json:reports/JASON/cucumber.json", 
		"pretty:reports/TEXT/cucumber-pretty.txt",
		"usage:reports/USAGE/cucumber-usage.json", 
		"junit:reports/JUNIT/cucumber-results.xml",
		"rerun:report/rerun.txt"},
		tags= {"@first"},
        glue = {"com.testingone.stepdef","com.testingone.hooks"
        		 } ,
        dryRun=false,
        strict=true

		)  
public class Runner {
	
}
