package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest_MyCF {
	
	WebDriver driver;
	
	@Parameters({ "Browser" })
	@BeforeClass
	public void launchBrowser(String Browser) {
	//	System.setProperty("webdriver.chrome.driver", "E:\\Selenium jatfiles\\chromedriver.exe");
	//	System.setProperty("webdriver.edge.driver", "E:\\Selenium jatfiles\\msedgedriver.exe");
	//	driver = new EdgeDriver();
	//	driver = new ChromeDriver();
	//	driver.get("https://www.mycontactform.com/");
	//	driver.manage().window().maximize();
		
		switch (Browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium jatfiles\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "E:\\Selenium jatfiles\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "ff": case "firefox":
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium jatfiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Invalid Browser.......!");
			break;
		}
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void browserMethods() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sample Forms")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle()); // browser session ID
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit(); //Terminate the browser session
	}

}
