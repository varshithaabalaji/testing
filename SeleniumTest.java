package com.var;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("C:\\Users\\verizon\\Documents\\workspace-spring-tool-suite-4-4.3.1.RELEASE\\spring-security-demo-02-custom-login");
        
//        WebElement title=driver.findElement(By.tagName("title"));
        
//        String text = driver.getTitle();
//        System.out.println("The title is: "+text);
        
//        search.sendKeys("verizon");
//        search.submit();
        
        WebElement text = driver.findElement(By.xpath("/html/body/form/p/input"));
        text.sendKeys("var");
        
        WebElement name = driver.findElement(By.xpath("/html/body/form/p/input[2]"));
        name.sendKeys("test123");
        
        Thread.sleep(3000);
        
        WebElement fname = driver.findElement(By.className("fname"));
     fname.sendKeys("Balaji");
        
        List<WebElement> gender = driver.findElements(By.name("Gender"));
         for(WebElement e:gender) {
        	 if(e.getAttribute("value").equals("Female")) {
        		 e.click();
        	 }
         }
        
        List<WebElement> h1Elements = driver.findElements(By.tagName("h1"));
        for(WebElement e :h1Elements) {
        	System.out.println("Found h1:"+e.getText());
        }
        
        WebElement textarea = driver.findElement(By.tagName("textarea"));
        System.out.println("text:"+textarea.getText());
        
        Thread.sleep(3000);
        
        textarea.sendKeys("\nA new comment line here");
        
        Thread.sleep(3000);
        
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        
        Thread.sleep(3000);
        
        
        
//        WebElement button2 = driver.findElement(By.tagName("button"));
//        button2.click();
        
        List<WebElement> buttons = driver.findElements(By.xpath("/html/body/form/button"));
        for(WebElement e :buttons) {
        
        	System.out.println("Element text:"+e.getText());
        	Thread.sleep(3000);
        }
        
//        WebElement button2= driver.findElement(By.xpath("/html/body/p/button[1]"));
//        button2.click();
//        Thread.sleep(3000);
        
//        WebElement h1 = driver.findElement(By.xpath("/html/body/h1"));
//        System.out.println("h1 using x-path is:"+h1.getText());

//   CSS 
//        WebElement button3 = driver.findElement(By.cssSelector("p> button.button"));
//        button3.click();
        
 //   class attribute       
//        WebElement button3 = driver.findElement(By.className("button"));
//      button3.click();
        
//Relative XPATH expression
        
        
        
        Thread.sleep(3000);
        
        driver.quit();
    }

}


