package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(" //*[@id='gh-ac']")).sendKeys("mobile");
	driver.findElement(By.xpath(" //*[@id='gh-btn']")).click();
	
	driver.close();
	
	}
}
