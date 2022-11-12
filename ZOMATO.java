package MyProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ZOMATO {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_106\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.zomato.com/chennai/dine-out");
         driver.findElement(By.className("sc-3o0n99-5 jqszCs")).click();
         driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("3456786754");
         TakesScreenshot scrrenshot=(TakesScreenshot)driver;
         File source=scrrenshot.getScreenshotAs(OutputType.FILE);
         File destinations=new File("C:\\Users\\ELCOT\\Desktop\\Scrren Shot\\image.png");
         FileHandler.copy(source, destinations);
         driver.findElement(By.className("sc-1kx5g6g-2 fdIbOo")).click();
         driver.findElement(By.className("sc-rbbb40-0 cdktuZ")).click();
         driver.quit();
	}
	

}
