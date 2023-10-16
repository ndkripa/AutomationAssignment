package com.test.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropCircles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		WebElement greenColour = driver.findElement(By.cssSelector("div.green"));
		WebElement dropBox = driver.findElement(By.id("target"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(greenColour, dropBox).build().perform();
		
	}

}
