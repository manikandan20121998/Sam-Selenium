package org.test.day8part2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> frame = driver.findElements(By.tagName("frameset"));
		int size = frame.size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		

		WebElement conti = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		conti.click();
		
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		WebElement cusid = driver.findElement(By.name("fldLoginUserId"));
		cusid.sendKeys("manimaddy");
		
		

	}

}
