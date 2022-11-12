package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class orangeHRM {
   
	WebDriver driver;
	@BeforeClass
	void setup() {
		 System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_106\\chromedriver.exe");  
		   driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void checklogo() {
		WebElement logo  =driver.findElement(By.xpath("/html/body/nav/div/a/img"));
		Assert.assertTrue(logo.isDisplayed(),"Logo not Displayed the page");
		
	}
	
	@Test(priority=2)
	void VerifyTitle() {
		String Title=driver.getTitle();
		Assert.assertEquals("OrangeHRM", Title,"Title of page is mismatch");
			
	}
	@AfterClass
	void close() {
		driver.close();
	}
}
