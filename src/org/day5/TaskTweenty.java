package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskTweenty {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.flipkart.com/");
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    Actions a=new Actions(driver);
    
    WebElement closd = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
    closd.click();
    
    Thread.sleep(5000);
    WebElement electro = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[5]"));
    a.moveToElement(electro).perform();
    
    Thread.sleep(3000); 
    WebElement mobile = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[8]"));
    a.moveToElement(mobile).perform();
    
    Thread.sleep(3000);
    WebElement click = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[3]"));
    a.click(click).perform();
 
    System.out.println("done");
    
  
    
    
    
    
    
    
	}

}
