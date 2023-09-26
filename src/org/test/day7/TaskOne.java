package org.test.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {

	public static void main(String[] args) throws IOException, InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\screenshot\\greenstech.png");
		Thread.sleep(2000);
		
		
		FileUtils.copyFile(screenshotAs,des );
		

		
		
		
		

	}

}
