package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextboxTest {
	
	WebDriver driver;
	
	@BeforeClass
	void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium jatfiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
	}
	@Test
	void textboxMethods() {
	WebElement username =	driver.findElement(By.id("user"));
		System.out.println(username.isDisplayed());
		System.out.println(username.isEnabled());
		System.out.println(username.getAttribute("name"));
		System.out.println(username.getAttribute("type"));
		System.out.println(username.getAttribute("class"));
		System.out.println(username.getAttribute("id "));
		System.out.println(username.getAttribute("tabindex"));
		System.out.println(username.getTagName());
		
		//enter the data
		username.sendKeys("sathish");
		System.out.println(username.getAttribute("value"));
		Assert.assertEquals(username.getAttribute("value"), "sathish", "expected value is not matching with the aActual value");
	}
		
	@AfterClass
	void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
