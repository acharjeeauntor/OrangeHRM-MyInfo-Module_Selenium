package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_014 extends BaseClass{
 public static String mobile="589632448";

	@Test(priority=1)
	public void deleteEmergencyContacts() throws InterruptedException, IOException {
		loginToTheApplication();
		EmergencyContactsPage ec = new EmergencyContactsPage(driver);
		ec.clickMyInfo();
		ec.clickEC();
		ec.selectRow();
		ec.clickDelete();
		if(driver.getPageSource().contains(mobile)) {
			logger.warn("TC_MI_014 failed");
			captureScreen(driver,"deleteEmergencyContacts");
			Assert.fail();
			
		}else {
			Assert.assertTrue(true);
			logger.info("TC_MI_014 Pass");
		}
	}
}