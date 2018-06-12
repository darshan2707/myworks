/*package com.testingone.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngtest {
//	WebDriver driver;

//	public Testngtest(WebDriver driver) {
//		driver =this.driver;
//		PageFactory.initElements(driver, this);
//	}
//	
	@Test
	public void test() {
		
		System.out.println("testing core java");
	//	Assert.assertTrue(false);
		System.setProperty("webdriver.chrome.driver", "D:\\dr\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.findElement(By.id(""));
		
		
		
		/////////NAVIGATION
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().back();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText(""));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfElementsToBe(By.id(""), 99));
		
		
		///////////Switch to
		driver.switchTo().frame("");
		 
		
		WebElement ele = driver.findElement(By.tagName(""));
				
		Select	select = new Select(ele);
		List<WebElement> seleAvailableOptitons =	select.getOptions();
			
		List<WebElement> selectSelectedOptions=select.getAllSelectedOptions();	
			
			
		
	}
	
}
*/