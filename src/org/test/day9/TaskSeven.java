package org.test.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskSeven {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select s=new Select(country);
		
		List<WebElement> options = s.getOptions();
		for(int i=0; i<options.size(); i++) {
			WebElement ops = options.get(i);
		//	whatever we use this below two types
		//	System.out.println(ops.getText());
		//	System.out.println(ops.getAttribute("value"));
		}
		
		s.selectByIndex(7);
		
		
		
		
		
		

		
	}

}
