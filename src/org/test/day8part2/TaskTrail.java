package org.test.day8part2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskTrail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		int size = frames.size();
		System.out.println("frames size is "+size);
		
		//switch to frames
		// by index
	//	driver.switchTo().frame(0);
		
		//by String id or name
	//	driver.switchTo().frame("frame1");
		
		//by webelement
		WebElement fra1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(fra1);
		
	  //find webelement
		WebElement txt = driver.findElement(By.xpath("//b[@id='topic']//following::input"));
		txt.sendKeys("mani maddy");
		
		driver.switchTo().defaultContent();
		
		//switch another frame
		
		driver.switchTo().frame(1);
		
		WebElement dropdown = driver.findElement(By.id("animals"));
		
		Select s=new Select(dropdown);
		
		List<WebElement> options = s.getOptions();
		int size2 = options.size();
		System.out.println(size2);
		
		for(int i=0; i<size2; i=i+1) {
			WebElement ops = options.get(i);{
				if(i==3) {
					s.selectByIndex(i);
				}
			}
		}
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.id("a"));
		clk.click();
		
		driver.switchTo().parentFrame();
		
		txt.sendKeys("king");
	}

}
