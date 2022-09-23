package Selenium;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScrPerticularElement {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String date1 = RandomString.make(3);
		  
		  FileHandler.copy( driver.findElement(By.xpath(" //span[@id='glow-ingress-line2']")).getScreenshotAs(OutputType.FILE), 
				  new File("C:\\Users\\Dell\\Pictures\\Screenshots\\Text"+date1+".jpg") );
	}

}
