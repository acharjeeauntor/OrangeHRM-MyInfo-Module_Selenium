package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;
import com.OrangeHRM.pageObjects.DependentsPage;

public class TC_MI_016 extends BaseClass{

	@Test(priority=1)
	public void ViewDependents() throws InterruptedException, IOException {
		loginToTheApplication();
		DependentsPage dep = new DependentsPage(driver);
		dep.clickMyInfo();
		dep.clickDependent();
		if(driver.getPageSource().contains("Assigned Dependents")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_016 Pass");
		}else {
			logger.warn("TC_MI_016 failed");
			captureScreen(driver,"ViewDependents");
			Assert.fail();
		}
		
	}
}