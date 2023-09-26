package org.test.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskSeven {

	public static void main(String[] args) throws AWTException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
		//	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));
		
		
		WebElement clk = driver.findElement(By.xpath("//div[@class='card-headercore-sel d-flex align-items-center justify-content-between']"));
		clk.click();
		
		
		Actions a=new Actions(driver);
		
		
		WebElement txt = driver.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[18]"));
		a.contextClick(txt).perform();
		
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		

	}

}
