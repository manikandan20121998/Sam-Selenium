package org.test.day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSix {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].setAttribute('value','manikandan')", user);
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		je.executeScript("arguments[1].setAttribute('value','778383')", user, pass);
		
		WebElement bn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	//	je.executeScript("arguments[0].click()", bn);
		
		
		//print...
		
		Object atuser = je.executeScript("return arguments[0].getAttribute('value')", user);
		String sys = atuser.toString();
		System.out.println(sys);
		
		Object atpass = je.executeScript("return arguments[1].getAttribute('value')", user,pass);
		String s=(String)atpass;
	
		System.out.println(s);
		System.out.println(atpass);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
