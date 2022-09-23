package PARAMETERIZATION;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Ex1_getstring {


	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	FileInputStream file =new FileInputStream("C:\\Users\\Dell\\Desktop\\AAA.xlsx");
	//	double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(3).getNumericCellValue();
		
	//	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(3).getStringCellValue();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
//	  Date date = new Date();
	
 //    String date1 = date.toString().replace(' ', '_').replace(':', '-');
	  
	  String date1 = RandomString.make(3);
	  
		
      File Dest = new File("C:\\Users\\Dell\\Pictures\\Screenshots\\Text"+date1+".jpg");
     
      FileHandler.copy(source, Dest);
             
	//System.out.println(data);

	}

}
