package com.selenium.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARMSX14\\eclipse\\Libraries\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_m = driver.findElement(By.id("month"));
		Select month_m1 = new Select(month_m);
		Thread.sleep(2000);
		month_m1.selectByValue("10"); 
		
		WebElement day_d = driver.findElement(By.id("day"));
		Select day_d1 = new Select(day_d);
		Thread.sleep(3000);
		day_d1.selectByValue("10");
		
		WebElement year_y = driver.findElement(By.id("year"));
		Select year_y1 = new Select(year_y);
		Thread.sleep(2000);
		year_y1.selectByValue("2010");
	}
}
