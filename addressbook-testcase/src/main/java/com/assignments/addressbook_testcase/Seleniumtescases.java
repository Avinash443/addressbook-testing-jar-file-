package com.assignments.addressbook_testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniumtescases {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "A:\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi, Selenium Testing by Giri");
		
	
		driver.get("http://18.234.101.202:8081/addressbook/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		
	
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Giri");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Komali");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("8247571880");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("giri@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/1999");
		
		driver.findElement(By.className("v-button-primary")).click();
		System.out.println("Testcase Executed");
		Thread.sleep(5000);
		//driver.quit();
	}

}
