package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
 
public class Locators {
	public static String browser="Chrome"; 
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
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.findElement(By.xpath("//*[@name='UserFirstName']")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("kappala");
		driver.findElement(By.xpath("//input[starts-with(@name, 'UserTitle')]")).sendKeys("software engineer");
		driver.findElement(By.xpath("//input[contains(@name, 'erEmail')]")).sendKeys("kappalasathish7@gmail.com");
	

	}
}
