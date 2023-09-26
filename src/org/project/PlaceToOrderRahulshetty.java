package org.project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PlaceToOrderRahulshetty {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
	search.sendKeys("onion",Keys.ENTER);
	
	WebElement incre = driver.findElement(By.xpath("//a[@href='#']"));
	
	for (int i = 0; i < 5; i++) {
		JavascriptExecutor  je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].click()",incre);
	}
	WebElement addtocard = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	JavascriptExecutor  je=(JavascriptExecutor)driver;
	je.executeScript("arguments[0].click()",addtocard);
	
	WebElement card = driver.findElement(By.xpath("//img[@alt='Cart']"));
	card.click();
	
	WebElement checkout = driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
	checkout.click();
	
	WebElement place = driver.findElement(By.xpath("//button[text()='Place Order']"));
	place.click();
	
	WebElement country = driver.findElement(By.xpath("//div[@class='wrapperTwo']//following::div/select"));
	Select s=new Select(country);
	List<WebElement> alloption = s.getOptions();
	int size = alloption.size();
	System.out.println(size);
	for (int i = 1; i <alloption.size(); i++) {
		String text = alloption.get(i).getText();
		System.out.println(text);
	}
	s.selectByIndex(10);
	
	WebElement con = driver.findElement(By.xpath("//input[@type='checkbox']"));
	con.click();
	
	WebElement placelast = driver.findElement(By.xpath("//button[text()='Proceed']"));
	placelast.click();
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Screenshot\\billrahulshetty.png");
	FileUtils.copyFile(src, des);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
