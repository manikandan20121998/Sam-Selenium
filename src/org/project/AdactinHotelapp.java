package org.project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelapp {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
//		driver.get("http://demoqa.com/automation-practice-form/");
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("manimaddy");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("SXJ3T3");
		
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		
		WebElement loc = driver.findElement(By.id("location"));
		
		
		Select s=new Select(loc);
	//	s.selectByIndex(1);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByVisibleText("London");
		
		WebElement ho = driver.findElement(By.id("hotels"));
		
		Select s1=new Select(ho);
		s1.selectByIndex(1);
		
		WebElement room= driver.findElement(By.id("room_type"));
		
		Select s3=new Select(room);
		//get all options
		List<WebElement> options = s3.getOptions();
		int size = options.size();
		System.out.println(size);
		
		
		WebElement ops = options.get(2);
		String text = ops.getText();
		System.out.println(text);
		
		s3.selectByVisibleText("Double");
		
		System.out.println("normal looping............");
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
	  Select s4=new Select(roomno);
	  List<WebElement> options2 = s4.getOptions();
	  int size2 = options2.size();
	  for(int i=1; i<options2.size(); i++) {
		  WebElement opss2= options2.get(i);
		  String txt2 = opss2.getText();
		  System.out.println(txt2);
	  }
	  
		s4.selectByIndex(3);
		
		//Enhancedfor loop
		System.out.println("enhanced fo loop..........");
		for(WebElement x:options2) {
			String text2 = x.getText();
			System.out.println(text2);
		}
		
		WebElement date1 = driver.findElement(By.name("datepick_in"));
		date1.sendKeys("27/07/2022");
		
		WebElement date2 = driver.findElement(By.name("datepick_out"));
		date2.sendKeys("28/7/22");
		
		WebElement auroom = driver.findElement(By.id("adult_room"));
	Select s5=new Select(auroom);
	s5.selectByIndex(3);
		
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s6=new Select(childroom);
		s6.selectByValue("2");
		
		WebElement clk = driver.findElement(By.id("Submit"));
		clk.click();
		Thread.sleep(3000);
	    TakesScreenshot tk=(TakesScreenshot)driver;
	    File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Screenshot\\adacthotel.png");
		FileUtils.copyFile(src, des);
		driver.close();
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
