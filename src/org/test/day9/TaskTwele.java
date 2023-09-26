package org.test.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskTwele {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement fruit = driver.findElement(By.id("fruits"));
		
		Select s=new Select(fruit);
		
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		
		System.out.println("looping.");
		
		for ( int i=2; i<size; i=i+2) {
			s.selectByIndex(i);
			
		}
		
		
		
	

	}

}
