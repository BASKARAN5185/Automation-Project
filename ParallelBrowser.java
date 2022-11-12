package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelBrowser {
         WebDriver driver;
  @Test(priority=1)
  void openinsta() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_106\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://www.instagram.com");
      String Title= driver.getTitle();
      Assert.assertEquals("instagram",Title);
  }
  
  @Test(priority=2)
  void openfacebook() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_106\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://www.facebook.com");
      String Title= driver.getTitle();
      Assert.assertEquals("facebook",Title);
  }
  
  
  
}
