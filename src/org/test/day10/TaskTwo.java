package org.test.day10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("realme",Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement first = driver.findElement(By.xpath("//p[text()='Realme BUDS AIR NEO TWS On Ear Wireless With Mic Headphones/Earphones Red']"));
		first.click();
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		List<String> li=new ArrayList<>();
		li.addAll(all);
		
		driver.switchTo().window(li.get(1));
		
		WebElement add = driver.findElement(By.xpath("//span[text()='add to cart']"));
		add.click();
		
		WebElement pay = driver.findElement(By.xpath("//div[@class='you-pay']"));
        System.out.println(pay.getText());
        
        

	}

}
