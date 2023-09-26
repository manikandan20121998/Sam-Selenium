package org.test.day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorTrail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		//je using sendkeys-->setattribute
		WebElement user = driver.findElement(By.id("email"));
		je.executeScript("arguments[0].setAttribute('value','mani')", user);
		
		WebElement pass = driver.findElement(By.id("pass"));
		je.executeScript("arguments[1].setAttribute('value','3733')", user,pass);
		
		//je using getattribute
		
		Object atuser = je.executeScript("return arguments[0].getAttribute('value')", user);
		
		System.out.println(atuser);
		String s=(String)atuser;
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
