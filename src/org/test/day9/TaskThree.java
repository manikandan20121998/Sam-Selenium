package org.test.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskThree {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement creabtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creabtn.click();
		
		
		WebElement yr = driver.findElement(By.name("birthday_year"));
		
		Select s=new Select(yr);
		
		List<WebElement> options = s.getOptions();
		
		int size = options.size();
		System.out.println(size);
		
		System.out.println("enhanced for loop");
		
		for(WebElement x:options) {
			System.out.println(x.getAttribute("value"));
		}
		
		//my task
		s.selectByIndex(7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
