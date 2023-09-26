package org.test.rough;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	WebElement fr = driver.findElement(By.id("frame1"));
//	driver.switchTo().frame(fr);
//	WebElement txt = driver.findElement(By.xpath("//*[@id='topic']//following::input"));
//	txt.sendKeys("mani");
//	
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("window.open()");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().newWindow(WindowType.WINDOW);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
