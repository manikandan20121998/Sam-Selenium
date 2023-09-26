package org.test.day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll down
		WebElement add = driver.findElement(By.xpath("(//div[@class='trainer-info'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", add);
		
		TakesScreenshot tk=(TakesScreenshot)driver;
	
		File src = tk.getScreenshotAs(OutputType.FILE);		 
		File des=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\screenshot\\perumbakkam.png");
		
		FileUtils.copyFile(src, des);
		System.out.println("man man..");	
		
		
			

	}

}
