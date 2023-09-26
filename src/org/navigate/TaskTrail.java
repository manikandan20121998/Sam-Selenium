package org.navigate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTrail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	//	driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		driver.navigate().to("http://flipkart.com/");// if you open url  through to, is not waiting for implicitly wait... 
		driver.navigate().to("http://facebook.com/");
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.navigate().to("http://facebook.com/");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//isDisplayed
		 WebElement user = driver.findElement(By.id("email"));
		 boolean displayed = user.isDisplayed();
		 System.out.println(displayed);
	
		 //isEnabled
		 WebElement log = driver.findElement(By.name("login"));
		 boolean enabled = log.isEnabled();
		 System.out.println(enabled);
		 
		//isSelected
		 
		 WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		 btn.click();
		 Thread.sleep(3000);
		 WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		 
		 boolean selected = radio.isSelected();
		 System.out.println(selected);
		 
		radio.click();
		boolean selected2 = radio.isSelected();
		System.out.println(selected2);
		
		

		

	}

}
