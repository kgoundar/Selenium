package newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinksTables {

	public static void main(String[] args) {
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        
        String baseUrl = "http://demo.guru99.com/test/link.html";
        driver.get(baseUrl);
        
        driver.findElement(By.linkText("click here")).click();
        System.out.println("Tile of the page is: " + driver.getTitle());
        //driver.quit();
        
        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Tile of the page is: " + driver.getTitle());
        
        
        
        //Link Text Search is Case Sensitive
        driver.navigate().to("http://demo.guru99.com/test/newtours/");
        
        String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
        System.out.println(theLinkText);
        
        theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
        System.out.println(theLinkText);
        
              
        
	}

}
