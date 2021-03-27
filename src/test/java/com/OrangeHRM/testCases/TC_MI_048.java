package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.MembershipPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_048 extends BaseClass{

	@Test(priority=1)
	public void viewMemberships() throws InterruptedException, IOException {
		loginToTheApplication();
		MembershipPage mp = new MembershipPage(driver);
		mp.clickMyInfo();
		mp.clickMembership();
		if(driver.getPageSource().contains("Assigned Memberships")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_048 Pass");
		}else {
			logger.warn("TC_MI_048 failed");
			captureScreen(driver,"viewMemberships");
			Assert.fail();
		}
		
	}
}