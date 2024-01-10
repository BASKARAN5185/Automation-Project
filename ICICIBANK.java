package MyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ICICIBANK {
    WebDriver driver; 
	@BeforeClass
    public void openicicibank() {
			System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_115\\chromedriver.exe");
			driver=new ChromeDriver();
			 driver.manage().window().maximize();
	         driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(80));
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         driver.get("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page");	
    }
    
	@Test(priority=1)
    public void openaccount() {

      driver.findElement(By.xpath("//div[@id='modal-close']")).click();
      Actions action=new Actions(driver);
      WebElement account=driver.findElement(By.xpath("//div[@class='menu-item']"));
      action.moveToElement(account).build().perform();
      action.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Savings Account')]"))).build().perform();      
      action.moveToElement(driver.findElement(By.xpath("//a[text()='Savings Account']"))).click().build().perform();
    }
    
	@Test(priority=2)
    public void opennewbankaccount(){
      driver.findElement(By.xpath("//a[@href='https://buy.icicibank.com/ucj/index?ius=UPIC3146IC&iup=SAVR2M7EU8P&ITM=nli_CMS_SA_savingsaccount_instasaveaccountpage_bannercta_opencta&_gl=1*1kttftr*_ga*MTI5MTEzOTc0Mi4xNjUyMzMyMzU0*_ga_SKB78GHTFV*MTY1NjQ5MTE5MS4xODQuMS4xNjU2NDk0NTI3LjU4']")).click();   
      driver.findElement(By.xpath("//button[contains(text(),'Go to ICICI Bank')]")).click();
      driver.findElement(By.xpath("//p[contains(text(),'Open Insta Save Account in 4 minutes.')]")).click();
      driver.findElement(By.xpath("//button[contains(text(),'Go to ICICI Bank')]")).click();
        
    }
    
	@Test(priority=3)
    public void creidtcard() {
    	driver.findElement(By.xpath("//p[contains(text(),'Get the right card for you.')]")).click();
    	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8765985467");
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ggggdfft@gmail.com");
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.ENTER);
    	driver.findElement(By.xpath("//input[@id='pan_f1']")).sendKeys("EIPPB");
    	driver.findElement(By.xpath("//input[@id='pan_f1']")).sendKeys("1888");
    	driver.findElement(By.cssSelector("#pan_f3")).sendKeys("D");
    	driver.findElement(By.cssSelector("#mobileConsentCheck")).click();
    }
    	
	@Test(priority=4)
    public void otp() {	
     	driver.findElement(By.xpath("//input[@id='one']")).sendKeys("4");
    	driver.findElement(By.xpath("//input[@id='two']")).sendKeys("3");
    	driver.findElement(By.xpath("//input[@id='three']")).sendKeys("5");
    	driver.findElement(By.xpath("//input[@id='four']")).sendKeys("3");
    	driver.findElement(By.xpath("//input[@id='five']")).sendKeys("5");
    	driver.findElement(By.xpath("//input[@id='six']")).sendKeys("4");
    	driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
    }
    
    @AfterClass
    public void close() {
    	driver.quit();
    	
    }
 


}











