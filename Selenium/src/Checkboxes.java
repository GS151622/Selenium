import java.util.List;

import org.testng.Assert;
import org.testng.asserts.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String webDriver = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\SHARMSX14\\eclipse\\Libraries\\Drivers\\chromedriver.exe";
		String url = "https://www.spicejet.com/";
		
		System.setProperty(webDriver, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//Click on checkbox
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		//Check if checkbox is selected or not
		//System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		//Find all checkboxes. Idea is to look for common locator and print total number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());
		
		driver.quit();
		
	}

}
