package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooleMeetPage {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
          driver.get("https://www.facebook.com/login/");
          
          Thread.sleep(2000);
          driver.switchTo().newWindow(WindowType.TAB);
          Thread.sleep(2000);
          
          driver.navigate().to("https://apps.google.com/meet/");
          
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("(//span[@class='cta_text'])[3]")).click();
          
          Thread.sleep(1000);
          
        /*  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mukeshpawar7038@gmail.com");
          
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//span[text()='Next']")).click();
       */   

          
	}

}
