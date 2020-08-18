import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeDriver = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\SHARMSX14\\eclipse\\Libraries\\Drivers\\chromedriver.exe";
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		String str = "Sushil Sharma";
		
		System.setProperty(chromeDriver, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(str);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		if(driver.switchTo().alert().getText().contains(str)){
			System.out.println("text " + str+" found");
		}
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Sushil");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.quit();
	}	

}
