import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String chromeDriver = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\SHARMSX14\\eclipse\\Libraries\\Drivers\\chromedriver.exe";
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		
		System.setProperty(chromeDriver, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		
		int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(size);
		
		Assert.assertEquals(size, 3);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
