package com.test.assignment;

import java.time.Duration;
import java.util.List;

import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BrokenImages {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/broken-images");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		int imagesCount = images.size();
		
		for(WebElement i: images) {
			    if (i.getAttribute("naturalWidth").equals("0")) {
			    	System.out.println("Broken Image: " + i.getAttribute("outerHTML"));
			
			}
		}

	}

}
