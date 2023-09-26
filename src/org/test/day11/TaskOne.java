package org.test.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/write-xpath-table.html\r\n");
			
			List<WebElement> tables = driver.findElements(By.tagName("table"));
			WebElement table = tables.get(0);
			int size = tables.size();
			System.out.println(size);
			
			String text = table.getText();
			System.out.println(text);
			
			
			
	}

}
