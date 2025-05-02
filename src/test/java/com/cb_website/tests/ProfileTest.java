package com.cb_website.tests;

import org.testng.annotations.Test;

import com.cb_website.pages.BasePage;
import com.cb_website.pages.ProfilePage;

public class ProfileTest extends BasePage{
	LoginTest loginTest;
	ProfilePage profilePage;
	
	@Test
	public void PerformTasksInProfilePage() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginToTheWebsite();
		
		profilePage = new ProfilePage(driver);
		profilePage.clickOnProfilePic();
		profilePage.verifyTheProfilePage();
		profilePage.changeFnameAndLname();
		Thread.sleep(5000);
		profilePage.clickOnMyBookings();
		profilePage.verifyTheBookingsSection();
		
	}
}
