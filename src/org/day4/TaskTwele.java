package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwele {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.shopclues.com/wholesale.html");
		
		WebElement sea = driver.findElement(By.id("autocomplete"));
		sea.sendKeys("shoes");
		
		
		WebElement clk = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		clk.click();
		
       
		
		
	}

}
