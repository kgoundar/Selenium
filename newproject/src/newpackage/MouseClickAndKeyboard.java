package newpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseClickAndKeyboard {

	public static void main(String[] args) {
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        
        driver.navigate().to("http://demo.guru99.com/test/newtours/");
        
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td" 
        + "/table/tbody/tr/td" + "/table/tbody/tr"));
        
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();
        
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        //driver.close();        

	}

}
