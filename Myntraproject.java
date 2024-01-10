package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.util.concurrent.FluentFuture;

import dev.failsafe.internal.util.Durations;

public class Myntraproject {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_115\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.myntra.com");
         driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(80));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         Actions action=new Actions(driver);
         action.moveToElement(driver.findElement(By.xpath("//a[@style='border-bottom-color:#ee5f73;']"))).build().perform();
         action.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'men-tshirts')]"))).click().build().perform();
         Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
        		 .withTimeout(Duration.ofSeconds(30))
        		 .pollingEvery(Duration.ofSeconds(3))
        		 .ignoring(NoSuchElementException.class);
         driver.findElement(By.xpath("//div[@class='brand-more']")).click();
  //       driver.findElement(By.xpath("//li[contains(text(),'H')]")).click();
         driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("here");
         driver.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click();
         driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).clear();
         driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("HRX");
         driver.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click();
         driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).clear();
         driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
         String hrx=driver.findElement(By.xpath("//img[@title='HRX by Hrithik Roshan Men Yellow Printed Cotton Pure Cotton T-shirt']")).getAttribute("title");     
         Assert.assertEquals("HRX by Hrithik Roshan Men Yellow Printed Cotton Pure Cotton T-shirt",hrx,"title is not matching");
         String Title=driver.getTitle();
         System.out.println(Title);
         Assert.assertEquals("Myntra Fashion Store - Shop for Latest Fashionable Collection Online | Myntra",Title,"is not match");
	     driver.quit();
	
	}

}
