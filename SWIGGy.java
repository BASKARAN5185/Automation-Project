package MyProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SWIGGy {
    WebDriver driver; 
    @BeforeTest
	public void opensiwwgy() {
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_107\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
         driver.get("https://www.swiggy.com/");
         driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(80));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
    @Test(priority=1)
	public void location() {
		driver.findElement(By.xpath("//input[@id='location']")).sendKeys("cheenai");
		driver.findElement(By.xpath("//input[@id='location']")).sendKeys(Keys.ENTER);
	}
	
    @Test(priority=2)
	public void searchrestarant() {
		driver.findElement(By.xpath("//span[text()='Search']")).click();
	    driver.findElement(By.xpath("//div[contains(@class,'_1QBzC')]")).sendKeys("mutton biriyani");
	    driver.findElement(By.xpath("//img/[contains(@class,'_2tuBw _12_oN _2f0cx')]")).click();
	    driver.findElement(By.xpath("//span[@class='styles_container__1ieVH styles_size-sm__1emwv styles_variant-default__2VzW8 styles_rounded__3IerS styles_canClick__16iph NavTab_tab__1JygM NavTab_tabSelected__2B4GW']")).click();
	}
	 
    @Test(priority=3)
	public void restarantverify() {
	    String name=driver.findElement(By.xpath("//div[contains(text(),'SS MUSLIM BRIYANI')]")).getText();
	    Assert.assertEquals("SS MUSLIM BRIYANI", name,"not matching Restarant name");
	    System.out.println("verify name");
	    driver.findElement(By.xpath("//div[contains(text(),'SS MUSLIM BRIYANI')")).click();
	    driver.navigate().back();
	}
    @Test(priority=4)
	public void opennextrestarant() throws IOException {    
	    driver.findElement(By.xpath("//div[contains(text(),'SS Hyderabad Briyani')]")).click();
	    driver.findElement(By.xpath("//div[contains(text(),'Chinese')]")).click();
	    driver.findElement(By.xpath("//h3[contains(text(),'Gobi Manchurian Dry')]")).click();
	    driver.navigate().back();
	    driver.navigate().back();
	 TakesScreenshot sc=(TakesScreenshot)driver;
   	 File source=sc.getScreenshotAs(OutputType.FILE);
   	 File destination=new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\AirIndia.png");
   	 FileHandler.copy(source, destination);
	   
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
	
	}  



