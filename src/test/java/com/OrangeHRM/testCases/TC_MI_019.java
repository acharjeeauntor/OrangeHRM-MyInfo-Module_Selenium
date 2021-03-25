package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;
import com.OrangeHRM.pageObjects.DependentsPage;

public class TC_MI_019 extends BaseClass{
 public static String name="Auntor";
 

	@Test(priority=1)
	public void deleteDependents() throws InterruptedException, IOException {
		loginToTheApplication();
		DependentsPage dep = new DependentsPage(driver);
		dep.clickMyInfo();
		dep.clickDependent();
		dep.selectRow();
		dep.clickDelete();
		if(driver.getPageSource().contains(name)) {
			logger.warn("TC_MI_019 failed");
			captureScreen(driver,"deleteDependents");
			Assert.fail();
			
		}else {
			Assert.assertTrue(true);
			logger.info("TC_MI_019 Pass");
		}
	}
}