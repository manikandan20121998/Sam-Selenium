package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskEleven {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("http://www.flipkart.com/");

		
		WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		user.sendKeys("mani");
		String attribute = user.getAttribute("value");
		System.out.println(attribute);
		
		WebElement pss = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pss.sendKeys("maddy");
		String attribute2 = pss.getAttribute("value");
		System.out.println(attribute2);
		
		
		
		

	}

}
