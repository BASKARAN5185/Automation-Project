package MyProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AirIndia {
	WebDriver driver;
    
	@BeforeClass
	public void openAirindia() {
    	System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_106\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://www.airindia.in/");
    }	
    
	@Test(priority=1)
    public void FlightserchDetials() {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("windwo.scrollBy(0,100)","");
    	driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
    	driver.findElement(By.xpath("//input[@id='from']")).sendKeys("chennai");
    	driver.findElement(By.xpath("//a[@id='ui-id-18'")).click();
    	driver.findElement(By.xpath("//input[@id='to']")).sendKeys("mumbai");
    	driver.findElement(By.xpath("//a[@id='ui-id-31']")).click();
    	driver.findElement(By.xpath("//input[@id='_depdateeu1']")).sendKeys("11/11/2022");
    	driver.findElement(By.xpath("//input[@id='_retdateeu1']")).sendKeys("13/11/2022");
        
    }
    
    @Test(priority=2)
    public void drop() {
    	WebElement dropdown=driver.findElement(By.xpath("//select[@id='ddladult1']"));
    	dropdown.click();
    	Select select=new Select(dropdown);
    	select.deselectByVisibleText("2");
    	
    	WebElement childrendd=driver.findElement(By.xpath("//select[@id='ddlchildren1']"));
    	childrendd.click();
    	Select children=new Select(childrendd);
    	children.selectByValue("2");
    	
    }
    @Test(priority=3)
    public void flightclass() {
    	WebElement concessonary=driver.findElement(By.xpath("//select[@id='concessionaryType1']"));
    	Select concessonarydd= new Select(concessonary);
    	concessonarydd.selectByValue("4");
    	
    	WebElement selectclass=driver.findElement(By.xpath("//select[@id='_classType1']"));
    	Select selectclassdd=new Select(selectclass);
    	selectclassdd.selectByVisibleText("First");
    
    }
    
    public void screenshot() throws IOException {
    	TakesScreenshot sc=(TakesScreenshot)driver;
    	 File source=sc.getScreenshotAs(OutputType.FILE);
    	 File destination=new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\AirIndia.png");
    	 FileHandler.copy(source, destination);
    }
    
    @AfterClass
    public void serch() {
    	String Title=driver.getTitle();
    	Assert.assertEquals("AirIndia", Title,"not matching title");
    	driver.findElement(By.xpath("//input[@id='btnbooking']")).click();
    	driver.quit();
    }








}
