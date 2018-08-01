package com.testingone.stepdef;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testingone.utility.Config;
import com.testingone.webdrivermethods.Wdm;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import locators.ObjectsLoginPage;

public class Hooks {
	
	public static WebDriver driver;
	//public Hooks hook;
	public static Wdm wdmethods;
	public static ObjectsLoginPage login;
	public static Logger logger;
	
	public Hooks() {
		wdmethods = new Wdm();
		login = new ObjectsLoginPage(driver);
	}
	
	@Before
	public void init(Scenario scn) {
		                    		
		if(Config.getProperty("browser").equalsIgnoreCase("chrome")){
			BasicConfigurator.configure();
			PropertyConfigurator.configure("log4j.properties");
			logger = Logger.getLogger(scn.getName());
		   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		logger.info("Initialized Chrome Driver....");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		
		System.out.println(driver.manage().getCookies());
		String session = ((RemoteWebDriver) driver).getSessionId().toString();
		System.out.println(session);
	}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	@Before("@first")
	public void beforScenario() {
		System.out.println("local before annotation");
	}
	
}
