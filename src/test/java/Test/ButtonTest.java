package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ButtonTest {
	
	
WebDriver driver;
	
	@BeforeClass
	void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium jatfiles\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
	}
	@Test
	void buttonMethods() {
		System.out.println();
		
		
	}
	
	

	@AfterClass
	public void closeBrowser() {
		driver.quit(); //Terminate the browser session
	}

}
