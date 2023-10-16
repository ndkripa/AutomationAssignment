package com.test.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollbars {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/scrollbars");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//hidding button
		WebElement hiddingButton = driver.findElement(By.id("hidingButton"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		//executor.executeScript("window.scrollTo()");
		
		executor.executeScript("arguments[0].scrollIntoView();", hiddingButton);
		
		//clicking hidding button
		hiddingButton.click();
	}

}
