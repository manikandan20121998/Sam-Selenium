package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskThree {

	public static void main(String[] args)  {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		
		WebElement first = driver.findElement(By.xpath("//input[@type='text']"));
		first.sendKeys("mani");
		
		WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last.sendKeys("maddy");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("kallakuruchi");
		
		WebElement mail = driver.findElement(By.xpath("//input[@Class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
		mail.sendKeys("manimaddy007@gmail.com");
		
		WebElement tel = driver.findElement(By.xpath("//input[@type='tel']"));
		tel.sendKeys("15562562");
		
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();
		
		WebElement cric = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		cric.click();
		
		WebElement hob = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hob.click();
		
		WebElement lan = driver.findElement(By.xpath("//div[@id='msdd']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Tamil')", lan);
		
	//	WebElement drop = driver.findElement(By.xpath("//select[@type='text']"));
	//	select s=new select(drop);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
