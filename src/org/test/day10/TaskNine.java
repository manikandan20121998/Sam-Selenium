package org.test.day10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		
		WebElement ser = driver.findElement(By.name("q"));
		ser.sendKeys("redmi phone",Keys.ENTER);
		
		WebElement first = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].click()", first);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		System.out.println("for loop");
		
	for(String eachid:allid) {
			if(!parent.equals(eachid)) {
				driver.switchTo().window(eachid);
			}
		}
		
		WebElement price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		System.out.println(price.getText());
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
