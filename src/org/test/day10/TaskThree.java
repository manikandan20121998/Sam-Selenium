package org.test.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement search = driver.findElement(By.id("headerSearch"));
		search.sendKeys("celling fan",Keys.ENTER);
		
		WebElement first = driver.findElement(By.xpath("//span[@class='product-pod__title__product']"));
		first.click();
		
		
		WebElement remote = driver.findElement(By.xpath("//div[@class='super-sku__inline-tile--space']"));
		remote.click();
		

	}

}
