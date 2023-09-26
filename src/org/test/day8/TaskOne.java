package org.test.day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		WebElement alt = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alt.click();
		Alert simple = driver.switchTo().alert();
		String text = simple.getText();
		System.out.println(text);
		simple.accept();
		
		
		WebElement conalt = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		conalt.click();
		
		WebElement alt1 = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"));
		alt1.click();
		
		Alert confirm = driver.switchTo().alert();
		String text2 = confirm.getText();
		System.out.println(text2);
		confirm.dismiss();
		
		WebElement promtalt = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		promtalt.click();
		
		WebElement alt2 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		alt2.click();
		
		Alert promt = driver.switchTo().alert();
		String text3 = promt.getText();
		System.out.println(text3);
		
		promt.sendKeys("this is manimaddy");
		promt.accept();
		
	}

}
