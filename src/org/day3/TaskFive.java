
package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFive{

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		
		    driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		
		WebElement inter = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		inter.click();
		
		
		WebElement cts = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']"));
		cts.click();
		
		
		

		

	}

}

