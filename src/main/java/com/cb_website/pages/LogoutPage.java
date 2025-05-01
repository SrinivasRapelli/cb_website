package com.cb_website.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By logoutLink = By.xpath("//a[text()='Logout']");
	By loginLink = By.xpath("(//a[text()='Login'])[1]");

	public void clickOnLogout() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink));
		element.click();
	}
	
	public void verifySuccessFulLogout() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink));
		if (element.isDisplayed()) {
			System.out.println("Successfully logged out");
		}
	}
}
