package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_043 extends BaseClass {
	public String LicenseNumber="0154582";

	@Test(priority = 1)
	public void addMultipleLicense() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddLicBtn();
	qp.setLLicenseType("Microsoft Certified Systems Engineer (MCSE)");
	qp.setLLicenseNumber(LicenseNumber);
	qp.clickLicSaveBtn();
	Thread.sleep(2000);
			if(driver.getPageSource().contains(LicenseNumber)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_043 Passed");
			}else {
				logger.info("TC_MI_043 Failed");
				captureScreen(driver,"addMultipleLicense");
				Assert.fail();
			}
			
	
	}
}