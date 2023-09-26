package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskTwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a=new Actions(driver);
		
		WebElement prime = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-amazonprime']"));
		
		
		a.moveToElement(prime).perform();
		
		WebElement clk = driver.findElement(By.id("multiasins-img-link"));
		a.click(clk).perform();
		
		
		
		
		

	}

}
