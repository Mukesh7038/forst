package Selenium;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassA {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(1000);
	
	driver.navigate().to("https://web.whatsapp.com/");
	
	 Thread.sleep(1000);
	 
	 driver.navigate().back();
	 
	 Thread.sleep(3000);
	 
	 driver.navigate().forward();
	 
	 driver.get("https://www.facebook.com/");
	 
	 Thread.sleep(1000);
	 
	 driver.navigate().refresh();
	
	}
}

