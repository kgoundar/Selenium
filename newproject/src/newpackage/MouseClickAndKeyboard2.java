package newpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseClickAndKeyboard2 {

	public static void main(String[] args) {
	
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        
        String baseUrl = "http://www.facebook.com/"; 

        driver.get(baseUrl);
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
        	.moveToElement(txtUsername)
        	.click()
        	.keyDown(txtUsername, Keys.SHIFT)
        	.sendKeys(txtUsername, "hello")
        	.keyUp(txtUsername, Keys.SHIFT)
        	.doubleClick(txtUsername)
        	.contextClick()
        	.build();
        	
        seriesOfActions.perform() ;
        
	}

}
