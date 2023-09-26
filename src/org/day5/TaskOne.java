package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a=new Actions(driver);
		
		
		WebElement src = driver.findElement(By.id("credit2"));
		
		WebElement des = driver.findElement(By.id("bank"));
		
		a.dragAndDrop(src, des).perform();
		
		
		//another way
		Thread.sleep(3000);
		WebElement src1 = driver.findElement(By.id("fourth"));
		
		WebElement des1 = driver.findElement(By.id("amt7"));
		
		a.dragAndDrop(src1, des1).perform();
		
		//another way2
		Thread.sleep(3000);
		WebElement src2 = driver.findElement(By.id("credit1"));
		
		WebElement des2 = driver.findElement(By.id("loan"));
		
		a.dragAndDrop(src2, des2).perform();
		
		
		Thread.sleep(3000);
		WebElement src3 = driver.findElement(By.id("fourth"));
		
		WebElement des3 = driver.findElement(By.id("amt8"));
		
		a.clickAndHold(src3).release(des3).perform();
		
		
		
	System.out.println("done");
		
	}

}
