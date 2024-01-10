package MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver_114\\chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/accounts/login/");
	    driver.findElement(By.cssSelector("[name=username]")).sendKeys("baswer23@gmail.com"); // name
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("JkkdielkJ@dmd333");  //name
        driver.findElement(By.cssSelector("button._acan _acap _acas")).click();    // tag.class
	}

}
  
