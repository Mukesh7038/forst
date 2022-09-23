package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	
	public static void main(String[] args) throws InterruptedException {
		
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	     
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.facebook.com/");
	     
	     Thread.sleep(2000);
	     
	     driver.navigate().to("https://www.google.com/");
	     
	     Thread.sleep(2000);
	     
	    
	     
	     driver.switchTo().newWindow(WindowType.TAB);
	     
	     driver.get("https://www.amazon.in/");
	     
	     driver.navigate().back();
	     
	     Thread.sleep(2000);
	     
	     
	}

}
