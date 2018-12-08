package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	  public static void main(String[] args) {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  WebDriverWait myWaitVar = new WebDriverWait(driver, 3);
		  
		  driver.get("http://demo.guru99.com/test/newtours/");
		  
		  try {
			  
			  myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
			  driver.findElement(By.name("userNames")).sendKeys("tutorial");			  
		  }		  
		  //catch (TimeoutException toe){
			//  System.out.println(toe.toString());			  
		  //}
		  catch(NoSuchElementException nsee) {
			  
			  System.out.println(nsee.toString());
		  }
	  }

}
