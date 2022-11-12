package Project;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
        
@Test
public class Login {
	   WebDriver driver;
	@Test(priority=1)
	public void serch() throws IOException {
		
	   System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_106\\chromedriver.exe");  
	   driver=new ChromeDriver();
	   driver.get("https://www.Google.com");
	   driver.manage().window().maximize();
	}
	@Test(priority=2)
     public void googleopen() throws IOException {
		
		   driver.findElement(By.name("q")).sendKeys("we are tester");
		   driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		   TakesScreenshot st1=(TakesScreenshot)driver; 
		   File src1=st1.getScreenshotAs(OutputType.FILE);
		   File Dest1=new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\img.png");
		   FileHandler.copy(src1, Dest1);
		   
		 
	   }
	  @Test(priority=3)
	 public void tester() throws IOException {
	 //  driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
	  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a")).click();
	   TakesScreenshot st=(TakesScreenshot)driver;
	   File src=st.getScreenshotAs(OutputType.FILE); 
	   File dest=new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\img.png");
	   FileHandler.copy(src, dest);
	   driver.findElement(By.linkText("Login")).click();
	   TakesScreenshot st2=(TakesScreenshot)driver;
	   File src2=st2.getScreenshotAs(OutputType.FILE); 
	   File dest2=new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\img.png");
	   FileHandler.copy(src2, dest2);
	   
	   
	   
	   driver.close();
	   
	}         

	}

