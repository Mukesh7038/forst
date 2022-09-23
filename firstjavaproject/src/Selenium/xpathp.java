package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathp { public static void main(String[] args) {
	
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple Mobiles");
	
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	
	driver.findElement(By.xpath("//span[text()='Apple']")).click();
	
	driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 11 Pro Max')]")).click();
	
	
	
	
	
   }

}
