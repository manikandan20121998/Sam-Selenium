package org.test.day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		
		WebElement user = driver.findElement(By.id("username"));
		je.executeScript("arguments[0].setAttribute('value','mani')", user);
		
		WebElement pass = driver.findElement(By.id("password"));
		je.executeScript("arguments[1].setAttribute('value','3733')", user,pass);
		
		WebElement log = driver.findElement(By.id("login"));
		je.executeScript("arguments[0].click()", log);
		
		
		System.out.println("mani");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
