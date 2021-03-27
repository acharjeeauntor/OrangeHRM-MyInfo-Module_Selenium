package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.MembershipPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_049 extends BaseClass{

	@Test(priority=1)
	public void addMembership() throws InterruptedException, IOException {
		loginToTheApplication();
		MembershipPage mp = new MembershipPage(driver);
		mp.clickMyInfo();
		mp.clickMembership();
		mp.clickAddBtn();
		mp.setMembership("British Computer Society (BCS)");
		mp.setAmount("1500");
		mp.clickSave();
		if(driver.getPageSource().contains("1500")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_049 Pass");
		}else {
			logger.warn("TC_MI_049 failed");
			captureScreen(driver,"addMembership");
			Assert.fail();
		}
		
	}
}