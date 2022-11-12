package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class openGoogle {
               WebDriver driver;
    @Test
    @Parameters({"browser"})
	void browser(String browser) {
    	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_106\\chromedriver.exe");
		driver=new ChromeDriver();
	    }
    else if(browser.equalsIgnoreCase("firebox")) {
    	  System.setProperty("webdriver.gecko.driver", "D:\\selinum\\geckodriver-v0.32.0-win32\\geckodriver.exe");	
          driver=new FirefoxDriver();
    }
    	driver.manage().window().maximize();
    	driver.get("https://www.Google.com");
    	String Title=driver.getTitle();
        Assert.assertEquals("Google", Title,"Title not matching");
    	driver.close();
    }
}
