package com.testingone.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testingone.webdrivermethods.Wdm;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import locators.ObjectsLoginPage;

public class Hooks {
	
	public static WebDriver driver;
	//public Hooks hook;
	public static Wdm wdmethods;
	public static ObjectsLoginPage login;
	public Hooks() {
		wdmethods = new Wdm();
		login = new ObjectsLoginPage(driver);
	}
	
	@Before
	public void init() {
		                    		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
