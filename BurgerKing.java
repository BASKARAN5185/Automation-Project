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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BurgerKing {
	WebDriver driver;
	@BeforeClass
	public void OpenBurgerKing() {
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_107\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.burgerking.in/");
	}
 /*	@Test(priority=1)
	public void locations() {
		WebElement locate=driver.findElement(By.xpath("//input[@id='']"));
		locate.sendKeys("chennai");
		locate.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@id='root']")).click();
		
	}                                                                        */
	
	@Test(priority=2)
	public void ordermenu() throws IOException {
		driver.findElement(By.xpath("//div[@id='homeTop']")).click();
		driver.findElement(By.xpath("//img[@alt='leftArrow']")).click();
		 TakesScreenshot st=(TakesScreenshot)driver;
		    File src=st.getScreenshotAs(OutputType.FILE); 
		    File dest=new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\burger.png");
	        FileHandler.copy(src, dest);
	}
	@Test(priority=3)
	public void orderBurger() {
		driver.findElement(By.xpath("//p[contains(text(),'Friends & Family Combo')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Crispy Veg Double Patty + Crispy Veg Double Patty')]")).click();
	//	driver.findElement(By.xpath(""));
	//	driver.findElement(By.xpath(""));
	}
	@AfterClass
	public void close() {
		driver.quit();
	}

}
