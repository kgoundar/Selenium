package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinksOutsideInside {

	public static void main(String[] args) {
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        
        String baseUrl = "http://demo.guru99.com/test/block.html";
        driver.navigate().to(baseUrl);
        
        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println(driver.getTitle());
        
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println(driver.getTitle());
        
        //driver.quit();

	}

}
