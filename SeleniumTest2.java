package com.var;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200");
		
//		WebElement name = driver.findElement(By.name("name"));
//		name.sendKeys("Upanya");
		
//		WebElement add = driver.findElement(By.id("addActor"));
//		add.findElement(By.name("name")).sendKeys("Meet");
//		add.findElement(By.name("city")).sendKeys("Mumbai");
//		add.findElement(By.name("rating")).sendKeys("10");
		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.name("button1"));
		button.click();
		
		Thread.sleep(3000);
		
		WebElement button1 = driver.findElement(By.name("button2"));
		button1.click();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
