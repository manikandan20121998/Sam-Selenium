package org.test.rough;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadApp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement choose = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		choose.sendKeys("C:\\Users\\MANI MADDY\\Desktop\\task.xlsx");
		
		WebElement choose1 = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		choose1.sendKeys("C:\\Users\\MANI MADDY\\Desktop\\github project\\sample_Test_Case_Template.xlsx");
		System.out.println(".................");
	}

}
