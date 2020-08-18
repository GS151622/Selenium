import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//We will be using https://www.spicejet.com/ website
		String chromeDriver = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\SHARMSX14\\eclipse\\Libraries\\Drivers\\chromedriver.exe";
		String url = "https://www.spicejet.com/";
		
		System.setProperty(chromeDriver, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(5000);
		
		/*
		 * find the element by ID and click
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		//XPath for Amritsar //a[@value='ATQ']
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		Thread.sleep(2000);
		//XPath for Chennai //a[@value='MAA']
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //Accessing the second element
		*/
		
		//Using parent child relationship for doing the click element
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		//XPath for Amritsar //a[@value='ATQ']
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		Thread.sleep(2000);
		//xpath of parent <space> xpath of child
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction'] //a[@value='MAA']")).click();
		
		//driver.quit();
	}

}
