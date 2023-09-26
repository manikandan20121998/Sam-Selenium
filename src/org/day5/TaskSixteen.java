package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskSixteen {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    Actions a=new Actions(driver);
		
		WebElement lan = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		a.moveToElement(lan).perform();
		
		WebElement clk = driver.findElement(By.xpath("(//span[@style='unicode-bidi:isolate; direction:ltr;'])[5]"));
		a.click(clk).perform();
		
		WebElement sign = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		WebElement clk2 = driver.findElement(By.xpath("(//span[@class='nav-text'])[14]"));
		
		a.moveToElement(sign).click(clk2).perform();
		
		
			
		
	}

}
