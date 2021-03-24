package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_005 extends BaseClass{

	@Test(priority=1)
	public void viewPersonalDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		PersonalDetailsPage pd = new PersonalDetailsPage(driver);
		pd.clickMyInfo();
		pd.clickPD();
		logger.info("Click on Tabs");
		
		if(driver.getPageSource().contains("Personal Details")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_005 Pass");
		}else {
			logger.warn("TC_MI_005 failed");
			captureScreen(driver,"viewMyinfo");
			Assert.fail();
		}
		
	}
}