package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_015 extends BaseClass {

	@Test(priority = 1)
	public void addEmergencyAttachmentFile() throws InterruptedException, IOException {
		loginToTheApplication();
		EmergencyContactsPage ec = new EmergencyContactsPage(driver);
		ec.clickMyInfo();
		ec.clickEC();
		ec.clickAttachmentsBtn();
		Thread.sleep(3000);
		ec.uploadFile("D:\\SQA-practice-project\\Automation-Selenium\\Project\\OrangeHRM\\Files\\tt.exe");
		ec.uploadBtn();

		if (driver.getPageSource().contains("tt.exe")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_015 Pass");

		} else {
			logger.warn("TC_MI_015 failed");
			captureScreen(driver, "addEmergencyAttachmentFile");
			Assert.fail();
		}
	}
}