package ZerodhaProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutDDF {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("userid")).sendKeys("OKP335");
		driver.findElement(By.id("password")).sendKeys("WSX12345");
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		driver.findElement(By.id("pin")).sendKeys("7654321");
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
