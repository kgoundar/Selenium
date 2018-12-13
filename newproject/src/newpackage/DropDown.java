package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDown {

	public static void main(String[] args) {
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        
        driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
        
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");
  
        //Selecting Items in a Mutiple SELECT elements
        driver.navigate().to("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        //fruits.selectByVisibleText("Apple");
        fruits.selectByIndex(1);
        
        
        if (fruits.isMultiple()) {
        	fruits.selectByVisibleText("Orange");
        	fruits.selectByValue("grape");        	
        }
         
        
	}

}
