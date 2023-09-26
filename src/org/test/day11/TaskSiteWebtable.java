package org.test.day11;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSiteWebtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		
		WebElement tab = tables.get(1);
		// to get all values
		System.out.println("..........all values........");
		String tx = tab.getText();
		System.out.println(tx);
		
		//all headingss
		System.out.println(".........all headings..........");
		List<WebElement> heads = tab.findElements(By.tagName("th"));
		for(WebElement x:heads) {
			System.out.println(x.getText());
		}
		
		//all datas...
		System.out.println(".........all datas............");
		List<WebElement> datas = tab.findElements(By.tagName("td"));
		for(int i=0; i<datas.size(); i++) {
			WebElement data = datas.get(i);
			System.out.println(data.getText());
		}
		
		System.out.println(".all values row wise....");
		
		List<WebElement> row = tab.findElements(By.tagName("tr"));
		for(int i=0; i<row.size(); i++) {
			WebElement r = row.get(i);
			System.out.println(r.getText());
		}
		
		System.out.println("......all heading row wise.....");
		
		List<WebElement> row1 = tab.findElements(By.tagName("tr"));
		for(int i=0; i<row.size(); i++) {
			WebElement r = row.get(i);
			List<WebElement> heads1 = r.findElements(By.tagName("th"));
			for(WebElement y:heads) {
				System.out.println(y.getText());
			}
			
		}
		
		System.out.println("....all datas row wise...");
		List<WebElement> row2 = tab.findElements(By.tagName("tr"));
		for (int i=0; i<row2.size();i++) {
			WebElement rows = row2.get(i);
			List<WebElement> data = rows.findElements(By.tagName("td"));
			for(WebElement z:data) {
				System.out.println(z.getText());
			}
		}
		
		
		//task...webpage
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
//
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://demo.guru99.com/test/web-table-element.php#");
//		
//		List<WebElement> tables = driver.findElements(By.tagName("table"));
//		
//		WebElement tab = tables.get(1);
//		
//		System.out.println("enter company name");
//		Scanner s=new Scanner(System.in);
//		String nl = s.nextLine();
//		
//		List<WebElement> ro = tab.findElements(By.tagName("tr"));
//		for(int i=0; i<ro.size();i++) {
//			WebElement web = ro.get(i);
//			if (web.getText().contains(nl)){
//			List<WebElement> da = web.findElements(By.tagName("td"));
//			for(WebElement x:da) {
//				System.out.println(x.getText());
//			}
//		}
//		}
		
		
		
	}}
		
	


