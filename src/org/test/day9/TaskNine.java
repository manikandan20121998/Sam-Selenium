package org.test.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskNine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("manimaddym");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("mani@007");
		
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		
		WebElement fs1 = driver.findElement(By.id("location"));
		
		Select s=new Select(fs1);
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("Get all options normal for loop..");
		s.selectByIndex(3);
		
		for(int i=1; i<options.size(); i++) {
			WebElement ops = options.get(i);
			String text = ops.getText();
			System.out.println(text);
		}
		
		WebElement ops2 = driver.findElement(By.id("hotels"));
		
		Select s2=new Select(ops2);
		
		List<WebElement> options2 = s2.getOptions();
		int size = options2.size();
		System.out.println("second option loop......");
		for (int i=1; i<size; i++) {
			WebElement opt2 = options2.get(i);
			System.out.println(opt2.getText());
			
		}
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		roomtype.sendKeys("Double");
		
		System.out.println("Enhanced for loop.....");
		for(WebElement x:options2) {
			System.out.println(x.getText());
		}
		WebElement op3 = driver.findElement(By.id("room_nos"));
		
		Select s3=new Select(op3);
		List<WebElement> options3 = s3.getOptions();
		for(int i=1; i<options3.size(); i++) {
			WebElement pt3 = options3.get(i);
			System.out.println(pt3.getAttribute("value"));
		}
		s3.selectByValue("7");
		
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adultroom);
		
		List<WebElement> options4 = s4.getOptions();
		for (WebElement y:options4) {
			System.out.println(y.getText());
		}
		
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s5=new Select(childroom);
		List<WebElement> options5 = s5.getOptions();
		int size2 = options5.size();
//	System.out.println(size2);
		for (int  i=1; i<size2; i++) {
			WebElement ot5 = options5.get(i);
			System.out.println(ot5.getText());
		}
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
