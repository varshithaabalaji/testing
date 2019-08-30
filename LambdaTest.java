package com.var;



import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTest {
static WebDriver driver;

@BeforeClass
public static void BrowserOpen() {
System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

@Test
public void Register_User() {
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("https://www.lambdatest.com/ ");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[text()='Free Sign Up']")).click();
driver.findElement(By.xpath("//input[@name='organization_name']")).sendKeys("LambdaTest");
driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test");

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("User2@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("TestUser123");
driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9988776655");
driver.findElement(By.xpath("//button[text()='Free Signup']")).click();
String url = driver.getCurrentUrl();
assertEquals("fail- unable to register", url, "https://accounts.lambdatest.com/user/email-verification");
}

@AfterClass
public static void BrowserClose() {
driver.quit();
}
}
