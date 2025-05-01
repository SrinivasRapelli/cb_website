package com.cb_website.tests;

import org.testng.annotations.Test;

import com.cb_website.pages.BasePage;
import com.cb_website.pages.LoginPage;

public class LoginTest extends BasePage {
	LoginPage loginPage;
	
	@Test
	public void loginToTheWebsite() {
		loginPage = new LoginPage(driver);
		loginPage.clickOnLoginLink();
		loginPage.enterEmail();
		loginPage.enterPassword();
		loginPage.clickOnSubmitButton();
		loginPage.verifyTheSuccessfulLogin();
		
	}
}
