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

public class ScreenshotTrail {

	public static void main(String[] args) throws IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
	//	WebElement user = driver.findElement(By.id("email"));
	//	File src = user.getScreenshotAs(OutputType.FILE);
		
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desti=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\screenshot\\facebook.png");
		File f=new File(System.getProperty("user.dir")+"\\src\\screenshot\\pic.png");
		FileUtils.copyFile(src, desti);
		
		System.out.println("done mani");
		
		
		
	
		
		

	}

}
