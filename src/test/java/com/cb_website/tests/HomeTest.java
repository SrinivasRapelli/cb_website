package com.cb_website.tests;

import org.testng.annotations.Test;

import com.cb_website.pages.BasePage;
import com.cb_website.pages.HomePage;

public class HomeTest extends BasePage {
	
	HomePage homePage;
	LoginTest loginTest;
	
	@Test
	public void changeTheCurrency() {
		loginTest = new LoginTest();
		loginTest.loginToTheWebsite();
		
		homePage = new HomePage(driver);
		homePage.changeTheCurrencyToInr();
		homePage.verifyTheCurrencyChange();
	}
}
