package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_047 extends BaseClass {
	public String filename="ct.exe";

	@Test(priority = 1)
	public void deleteAttachment() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.checkAttachmentAll();
		qp.deleteAttachmentBtn();
			if(driver.getPageSource().contains(filename)) {
				logger.info("TC_MI_047 Failed");
				captureScreen(driver,"deleteAttachment");
				Assert.fail();
			}else {
				
				Assert.assertTrue(true);
				logger.info("TC_MI_047 Passed");
			}
			
	
	}
}