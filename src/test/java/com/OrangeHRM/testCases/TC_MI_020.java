package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;
import com.OrangeHRM.pageObjects.DependentsPage;

public class TC_MI_020 extends BaseClass {

	@Test(priority = 1)
	public void addDependentAttachmentFile() throws InterruptedException, IOException {
		loginToTheApplication();
		DependentsPage dep = new DependentsPage(driver);
		dep.clickMyInfo();
		dep.clickDependent();
		dep.clickAttachmentsBtn();
		Thread.sleep(3000);
		dep.uploadFile("D:\\SQA-practice-project\\Automation-Selenium\\Project\\OrangeHRM\\Files\\tt.exe");
		dep.uploadBtn();

		if (driver.getPageSource().contains("tt.exe")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_020 Pass");

		} else {
			logger.warn("TC_MI_020 failed");
			captureScreen(driver, "addDependentAttachmentFile");
			Assert.fail();
		}
	}
}