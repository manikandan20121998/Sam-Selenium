package org.test.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskOne {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.amazon.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone x",Keys.ENTER);
		
		WebElement first = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		Actions a=new Actions(driver);
		
		a.contextClick(first).perform();
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		
       Set<String> allid = driver.getWindowHandles();
       System.out.println(allid);
       
       List<String> li=new ArrayList<>();
       
       li.addAll(allid);
       
       driver.switchTo().window(li.get(1));
       
       WebElement add = driver.findElement(By.xpath("//a[@title='Add to List']"));
       add.click();
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
