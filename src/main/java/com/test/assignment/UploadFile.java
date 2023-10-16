package com.test.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/upload");

		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='fileInput']"));
		fileUpload.sendKeys("C:\\Users\\Admin\\Desktop\\Image.png");
		driver.findElement(By.id("fileSubmit")).click();
		
	}

}
