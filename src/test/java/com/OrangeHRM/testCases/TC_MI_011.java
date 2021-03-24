package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_011 extends BaseClass{

	@Test(priority=1)
	public void viewEmergencyContacts() throws InterruptedException, IOException {
		loginToTheApplication();
		EmergencyContactsPage ec = new EmergencyContactsPage(driver);
		ec.clickMyInfo();
		ec.clickEC();
		if(driver.getPageSource().contains("Assigned Emergency Contacts")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_011 Pass");
		}else {
			logger.warn("TC_MI_011 failed");
			captureScreen(driver,"viewEmergencyContacts");
			Assert.fail();
		}
		
	}
}