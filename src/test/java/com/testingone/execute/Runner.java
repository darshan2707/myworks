package com.testingone.execute;

import java.io.File;
import java.util.Locale;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;
//import com.relevantcodes.extentreports.DisplayOrder;
//import com.relevantcodes.extentreports.NetworkMode;

//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features/LoginPage.feature",
		plugin = { 
		"html:reports/HTML/",
		"json:reports/JASON/cucumber.json", 
		"pretty:reports/TEXT/cucumber-pretty.txt",
		"usage:reports/USAGE/cucumber-usage.json", 
		"junit:reports/JUNIT/cucumber-results.xml",
		"rerun:report/rerun.txt"
		//"com.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-reports/report.html"
		},
		tags= {"@first"},
        glue = {"com.testingone.stepdef","com.testingone.hooks"} ,
        dryRun=false,
        strict=true

		)  
public class Runner {
	
//	@BeforeClass
//	public static void init() {
//		DisplayOrder NEWEST_FIRST = null;
//		NetworkMode ONLINE = null;
//		ExtentCucumberFormatter.initiateExtentCucumberFormatter
//		(new File("D:/Pictures/Reports/Auutomation_report.html"),
//		false, NEWEST_FIRST, ONLINE, new Locale("en-US"));
//	}
	
	@AfterClass
	public static void writeExtentReport() {
		// Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		// Reporter.setTestRunnerOutput("Sample test runner output message");
	//Reporter.loadXMLConfig(System.getProperty("user.dir")+"/configs/extent-config.xml");	
	
	}
}



/*@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "reports/JASON/cucumber.json",
		overviewReport = true, //default false;
		detailedReport = true, // default false;
		toPDF = true, // default false;
		featureOverviewChart = true, // default false;
	outputFolder = "reports")
*/

/*
 * @RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        //coverageReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        features = { "./src/test/java/com/github/mkolisnyk/cucumber/features" },
        glue = { "com/github/mkolisnyk/cucumber/steps" },
        tags = {"@consistent"})
public class SampleCucumberTest {
}

*/

/*
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target1/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        //coverageReport = true,
        jsonUsageReport = "target1/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        //excludeCoverageTags = {"@flaky" },
        //includeCoverageTags = {"@passed" },
        outputFolder = "target1")*/
