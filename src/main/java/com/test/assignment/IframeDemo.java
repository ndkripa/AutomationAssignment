package com.test.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Kripa");
		
		//back to main frame
		driver.switchTo().parentFrame();
		
		
		//Iframe with in an Iframe
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		WebElement multipleFrames = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(multipleFrames);
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nested Frame");

	}

}
