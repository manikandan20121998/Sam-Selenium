package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskThree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get(" http://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a=new Actions(driver);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		a.click(close).perform();
		
		WebElement home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		
		a.moveToElement(home).perform();
		
		WebElement homfur = driver.findElement(By.xpath("//a[@class='_6WOcW9']"));
		a.moveToElement(homfur).perform();
		
		WebElement both = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[8]"));
		a.click(both).perform();
		
		System.out.println("done");
		
		
		
		
		
		
		

	}

}
