package com.cb_website.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By currency = By.xpath("//*[@class = 'relative group']");
	By inrOption = By.xpath("(//*[@class = 'mr-2'])[13]");
	By searchBtn = By.xpath("//button[contains(text(),'Search')]");
	By hotel = By.xpath("(//button[contains(text(),'View')])[6]");
	By viewrooms = By.xpath("//a[@href ='#rooms']");
	By room = By.xpath("(//button[contains(text(),'Book')])[1]");
	By currencycheck = By.xpath("(//*[contains(text(),'INR')])[2]");
	
	
	public void changeTheCurrencyToInr() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(currency));
		element.click();
//		Select dd = new Select(element);  //the elment is div, so we have to follow normal way(if the elemet is select we can proceed with select)
//		dd.selectByVisibleText("INR");
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(inrOption));
		element1.click();
		
		
		
	}
	
	public void verifyTheCurrencyChange() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hotel));
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(viewrooms));
		element2.click();
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(room));
		element3.click();
		
		WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(currencycheck));
		if (element4.isDisplayed()) {
			System.out.println(element4.getText());
		}		
		
	}
}
