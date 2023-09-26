package org.test.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskFive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement creabtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creabtn.click();
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for(int i=1; i<options.size(); i=i+2) {
			WebElement ops = options.get(i);
			System.out.println(ops.getText());
		}
		
		s.selectByValue("7");
		
		
		
	
		

	}

}
