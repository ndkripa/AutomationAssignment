package com.test.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		  List<WebElement> tableValues =
		  driver.findElements(By.xpath("//table/tbody/tr")); 
		 
		  for (int i = 1; i < tableValues.size(); i++) {
			 // System.out.println(tableValues.get(i).getText());
			  
			  if (tableValues.get(i).getText().contains("India")) {
				  System.out.println("i value is: " + i);
				  
				  WebElement findElement = tableValues.get(i).findElement(By.tagName("input"));
					
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("arguments[0].scrollIntoView();", findElement);
				  findElement.click();
			  }
		  }
		  //WebElement findElement = driver.findElement(By.xpath("//input[@class='hasVisited'][1]"));
		
		 	}

}
