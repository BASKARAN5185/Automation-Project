package MyProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ebay {
	WebDriver driver;
	
	@BeforeClass
	public void openeaby() {
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_106\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.com/");
	}
	
	@Test(priority=1)
	public void searchsonyheadphones() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("sonyheadphones");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='6.35 mm (1/4 in)']")).click();
		driver.findElement(By.xpath("//span[text()='Bluetooth']")).click();
		
	}
	
	@Test(priority=2)
	public void seeheadset() {
		String headphonetext=driver.findElement(By.xpath("//span[contains(text(),'SONY WH-1000XM4 White Limited Color Headphones Wir')]")).getText();
		System.out.println( headphonetext);
		Assert.assertEquals("SONY WH-1000XM4 White Limited Color Headphones Wireless Noise Canceling Silent", headphonetext,"not match the name of head phone");
		driver.findElement(By.xpath("//span[contains(text(),'SONY WH-1000XM4 White Limited Color Headphones Wir')]")).click();
	}
	
	@Test(priority=3)
	public void Scrrenshot() throws IOException {
		WebElement sonyheadphone=driver.findElement(By.xpath("//img[@alt='SONY WH-1000XM4 White Limited Color Headphones Wireless Noise Canceling Silent - Picture 1 of 7']"));
		TakesScreenshot sc=(TakesScreenshot)driver;
		File source=sonyheadphone.getScreenshotAs(OutputType.FILE);
		File Destinations=new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\sony.png");
		FileHandler.copy(source,Destinations);
	}
	
	@Test(priority=4)
	public void addcart() {	
		driver.findElement(By.xpath("//*[@id='isCartBtn_btn']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Go to checkout')]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close Dialog']")).click();
		driver.navigate().back();
	}
	
	
	@Test(priority=5,dataProvider="eabysign")
	public void BuyHeadphones(String gmail) throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='binBtn_btn']")).click();
		driver.findElement(By.xpath("//label[text()='Email or username']")).sendKeys(gmail);
		Thread.sleep(2500);
		driver.findElement(By.id("sbin-signin-btn")).click();

	}	
	@DataProvider
	public Object[][] eabysign (){
		return new Object[][] {
			new Object[] {"jerry234@gmail.com"},
		    new Object[] {"tom234@gmail.com"},
			new Object[] {"ben10@gmail.com"},
			new Object[] {"drgonball7@gmail.com"},
	};
	}
	
	
	@Test(priority=6,dataProvider="eabysign")
	public void markoffer(String username ) throws InterruptedException{
	driver.navigate().back();
	driver.findElement(By.xpath("//a[@id='boBtn_btn']")).click();
	driver.findElement(By.xpath("//label[text()='Email or username']")).sendKeys(username);
	Thread.sleep(2500);
	driver.findElement(By.id("sbin-signin-btn")).click();
	}
	
	
	@Test(priority=7,dataProvider="eabysign")
	public void main(String username1) throws InterruptedException {
	driver.navigate().back();
	driver.findElement(By.xpath("//div[@id='vi-atl-lnk']")).click();
	driver.findElement(By.xpath("//a[@id='boBtn_btn']")).click();
	driver.findElement(By.xpath("//label[text()='Email or username']")).sendKeys(username1);
	Thread.sleep(2500);
	driver.findElement(By.id("sbin-signin-btn")).click();
	}
	
	@Test(priority=8)
	public void link(){
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int linkssize=links.size();
	System.out.println(linkssize);
	for(int i=0;i<=linkssize;i++) {
		System.out.println(links.get(i).getText());
	}
	}
	
	
	@AfterClass
	public void eabyclose() {
	driver.quit();
	}
}
	
	
	
	
	
	
	
	