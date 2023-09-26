package org.test.day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(" https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> an = driver.findElements(By.tagName("frame"));
		int size = an.size();
		System.out.println(size);
		
		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);
		
		WebElement con = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		con.click();
		
		Alert sim = driver.switchTo().alert();
		sim.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
