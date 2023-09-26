package org.css;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
	
	public static void main(String[] args) {
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("http://greenstech.in/selenium-course-content.html");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//	WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Book')]"));
//	String al = text.getAttribute("style");
//	System.out.println(al);
//	System.out.println(text.getCssValue("font-weight"));
//	System.out.println(text.getCssValue("color"));
//	System.out.println(text.getCssValue("font-size"));
//	System.out.println(text.getCssValue("background-color"));
//	System.out.println(text.getCssValue("text-align"));
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
	WebElement tx = driver.findElement(By.id("email"));
	tx.sendKeys("mani");
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("arguments[0].setAttribute('style','background:yellow;border-color:red')", tx);	
	
		
		
		
		
		
	}
	
}
