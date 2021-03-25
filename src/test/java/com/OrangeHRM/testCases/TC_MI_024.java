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

public class TC_MI_024 extends BaseClass{
	public static String number ="11526";
 

	@Test(priority=1)
	public void deleteImmigration() throws InterruptedException, IOException {
		loginToTheApplication();
		ImmigrationPage im = new ImmigrationPage(driver);
		im.clickMyInfo();
		im.clickImmigration();
		im.selectRow();
		im.clickDelete();
		if(driver.getPageSource().contains(number)) {
			logger.warn("TC_MI_024 failed");
			captureScreen(driver,"deleteImmigration");
			Assert.fail();
			
		}else {
			Assert.assertTrue(true);
			logger.info("TC_MI_24 Pass");
		}
	}
}