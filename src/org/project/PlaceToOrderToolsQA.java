package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PlaceToOrderToolsQA {
public static void main(String[] args) throws IOException, AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://shop.demoqa.com/checkout/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement search = driver.findElement(By.xpath("//a[@class='noo-search']"));
	search.click();
	
	WebElement searchtxt = driver.findElement(By.name("s"));
	searchtxt.sendKeys("DRESS",Keys.ENTER);
	
	WebElement first = driver.findElement(By.xpath("(//a[contains(text(),'white')])[1]"));
	first.click();
	
	WebElement colour = driver.findElement(By.id("pa_color"));
	
	Select s=new Select(colour);
	s.selectByVisibleText("White");
	
	WebElement size = driver.findElement(By.id("pa_size"));
	Select s1=new Select(size);
	List<WebElement> options = s1.getOptions();
	options.size();
	s1.selectByVisibleText("Medium");
	
	WebElement plus = driver.findElement(By.xpath("//i[@class='icon_plus']"));
	plus.click();
	
	WebElement addtocard = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
	addtocard.click();
	
	WebElement view = driver.findElement(By.xpath("//a[text()='View cart']"));
	view.click();
	
	WebElement proceed = driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward wp-element-button']"));
	proceed.click();
	
	WebElement first1 = driver.findElement(By.name("billing_first_name"));
	first1.sendKeys("mani");
	
	WebElement lastname = driver.findElement(By.name("billing_last_name"));
	lastname.sendKeys("kandan");
	
	WebElement country = driver.findElement(By.id("select2-billing_country-container"));
	country.click();
		
	WebElement ind = driver.findElement(By.xpath("//li[text()='India']"));
	ind.click();
	
	WebElement house= driver.findElement(By.id("billing_address_1"));
	house.sendKeys("18");
	
	WebElement apart = driver.findElement(By.id("billing_address_2"));
	apart.sendKeys("golden home");
	
	WebElement town = driver.findElement(By.id("billing_city"));
	town.sendKeys("chennai");
	
	WebElement state=driver.findElement(By.id("select2-billing_state-container"));
	state.click();
	
//	WebElement tamil = driver.findElement(By.id("select2-billing_state-result-brmi-TN"));
//	tamil.click();
	
     Robot r=new Robot();
	 for (int i = 0; i < 10; i++) {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
//	WebElement tamil1 = driver.findElement(By.id("select2-billing_state-result-vfzq-TN"));
//	tamil1.click();
	
	WebElement pin = driver.findElement(By.id("billing_postcode"));
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("arguments[0].setAttribute('value','600081')",pin);
	Object att = je.executeScript("return arguments[0].getAttribute('value')", pin);
	System.out.println(att);
	
	WebElement phone = driver.findElement(By.id("billing_phone"));
	phone.sendKeys("8933989282");
	
	WebElement email = driver.findElement(By.id("billing_email"));
	email.sendKeys("manikandansathya007@gmail.com");
	
	WebElement terms = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	je.executeScript("arguments[0].scrollIntoView(false)", terms);
	je.executeScript("arguments[0].click()",terms);
	
	
	WebElement place = driver.findElement(By.id("place_order"));
	place.click();
	WebElement bill = driver.findElement(By.xpath("//section[@class='woocommerce-order-details']"));
	je.executeScript("arguments[0].scrollIntoView(true)", bill);
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Screenshot\\toolsqabill.png");
	FileUtils.copyFile(src, des);
	
	
}
}
