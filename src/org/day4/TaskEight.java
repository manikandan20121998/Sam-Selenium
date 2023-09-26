package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskEight {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
			
		 ChromeOptions co=new ChromeOptions();
		 co.addArguments("--disable-notifications");
		 co.addArguments("--incognito");
			WebDriver driver=new ChromeDriver(co);
			
			
			driver.get("http://adactinhotelapp.com/");

			
			WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
			user.sendKeys("mani");
			String attribute = user.getAttribute("value");
			System.out.println(attribute);
			
			
			WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("maddy");
			String attribute2 = pass.getAttribute("value");
			System.out.println(attribute2);
			
			
			
			
			
			
			
			
	}

}

