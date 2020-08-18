import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestlaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String chromeDriver = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\SHARMSX14\\eclipse\\Libraries\\Drivers\\chromedriver.exe";
		String url = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html";

		System.setProperty(chromeDriver, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(2000);
		driver.findElement(By.id("email-input")).sendKeys("login@codility.com");
		driver.findElement(By.id("password-input")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String strText = driver.findElement(By.className("message success")).getText();
		Assert.assertEquals(strText, "Welcome to Codility");
		
	}

}
