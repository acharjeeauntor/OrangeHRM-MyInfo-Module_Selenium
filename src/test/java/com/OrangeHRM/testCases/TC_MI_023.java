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

public class TC_MI_023 extends BaseClass{
 public static String number ="11526";

	@Test(priority=1)
	public void addMultipleImmigration() throws InterruptedException, IOException {
		loginToTheApplication();
		ImmigrationPage im = new ImmigrationPage(driver);
		im.clickMyInfo();
		im.clickImmigration();
		im.clickAddBtn();
		im.setDocumenttype();
		im.setNumber(number);
		im.setIssuedDate("2006", "Mar", "15");
		im.setExpiryDate("2019", "Feb", "20");
		im.setImmigrationCountry("China");
		im.setComment("second add");
		im.clickSave();
		if(driver.getPageSource().contains(number)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_023 Pass");
		}else {
			logger.warn("TC_MI_023 failed");
			captureScreen(driver,"addMultipleImmigration");
			Assert.fail();
		}
	}
}