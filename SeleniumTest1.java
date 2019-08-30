package com.var;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://localhost:8080/spring-security-demo/showMyLoginPage");
        
        WebElement name= driver.findElement(By.xpath("/html/body/form/p/input"));
        name.sendKeys("var");
        
        Thread.sleep(3000);
        
        WebElement pass = driver.findElement(By.xpath("/html/body/form/input"));
        pass.sendKeys("test12");
        
        Thread.sleep(3000);
        
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        
        Thread.sleep(3000);
		
        driver.quit();
	}

}
