package com.fileupload;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.Timeout;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//a tagname la eruntha athu link....
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkcount = links.size();
		System.out.println(linkcount);
		
		//get all links
		System.out.println("all links.................");
		for (int i = 0; i < links.size(); i++) {
			WebElement eachweb = links.get(i);
			String link = eachweb.getAttribute("href");
			System.out.println(link);
		}
		// verify the link good or brokened
		System.out.println("...........broken links............");
		for (int i = 0; i < links.size(); i++) {
			WebElement eachweb = links.get(i);
			String link = eachweb.getAttribute("href");
			URL url=new URL(link);
			URLConnection urlcon = url.openConnection();
			
			HttpURLConnection hp=(HttpURLConnection)urlcon;
			int code = hp.getResponseCode();
			if(code>400) {
				System.out.println(link+"=="+code);
			}
		}
		
		//image ..............
		System.out.println("...........image.......");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		int imgcount = images.size();
		System.out.println(imgcount);
		
		//get all image links
		System.out.println(".........link in img.....");
		for (int i = 0; i < images.size(); i++) {
			WebElement eachimg = images.get(i);
			String imglink = eachimg.getAttribute("src");
			System.out.println(imglink);
		}
		
		//verify the img link good or broken
		System.out.println("............broken image,.....");
	for (int i = 0; i < images.size(); i++) {
		WebElement eachimg = images.get(i);
		String imglink = eachimg.getAttribute("src");
		URL url=new URL(imglink);
		URLConnection urlcon = url.openConnection();
		HttpURLConnection hp=(HttpURLConnection)urlcon;
		int code = hp.getResponseCode();
		System.out.println(imglink+"======="+code);
		if (code>400) {
			
			System.out.println(imglink+"======"+code);
		}
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
