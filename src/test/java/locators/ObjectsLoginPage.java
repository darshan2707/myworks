package locators;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ObjectsLoginPage {

	//{System.out.println("this is java");}
	/*** 
	* Constructor 
	* @param driver an instance of WebDriver 
	
	public int TimeoutValue = 30;
	public SearchResultsPage(Webdriver driver) { 
	    PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
	}
	*/
	
	//public static WebdriverMethods wdb;
	
	public WebDriver driver;
	public ObjectsLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(how =How.ID,using="lst-ib")  @CacheLookup
	public static WebElement searchBar;
	
	@FindBy(how=How.LINK_TEXT,using="Gmail") @CacheLookup
	public WebElement linkGmail;
	
	public void sendkeys(String str) {
		searchBar.sendKeys(str);
	}
	
}
