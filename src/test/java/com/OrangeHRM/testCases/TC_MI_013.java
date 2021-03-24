package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_013 extends BaseClass{
 public static String mobile ="589632448";

	@Test(priority=1)
	public void addMultipleEmergencyContacts() throws InterruptedException, IOException {
		loginToTheApplication();
		EmergencyContactsPage ec = new EmergencyContactsPage(driver);
		ec.clickMyInfo();
		ec.clickEC();
		ec.clickAddBtn();
		ec.setName("ontu");
		ec.setRelationShip("brother");
		ec.setMobile(mobile);
		ec.clickSave();
		if(driver.getPageSource().contains(mobile)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_013 Pass");
		}else {
			logger.warn("TC_MI_013 failed");
			captureScreen(driver,"addMultipleEmergencyContacts");
			Assert.fail();
		}
	}
}