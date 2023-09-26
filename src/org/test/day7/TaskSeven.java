package org.test.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSeven {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		WebElement inte = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		inte.click();
		
		Thread.sleep(3000);
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\screenshot\\interview.png");
		Thread.sleep(3000);
		
		FileUtils.copyFile(screenshotAs, des);
		
		System.out.println("done...");
		
		
	}

}
