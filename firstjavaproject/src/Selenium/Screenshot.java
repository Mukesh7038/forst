package Selenium;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
    //	String timestamp = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());	          
		
   //	OR
		
	       Date date = new Date();
	String timestamp = date.toString().replace(' ', '_').replace(':', '-');
					
	File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File("C:\\Users\\Dell\\Pictures\\Screenshots\\"+"Text"+timestamp);
	
	FileHandler.copy(sourse, destination);
		
		
	}

}

