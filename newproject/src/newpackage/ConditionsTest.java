package newpackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ConditionsTest {
	
	
	public static void main(String[] args) {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
		      
		  driver.get("http://demo.guru99.com/test/newtours/");
		  //WebElement txtbox_username = driver.findElement(By.name("userName"));
		  WebElement txtbox_username = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("userName")));
		  
		  try {
			  
			  if (txtbox_username.isEnabled()) {
				  
				  txtbox_username.sendKeys("turtorial");
			  }
			 
		  } 
		  
		  catch(NoSuchElementException nsee) {
			  
			  System.out.println(nsee.toString());
		  }
		  

		  
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // txtbox_username.clear();
		  
		  /*do {
			  
			  driver.findElement(By.name("userName")).sendKeys("found it");
			  
		  } while (driver.findElement(By.name("userName")).isDisplayed());
		 */ 
		  
		  driver.findElement(By.linkText("Flights")).click();
		  
		  if (driver.findElement(By.cssSelector("input[value=\"roundtrip\"]")).isSelected()) {
			  
			  System.out.println("round trip was selected by default");
			  
			  driver.findElement(By.cssSelector("input[value=\"oneway\"]")).click();
		  }
		  
	  }

}
