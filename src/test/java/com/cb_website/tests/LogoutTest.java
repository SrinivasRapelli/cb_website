package com.cb_website.tests;

import org.testng.annotations.Test;

import com.cb_website.pages.BasePage;
import com.cb_website.pages.LogoutPage;

public class LogoutTest extends BasePage{
	LogoutPage logoutPage;
	LoginTest loginTest;
	
	@Test
	public void logoutfromTheWebsite() {
		loginTest = new LoginTest();
		//loginTest.driver = this.driver; //commented this due to added public static before webdriver driver in base page
		loginTest.loginToTheWebsite();
		
		logoutPage = new LogoutPage(driver);
		logoutPage.clickOnLogout();
		logoutPage.verifySuccessFulLogout();
	}

}
