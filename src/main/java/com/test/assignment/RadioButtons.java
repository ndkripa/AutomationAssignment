package com.test.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		
		//Clicking Yellow
		driver.findElement(By.xpath("//input[@id='yellow']")).click();
		
		//Clicking Football
		driver.findElement(By.xpath("//input[@id='football']")).click();
		
		
	}

}
