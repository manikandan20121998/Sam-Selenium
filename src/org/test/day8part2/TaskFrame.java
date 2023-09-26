package org.test.day8part2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFrame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	List<WebElement> frame = driver.findElements(By.tagName("iframe"));
	System.out.println(frame.size());
	//	driver.switchTo().frame(3);
	
//		WebElement cl1 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
//		cl1.click();
//		
//		driver.switchTo().frame(1);
//	//	driver.switchTo().frame(10);
//		
//		WebElement txt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		txt.sendKeys("mani");
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
