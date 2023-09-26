package org.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\RahulshettyAcademy\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement user = driver.findElement(By.id("user-name"));
	user.sendKeys("standard_user");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("secret_sauce");
	
	WebElement log = driver.findElement(By.id("login-button"));
	log.click();
	
	WebElement add = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	add.click();
	
	WebElement addicon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	addicon.click();
	
	WebElement check = driver.findElement(By.id("checkout"));
	check.click();
	
	WebElement conti = driver.findElement(By.id("continue"));
	conti.click();
	
	WebElement first = driver.findElement(By.id("first-name"));
	first.sendKeys("manikandan");
	
	WebElement last = driver.findElement(By.id("last-name"));
	last.sendKeys("manimaddy");
	
	WebElement pin = driver.findElement(By.id("postal-code"));
	pin.sendKeys("600081");
	
	conti.click();
	
	WebElement bill = driver.findElement(By.xpath("//div[@class='summary_info']"));
	System.out.println(bill.getText());
	
	WebElement finish = driver.findElement(By.id("finish"));
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("arguments[0].scrollIntoView(true)", finish);
	finish.click();
	
	
}
}
