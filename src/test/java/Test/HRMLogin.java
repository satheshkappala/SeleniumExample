package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HRMLogin {
	WebDriver driver;
	@Test
	public void LoginPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium jatfiles\\chromedriver.exe");
		driver = new ChromeDriver();
		  		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username)")).sendKeys("Admin");
		driver.findElement(By.name("password)")).sendKeys("admin23");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
//	public static void main (String[] args) {
//		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
//		driver.findElement(By.className("[name='password']")).sendKeys("admin123");
//		driver.findElement(By.cssSelector(".oxd-button")).click();
//		driver.close();
//	}
		
		
		
	}


