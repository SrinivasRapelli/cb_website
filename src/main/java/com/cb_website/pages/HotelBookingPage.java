package com.cb_website.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelBookingPage {
	WebDriver driver;
	
	public HotelBookingPage(WebDriver driver) {
	 this.driver = driver;
	}
	
	By destination = By.xpath("(//input)[1]");
	By city = By.xpath("(//*[contains(text(), 'Hyderabad')])[1]");
	By checkin_checkout_field = By.xpath("(//input)[2]");
	By checkInDate = By.xpath("(//button[contains(text(), '30')])[2]");
	By checkOutDate = By.xpath("(//button[contains(text(), '31')])[1]");
	By searchBtn = By.xpath("//button[contains(text(),'Search')]");
	By numberOfHotels = By.xpath("/html/body/main/div/div[2]/div[3]/div[1]/p");
	By hotel = By.xpath("(//button[contains(text(),'View')])[6]");
	By viewrooms = By.xpath("//a[@href ='#rooms']");
	By room = By.xpath("(//button[contains(text(),'Book')])[1]");
	By fname = By.xpath("//*[@name='first_name']");
	By lname = By.xpath("//*[@name='last_name']");
	By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
	By onlinepayment = By.xpath("//*[contains(text(),'Online')]");
	By payBtn = By.xpath("//button[contains(text(),'Pay')]");
	By email = By.id("email");
	By cardNumber = By.xpath("(//input)[2]");
	By expiryDate = By.xpath("(//input)[3]");
	By cvc = By.xpath("(//input)[4]");
	By cardholderName = By.xpath("(//input)[5]");
	By payButton = By.xpath("(//button)[1]");
	
	public void enterTheDestination() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(destination));
		element.click();
		element.clear();
		element.sendKeys("Hyderabad");
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(city));
		element1.click();
	}
	
	public void selectCheckInCheckOutDates() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkin_checkout_field));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(checkInDate));
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(checkOutDate));
		element2.click();

	}
	
	public void clickOnSearchButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn));
		element.click();
		
	}
	
	public void getNumberOfHotelsCount() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfHotels));
		System.out.println("Number of hotels: "+element.getText());
	}

	public void selectAHotel() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(hotel));
		element.click();
	}
	
	public void selectARoom() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(viewrooms));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(room));
		element1.click();
	}
	
	public void enterGuestDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		element.sendKeys("Srini");
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
		element1.sendKeys("R");
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(continueBtn));
		element2.click();
		
	}
	
	public void clickOnOnlinePayments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(onlinepayment));
		element.click();
	}
	
	public void clickOnPayButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(payBtn));
		element.click();
	}
	
	public void enterCardDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("S@gmail.com");
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumber));
		element1.sendKeys("4242424242424242");
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(expiryDate));
		element2.sendKeys("1228");
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(cvc));
		element3.sendKeys("333");
		WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(cardholderName));
		element4.sendKeys("Srini");
	}
	
	public void clickOnPay() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(payButton));
		element.click();
		Thread.sleep(5000);
	}
	
}
