package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_012 extends BaseClass{
 public static String mobile ="017858956";

	@Test(priority=1)
	public void addEmergencyContacts() throws InterruptedException, IOException {
		loginToTheApplication();
		EmergencyContactsPage ec = new EmergencyContactsPage(driver);
		ec.clickMyInfo();
		ec.clickEC();
		ec.clickAddBtn();
		ec.setName("Auntor");
		ec.setRelationShip("brother");
		ec.setMobile(mobile);
		ec.clickSave();
		if(driver.getPageSource().contains(mobile)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_012 Pass");
		}else {
			logger.warn("TC_MI_012 failed");
			captureScreen(driver,"addEmergencyContacts");
			Assert.fail();
		}
	}
}