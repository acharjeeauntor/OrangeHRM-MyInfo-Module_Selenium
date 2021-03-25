package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.ImmigrationPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;
import com.OrangeHRM.pageObjects.DependentsPage;

public class TC_MI_021 extends BaseClass{

	@Test(priority=1)
	public void ViewImmigration() throws InterruptedException, IOException {
		loginToTheApplication();
		ImmigrationPage im = new ImmigrationPage(driver);
		im.clickMyInfo();
		im.clickImmigration();
		if(driver.getPageSource().contains("Assigned Immigration Records")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_021 Pass");
		}else {
			logger.warn("TC_MI_021 failed");
			captureScreen(driver,"ViewImmigration");
			Assert.fail();
		}
		
	}
}