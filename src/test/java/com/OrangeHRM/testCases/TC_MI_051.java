package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.MembershipPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_051 extends BaseClass{
	public String amount = "54614363";

	@Test(priority=1)
	public void deleteMembership() throws InterruptedException, IOException {
		loginToTheApplication();
		MembershipPage mp = new MembershipPage(driver);
		mp.clickMyInfo();
		mp.clickMembership();
		mp.selectRow();
		mp.clickDelete();
		if(driver.getPageSource().contains(amount)) {
			logger.warn("TC_MI_051 failed");
			captureScreen(driver,"deleteMembership");
			Assert.fail();
		}else {
			
			Assert.assertTrue(true);
			logger.info("TC_MI_051 Pass");
		}
		
	}
}