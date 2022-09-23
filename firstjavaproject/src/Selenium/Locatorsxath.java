package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsxath {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(200);
	
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Mukesh Pawar");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mukesh@123");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
	
	
	}

}
