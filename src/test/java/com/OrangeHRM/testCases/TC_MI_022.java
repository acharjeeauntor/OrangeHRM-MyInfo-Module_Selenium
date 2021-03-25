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

public class TC_MI_022 extends BaseClass{
 public static String number ="1234";

	@Test(priority=1)
	public void addImmigration() throws InterruptedException, IOException {
		loginToTheApplication();
		ImmigrationPage im = new ImmigrationPage(driver);
		im.clickMyInfo();
		im.clickImmigration();
		im.clickAddBtn();
		im.setDocumenttype();
		im.setNumber(number);
		im.setIssuedDate("2005", "Mar", "15");
		im.setExpiryDate("2020", "Feb", "20");
		im.setImmigrationCountry("Bangladesh");
		im.setComment("First add");
		im.clickSave();
		if(driver.getPageSource().contains(number)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_022 Pass");
		}else {
			logger.warn("TC_MI_022 failed");
			captureScreen(driver,"addImmigration");
			Assert.fail();
		}
	}
}