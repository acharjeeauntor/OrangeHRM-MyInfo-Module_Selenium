package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_046 extends BaseClass {
	public String filename="ct.exe";

	@Test(priority = 1)
	public void addMultipleAttachment() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddAttachmentBtn();
		qp.setLfile("D:\\SQA-practice-project\\Automation-Selenium\\Project\\OrangeHRM\\Files\\ct.exe");
		qp.clickUploadBtn();
			if(driver.getPageSource().contains(filename)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_046 Passed");
			}else {
				logger.info("TC_MI_046 Failed");
				captureScreen(driver,"addMultipleAttachment");
				Assert.fail();
			}
			
	
	}
}