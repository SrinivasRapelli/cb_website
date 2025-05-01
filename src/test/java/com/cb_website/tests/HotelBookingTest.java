package com.cb_website.tests;

import org.testng.annotations.Test;

import com.cb_website.pages.BasePage;
import com.cb_website.pages.HotelBookingPage;

public class HotelBookingTest extends BasePage{
	LoginTest loginTest;
	HotelBookingPage hotelBookingPage;
	
	@Test
	public void bookAHotelRoom() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginToTheWebsite();
		
		hotelBookingPage = new HotelBookingPage(driver);
		hotelBookingPage.enterTheDestination();
		hotelBookingPage.selectCheckInCheckOutDates();
		hotelBookingPage.clickOnSearchButton();
		Thread.sleep(10000);
		hotelBookingPage.getNumberOfHotelsCount();
		hotelBookingPage.selectAHotel();
		hotelBookingPage.selectARoom();
		hotelBookingPage.enterGuestDetails();
		hotelBookingPage.clickOnOnlinePayments();
		hotelBookingPage.clickOnPayButton();
		hotelBookingPage.enterCardDetails();
		hotelBookingPage.clickOnPay();		
	}
}
