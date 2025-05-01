package com.cb_website.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage {
	WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By profileicon = By.xpath("(//img)[31]");
	By acc = By.xpath("//button[contains(text(),'Account')]");
	By changeBtn = By.xpath("//button[contains(text(),'Change')]");
	By fname = By.name("first_name");
	By lname = By.name("last_name");
	
	
	public void clickOnProfilePic() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(profileicon));
		element.click();
	}
	
	public void verifyTheProfilePage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(acc));
		String account = element.getText();
		Assert.assertEquals(account, "Account");
		if (element.isDisplayed()) {
			System.out.println(account+ "Successfully navigates to the Profile page");
		}
	}
	
	
}
