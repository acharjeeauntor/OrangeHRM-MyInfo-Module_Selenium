package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_045 extends BaseClass {
	public String filename="tt.exe";

	@Test(priority = 1)
	public void addAttachment() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddAttachmentBtn();
		qp.setLfile("D:\\SQA-practice-project\\Automation-Selenium\\Project\\OrangeHRM\\Files\\tt.exe");
		qp.clickUploadBtn();
			if(driver.getPageSource().contains(filename)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_045 Passed");
			}else {
				logger.info("TC_MI_045 Failed");
				captureScreen(driver,"addAttachment");
				Assert.fail();
			}
			
	
	}
}