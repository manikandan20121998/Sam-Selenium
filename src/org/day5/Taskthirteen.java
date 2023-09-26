package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskthirteen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a=new Actions(driver);
		
		WebElement mobile = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		
		WebElement click = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/products/mobiles-flip-cases-covers?sort=plrty']"));
		
		a.moveToElement(mobile).click(click).perform();
		
		
		
		
		
		
		
		
		

	}

}
