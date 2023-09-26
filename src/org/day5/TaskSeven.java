package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskSeven {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("  http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a=new Actions(driver);
		
		WebElement course = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		WebElement oracal = driver.findElement(By.xpath("(//div[@class='tonclickopen main-cat menu-item'])[3]"));
		
		WebElement click = driver.findElement(By.xpath("//span[contains(text(),'Oracle SQL ')]"));
		a.moveToElement(course).perform();
		a.moveToElement(oracal).perform();
		a.click(click).perform();
		
		
	
		

	}

}

