package ZerodhaProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class WithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\Zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://kite.zerodha.com/");

		// Entering UN with using DDF 
		String UN = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.id("userid")).sendKeys(UN);
		
		// Entering PWD with DDF
		String PWD = sh.getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.id("password")).sendKeys(PWD);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		// Enter PIN With DDF
		String PIN = sh.getRow(2).getCell(2).getStringCellValue();
		driver.findElement(By.id("pin")).sendKeys(PIN);
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		String ActualUID = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
	    System.out.println(ActualUID);
		String ExptedUID = "OKP335";
		
		if(ActualUID.equals(ExptedUID)) {	
			System.out.println("TC PASS");
		}
		else
			System.out.println("TC FAIL");


	}

}
