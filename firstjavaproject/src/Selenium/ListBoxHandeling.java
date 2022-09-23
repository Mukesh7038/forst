package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandeling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();                  // Upcasting operation perform
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		
	//	System.out.println(day.getText());
		
		Select s = new Select(day);
		                                                  // selectByVisibleText  
		s.selectByIndex(30);                              // selectByIndex Method
		s.selectByValue("30");                            // SelectByValue Method
		
		System.out.println(s.getFirstSelectedOption());
		
		List<WebElement> options = s.getOptions();
		
		System.out.println(options);
		
	//	System.out.println(options.size());               // size() is used to find the total element present in listbox 
		
		for(int i=0; i<=options.size()-1;i++) {
			
	    System.out.println(options.get(i).getText());
	 
	   
		}
		 
	}

}
