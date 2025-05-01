package com.cb_website.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\cb_website\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://clickbooking.online/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	@AfterSuite
	public void closeTheBrowser() {
		driver.quit();
	}
}
