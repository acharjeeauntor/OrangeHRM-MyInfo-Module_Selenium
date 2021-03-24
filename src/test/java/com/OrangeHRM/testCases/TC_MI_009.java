package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_009 extends BaseClass{

	@Test(priority=1)
	public void viewContactDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		ContactDetailsPage cd = new ContactDetailsPage(driver);
		cd.clickMyInfo();
		cd.clickCD();
		if(driver.getPageSource().contains("Contact Details")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_009 Pass");
		}else {
			logger.warn("TC_MI_009 failed");
			captureScreen(driver,"viewContactDetails");
			Assert.fail();
		}
		
	}
}