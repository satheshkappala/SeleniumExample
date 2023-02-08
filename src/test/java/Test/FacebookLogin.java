package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
	public static String browser="Edge"; 
	public static WebDriver driver;
//	public static ChromeDriver driver;

	@Test
	public void LoginPage() {
		if (browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "E:\\Selenium jatfiles\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium jatfiles\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9640318066");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sathish147");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
	}
}
