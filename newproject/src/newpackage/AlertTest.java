package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertTest {
	
	  public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
			
			String alertMessage = "";
			
			driver.get("http://jsbin.com/usidix/1");
			driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
			alertMessage = driver.switchTo().alert().getText();
			//driver.switchTo().alert().accept();
			
			System.out.println(alertMessage);
			//driver.quit();
			
			if (myWaitVar.until(ExpectedConditions.alertIsPresent()) != null) {
				System.out.println("Alert is present");
			}
					
	  }
	
}
