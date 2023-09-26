package org.test.day10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
//		WebElement close = driver.findElement(By.xpath("//span[@aria-hidden='true']"));
//		close.click();
//		
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		WebElement scroll = driver.findElement(By.xpath("//button[@value='CONTACT US']"));
		je.executeScript("arguments[0].scrollIntoView(true)",scroll );
		
		
		

		WebElement test2 = driver.findElement(By.xpath("//div[@data-target='#311110']"));
		je.executeScript("arguments[0].click()", test2);
		
		
		WebElement testpaper = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		je.executeScript("arguments[0].click()", testpaper);
		
		WebElement win = driver.findElement(By.xpath("(//button[@class='let-us-now pinkbutton ga-click'])[33]"));
		je.executeScript("arguments[0].click()", win);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		for(String each:all) {
			if(!parent.equals(each)) {
				driver.switchTo().window(each);
			}
		}
	//	driver.switchTo().window("http://greenstech.in/SeleniumDay10Task.txt");
		WebElement print = driver.findElement(By.xpath("//meta[@name='color-scheme']"));
		System.out.println(print.getText());
	
		System.out.println("done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
