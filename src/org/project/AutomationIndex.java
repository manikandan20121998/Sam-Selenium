package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class AutomationIndex {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	WebElement clk = driver.findElement(By.id("dynamicProviderLink"));
//	clk.click();
//	Thread.sleep(3000);
//	Robot r=new Robot();
//	
//	for (int i = 0; i < 3; i++) {
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//			
//	}
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	Thread.sleep(3000);
//	TakesScreenshot tk=(TakesScreenshot)driver;
//	File src = tk.getScreenshotAs(OutputType.FILE);
//	File des=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Screenshot");
//	FileUtils.copyFile(src, des);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
