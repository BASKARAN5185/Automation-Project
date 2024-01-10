package MyProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AirAsia {
	WebDriver driver;
   @BeforeClass
   public void openAirAsia () {
	 System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_107\\chromedriver.exe"); 
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://www.airasia.co.in/home");
  }
   
   @Test(priority=1)
   public void FlightSerch() {
	   driver.findElement(By.xpath("//div[@id='Round Trip']")).click();
	   driver.findElement(By.xpath("//input[@id='basic-url']")).sendKeys("c");
	   driver.findElement(By.xpath("//div[text()='Chennai']")).click();
	   driver.findElement(By.xpath("//input[@aria-describedby='basic-addon3']")).sendKeys("mu");
	   driver.findElement(By.xpath("//div[text()='Mumbai T1']")).click();
	   driver.findElement(By.xpath("//div[@class='flight-search-date-picker-wrapper']")).click();
	   driver.findElement(By.xpath("//div[contains(text(),'17')]")).click();
	   driver.findElement(By.xpath("//div[contains(text(),'25')]")).click();
	   driver.findElement(By.xpath("//button[@class='btn-flight']")).click();
 
   }
   
   @Test(priority=2)
   public void flightbookingseat(){
       driver.findElement(By.xpath("//div[@class='flight-search-guest-details-wrapper']")).click();
       driver.findElement(By.xpath("//img[@data-testid='addHandler1']")).click();
       driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
   }
   
   @Test(priority=3)
   public void   flightbook() {
     driver.findElement(By.xpath("//div[@class='b2c-inner-data-wrapper']")).click();
     driver.findElement(By.xpath("//div[@class='b2c-fa-source-destination-round']")).click();
	 driver.findElement(By.xpath("//div[@class='b2c-inner-data-wrapper b2c-inner-data-wrapper-selected']")).click();
	 driver.findElement(By.xpath("//*[text()='Continue']")).click();
  }
   
   @Test(priority=4)
   public void guestDetials() {
	   driver.findElement(By.xpath("//label[@class='MuiFormControlLabel-root' or contains(text(),'Mr')]")).click();
	   driver.findElement(By.xpath("//input[@placeholder='DOB(DD/MM/YYYY)']")).sendKeys("09/07/1998");
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xxxxxx@122gmai.com");
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("xxxxxxx");
	   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xxxxxxxx");
	   driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("5467654398");
	   driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	   driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	   driver.findElement(By.xpath("button[contains(text(),'Continue To Add-ons')]")).click();
	   driver.findElement(By.xpath("button[contains(text(),'Continue To Seat')]")).click();
	  
   }
   
   @AfterClass 
   public void close() {
	   driver.quit();
   }
 
  }
