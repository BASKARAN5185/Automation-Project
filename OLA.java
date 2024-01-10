package MyProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class OLA {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_116\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.olacabs.com/");
		driver.findElement(By.className("middle h-full text value")).click();
		driver.findElement(By.xpath("//input[@id='addressInput']")).sendKeys("chennai");
		driver.findElement(By.className("row results ola-ripple ptr")).click();
		driver.findElement(By.className("middle h-full text placeholder")).click();
        driver.findElement(By.xpath("//input[@id='addressInput']")).sendKeys("tambaram");
        driver.findElement(By.xpath("//div[@class='middle text']")).click();
        WebElement pickup=driver.findElement(By.id("rideOptPicker"));
        pickup.click();
        Select pickupdd=new Select(pickup);
        pickupdd.selectByVisibleText("Schedule for later");
        
        WebElement date=driver.findElement(By.id("datepicker"));
        date.click();
        Select dateadd=new Select (date);
        dateadd.selectByVisibleText("Tomorrow");
        
        WebElement time=driver.findElement(By.id("timepicker"));
        time.click();
        Select timedd=new Select(time);
        timedd.selectByValue("4:00 AM");
        TakesScreenshot  sc=(TakesScreenshot)driver;
        File source=sc.getScreenshotAs(OutputType.FILE);
        File destinations =new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\Ola.png");
        FileHandler.copy(source, destinations);
        
        driver.findElement(By.xpath("//button[@type='button']")).click();
        TakesScreenshot  sc1=(TakesScreenshot)driver;
        File source1=sc1.getScreenshotAs(OutputType.FILE);
        File destinations1 =new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\Olabook.png");
        FileHandler.copy(source1, destinations1);
        
        driver.findElement(By.id("login")).click();
        driver.findElement(By.xpath("//input[id='phone-number']")).sendKeys("3454543678");
        driver.findElement(By.xpath("//div[@class='sso__cta']")).click();
	}

}
