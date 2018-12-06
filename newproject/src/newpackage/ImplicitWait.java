package newpackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWait {
	
	  public static void main(String[] args) {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("http://jsbin.com/usidix/1");
		  driver.findElement(By.cssSelector("input[value=\"Test!\"]")).click();
		  
		  driver.close(); 	  
		  
	  }
	  
}
