package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {
	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("http:/www.greenstechnologys.com");
			
			WebElement page = driver.findElement(By.xpath("//h1[text()='No 1 Software Training Institutes in Chennai with Placements']"));
			String text = page.getText();
			System.out.println(text);
			
			
			WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Our ')]"));
			String text2 = para.getText();
			System.out.println(text2);
			
			WebElement txt4 = driver.findElement(By.xpath("//u[contains(text(),'Greens')]"));
			String text3 = txt4.getText();
			System.out.println(text3);
			
			
	}
	
	

}

