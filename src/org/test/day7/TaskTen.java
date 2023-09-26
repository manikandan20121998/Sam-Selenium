package org.test.day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTen {

	public static void main(String[] args) throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ser = driver.findElement(By.id("twotabsearchtextbox"));
		ser.sendKeys("motorolo");
		
		WebElement serc = driver.findElement(By.id("nav-search-submit-button"));
		serc.click();
		
		Thread.sleep(3000);
		
		TakesScreenshot st=(TakesScreenshot)driver;
		
		File src = st.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\screenshot\\motorola.png");
		
		FileUtils.copyFile(src, des);
		
		System.out.println("maddy..........");

	}

}

