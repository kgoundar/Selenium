package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;

public class LinksTables2 {
	
	public static void main(String[] args) {
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
		
        String underConstTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        String baseUrl = ("http://demo.guru99.com/test/newtours/");
        
        //driver.navigate().to("http://demo.guru99.com/test/newtours/");
        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;
        
        //extract the link texts of each link element
        for (WebElement e : linkElements) {
        	
        	linkTexts[i] = e.getText();
        	i++;
        }
        
        
        //test each link
        for (String t: linkTexts) {
        	driver.findElement(By.linkText(t)).click();
        	if (driver.getTitle().equals(underConstTitle)) {
        		System.out.println("\"" + t + "\"" + " is under contstruction.");
        	} else {
        		System.out.println("\"" + t + "\"" + " is working.");
        	}
        	
        	driver.get(baseUrl);
        }

        //driver.quit();	
				
	}

}
