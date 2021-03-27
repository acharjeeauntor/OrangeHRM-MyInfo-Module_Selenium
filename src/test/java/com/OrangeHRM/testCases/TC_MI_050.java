package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.MembershipPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_050 extends BaseClass{
	public String amount = "54614363";

	@Test(priority=1)
	public void addMultipleMembership() throws InterruptedException, IOException {
		loginToTheApplication();
		MembershipPage mp = new MembershipPage(driver);
		mp.clickMyInfo();
		mp.clickMembership();
		mp.clickAddBtn();
		mp.setMembership("ACCA");
		mp.setAmount(amount);
		mp.clickSave();
		if(driver.getPageSource().contains(amount)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_050 Pass");
		}else {
			logger.warn("TC_MI_050 failed");
			captureScreen(driver,"addMultipleMembership");
			Assert.fail();
		}
		
	}
}