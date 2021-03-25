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

public class TC_MI_025 extends BaseClass {

	@Test(priority = 1)
	public void addImmigrationAttachmentFile() throws InterruptedException, IOException {
		loginToTheApplication();
		ImmigrationPage im = new ImmigrationPage(driver);
		im.clickMyInfo();
		im.clickImmigration();
		im.clickAttachmentsBtn();
		Thread.sleep(3000);
		im.uploadFile("D:\\SQA-practice-project\\Automation-Selenium\\Project\\OrangeHRM\\Files\\tt.exe");
		im.uploadBtn();

		if (driver.getPageSource().contains("tt.exe")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_025 Pass");

		} else {
			logger.warn("TC_MI_025 failed");
			captureScreen(driver, "addImmigrationAttachmentFile");
			Assert.fail();
		}
	}
}