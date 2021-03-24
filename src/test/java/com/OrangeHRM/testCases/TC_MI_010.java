package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_010 extends BaseClass{
	public static String address= "pathrail";
	public static String city = "Tangail";
	public static String country = "Bangladesh";

	@Test(priority=1)
	public void editContactDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		ContactDetailsPage cd = new ContactDetailsPage(driver);
		cd.clickMyInfo();
		cd.clickCD();
		cd.clickEditAndSaveBtn();
		logger.info("Field Edit Start");
		cd.setAddress(address);
		cd.setCity(city);
		cd.setCountry(country);
		logger.info("Field Edit End");
		Thread.sleep(2000);
		cd.clickEditAndSaveBtn();
		
		
		logger.info("Edit Validation Start....");
		if(driver.getPageSource().contains(address)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_010 Pass");
		}else {
			logger.warn("TC_MI_010 failed");
			captureScreen(driver,"editContactDetails");
			Assert.fail();
		}
		
	}
}