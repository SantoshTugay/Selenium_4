package com.sk.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverCommands {
	
	@Test
	public void basicCommands() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		String text=driver.findElement(By.id("idOfDiv")).getText();
		System.out.println(text);
		Thread.sleep(5);
		
		driver.findElement(By.linkText("This is a link")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("fname")).sendKeys("Kuldeep Rana");
		Thread.sleep(3000);

		driver.findElement(By.id("fname")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("idOfButton")).click();
		Thread.sleep(3000);
			
		driver.findElement(By.name("male")).click();	
		Thread.sleep(3000);
			
		driver.findElement(By.cssSelector("input.Automation")).click();
		Thread.sleep(3000);
			
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");
			
		Thread.sleep(5000);
		driver.close();
		
	}
}
