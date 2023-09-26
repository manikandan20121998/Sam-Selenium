package org.test.day10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTen {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mask",Keys.ENTER);
		
		WebElement mask = driver.findElement(By.xpath("(//a[@target='_blank'])[11]"));
		mask.click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
//		int count=1;
//		for(String each:all) {
//			if(count==2) {
//				driver.switchTo().window(each);
//			}
//		count++;
//		}
		for(String each:all) {
			if(!parent.equals(each)) {
				driver.switchTo().window(each);
			}
		}
		Thread.sleep(5000);
		WebElement pin = driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
		pin.sendKeys("600081");
		String attribute = pin.getAttribute("value");
		System.out.println(attribute);
		
		System.out.println(pin.getAttribute("value"));
		
		

	}

}
