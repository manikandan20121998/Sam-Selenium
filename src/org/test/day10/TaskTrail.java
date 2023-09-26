package org.test.day10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTrail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement inp = driver.findElement(By.name("q"));
		inp.sendKeys("vivo",Keys.ENTER);
		
		WebElement link = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].click()", link);
		//switch to window
		//getwindowhandle---->parent window id
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		//get window handles --->all window ids
		Set<String> allids = driver.getWindowHandles();
		System.out.println("Allid......");
		System.out.println(allids);
		System.out.println("thats it");
		
		// switch to window by looping
		for (String eachids:allids) {
			if(!parentid.equals(eachids)) {
				driver.switchTo().window(eachids);
			}
		}
		Thread.sleep(3000);
		WebElement btnadd = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		btnadd.click();
		Thread.sleep(3000);
		WebElement btnhelp = driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[7]"));
		btnhelp.click();
		//parent window id
		String parentid2 = driver.getWindowHandle();
		System.out.println(parentid2);
		
		//all window ids
		Set<String> allid2 = driver.getWindowHandles();
		System.out.println(allid2);
		
//1-m		//switch to window
		for(String eachid2:allid2) {
			if(!parentid2.equals(eachid2)) {
				driver.switchTo().window(eachid2);
			}
		}
//2-m		//looping count
		int count=0;
		for(String eachid2:allid2) {
			if(count==2) {
				driver.switchTo().window(eachid2);
			}
			count++;
		}
		
//	3-m	//set to list
		List<String> li=new ArrayList<>();
		li.addAll(allid2);
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(3000);
		WebElement linkview = driver.findElement(By.xpath("//span[text()='View More']"));
		linkview.click();
		
		Thread.sleep(3000);
		//come to first window
		driver.switchTo().window(li.get(0));
		
		Thread.sleep(3000);
//close
		driver.close();
		Thread.sleep(5000);
		
		//quit
		driver.quit();
		
		
	}

}
