package com.testingone.webdrivermethods;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.testingone.stepdef.Hooks;

public class Wdm {

	//public static Hooks hook;
	
	
	public void sendKeys(WebElement element,String string) {
	
		try {
			
			element.sendKeys(string);
		
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch(Exception e){	
			e.printStackTrace();
		}
		
	}
	
	
	public WebElement fluentWait(By locator) {
		
		FluentWait<WebDriver> eleWait = new FluentWait<WebDriver>(Hooks.driver).withTimeout(30, TimeUnit.SECONDS)
				                       .pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
				                       //.until(ExpectedConditions.elementToBeSelected(locator));
		
//		      WebElement ele = new FluentWait<WebDriver>(Hooks.driver).
		    		  
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(Hooks.driver)
			       .withTimeout(Duration.ofMillis(30000))
			       .pollingEvery(Duration.ofMillis(5000))
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });	    		  
		    		  
		    		  
		    		  return foo;
	}

	
	public int getXCordinate() {
		
		Hooks.driver.findElement(By.id("")).getLocation().getX();
		
	 return	Hooks.driver.manage().window().getPosition().getX();
		
	}
	
	public void select(WebElement ele) {
		
		Select sel = new Select(ele);
		sel.selectByIndex(1);
		
	List<WebElement> selectcity=	sel.getAllSelectedOptions();
	}


  public void actionEx() {
	  
	  Actions action = new Actions(Hooks.driver);
	  
	  action.build().perform();
	  
	  WebElement ele =null;
	  action.click(ele);
	 action.tick()  ;
  }

  
  public void windowHandles() {
	  
	  String parentWindow = Hooks.driver.getWindowHandle();
	  
	   
	  Set<String> childWindows= Hooks.driver.getWindowHandles();
	  
	  for(String window:childWindows) {
		
		  if(!parentWindow.equals(window)) {
			  
			  Hooks.driver.close();
		  }
		  Hooks.driver.switchTo().window(parentWindow);
		  
		  
	  }
	  
	  
	  
  }
  
  

}
