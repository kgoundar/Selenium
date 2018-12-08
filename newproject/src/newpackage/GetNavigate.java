package newpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetNavigate {

		public static void main(String[] args) {
			  
			  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
			      
			  driver.get("http://demo.guru99.com/test/newtours/");
			  
			  driver.navigate().to("http://www.google.com/");
			  driver.navigate().back();
			  driver.navigate().refresh();
			  driver.navigate().forward();
			  
		}
}
