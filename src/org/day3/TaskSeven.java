package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSeven {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		
		    driver.get("http://www.cleartrip.com/trains");
		
		

		 WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
		 from.sendKeys("chennai");
		    
		    WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
		    to.sendKeys("madurai");
		    
		    WebElement search = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		    search.click();
		    
		    
	}

}
