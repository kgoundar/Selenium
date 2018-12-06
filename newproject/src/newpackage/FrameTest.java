package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameTest {
	
	  public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        //driver.switchTo().frame("classFrame");
	        myWaitVar.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("classFrame"));
	        driver.findElement(By.linkText("Deprecated")).click();
	        //driver.close(); 
	    }

}
  