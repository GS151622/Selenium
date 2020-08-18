package com.selenium.basics;
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Options;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String webDriver = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\SHARMSX14\\eclipse\\Libraries\\Drivers\\chromedriver.exe";
		String url = "https://www.facebook.com/";
		
		String usr = "myselfsushilsharma";
		String pwd = "Snesi$dem9";
		
		System.setProperty(webDriver, driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);		
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement 	logIn = driver.findElement(By.id("u_0_b"));

		
		email.sendKeys(usr);
		pass.sendKeys(pwd);
		logIn.click();
		Thread.sleep(10000);
		
		try {
				Thread.sleep(2000);
				driver.switchTo().alert();
				WebElement notNow = driver.findElement(By.className("_6s5d _71pn _-kb segoe"));
				notNow.click();
		}
		catch(NoAlertPresentException ex) {
			System.out.println("No alert");	
		}
		//Thread.sleep(10000);
		//WebElement account = driver.findElement(By.className("s45kfl79 emlxlaya bkmhp75w spb7xbtv i09qtzwb n7fi1qx3 b5wmifdl hzruof5a pmk7jnqg j9ispegn kr520xx4 c5ndavph art1omkt ot9fgl3s rnr61an3"));
		//WebElement logOff = driver.findElement(By.className("oi732d6d ik7dh3pa d2edcug0 qv66sw1b c1et5uql a8c37x1j muag1w35 enqfppq2 jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m"));
		
		//WebElement account = driver.findElement(By.cssSelector("#mount_0_0"));
		//WebElement logOff = driver.findElement(By.cssSelector("a[class = oi732d6d ik7dh3pa d2edcug0 qv66sw1b c1et5uql a8c37x1j muag1w35 enqfppq2 jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m]"));
				
		Thread.sleep(5000);
		WebElement account = driver.findElement(By.xpath("//img[@class='hu5pjgll lzf7d6o1']"));
		
		account.click();
		Thread.sleep(3000);
		
		WebElement logOff = driver.findElement(By.xpath("//i[@class='hu5pjgll m6k467ps sp_mf46IKbrogv sx_966795']"));
		logOff.click();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
