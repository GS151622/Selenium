import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeDriver = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\SHARMSX14\\eclipse\\Libraries\\Drivers\\chromedriver.exe";
		String url = "https://www.cleartrip.com/";

		System.setProperty(chromeDriver, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		Thread.sleep(2000);

		// driver.switchTo().alert().dismiss();
		// driver.findElement(By.cssSelector("input[class = 'ui-state-default
		// ui-state-highlight ']" "option[value='2']")).click();

		//
		Select s = new Select(driver.findElement(By.xpath("//select[@value='2'")));

		Thread.sleep(2000);
		driver.quit();
	}
}
