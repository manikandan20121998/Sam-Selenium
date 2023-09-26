package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		
		
		WebElement clk = driver.findElement(By.xpath("//input[@type='text']"));
		clk.sendKeys("iphone");
		
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
	

	}

}
