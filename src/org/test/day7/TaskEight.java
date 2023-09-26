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

public class TaskEight {

	public static void main(String[] args) throws IOException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		
		WebElement java = driver.findElement(By.xpath("(//h2[@class='mb-0'])[4]"));
		java.click();
		
		TakesScreenshot st=(TakesScreenshot)driver;
		
		File src = st.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\screenshot\\javacore.png");
		
		FileUtils.copyFile(src, des);
		
		System.out.println("mani");
		
		
			
	}

}
