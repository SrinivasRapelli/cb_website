package com.cb_website.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginlink = By.xpath("(//a[text()='Login'])[1]");
	By email = By.xpath("//*[@name='email']");
	By password = By.xpath("//*[@name='password']");
	By submitBtn = By.xpath("//button[text()='Submit']");
	By header = By.xpath("//*[contains(text(),'Find your Perfect')]");
	
	public void clickOnLoginLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginlink));
		
		element.click();
	}
	
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		
		element.sendKeys("gankidirahul123@gmail.com");
	}
	
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		
		element.sendKeys("Rahul@0001");;
	}
	
	public void clickOnSubmitButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));
		
		element.click();
	}
	
	public void verifyTheSuccessfulLogin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(header));
		String heading = element.getText();
		Assert.assertEquals(heading, "Find your Perfect Hotel, Anywhere, Anytime!");
		System.out.println(heading);
		if (element.isDisplayed()) {
			System.out.println("Successfully logged in");
		} 
	}
	
}
