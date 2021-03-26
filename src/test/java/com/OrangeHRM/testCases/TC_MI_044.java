package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_044 extends BaseClass {
	public String LicenseNumber="015";

	@Test(priority = 1)
	public void deleteLicense() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.checkLicAll();
		qp.deleteLicBtn();
			if(driver.getPageSource().contains(LicenseNumber)) {
				logger.info("TC_MI_044 Failed");
				captureScreen(driver,"deleteLicense");
				Assert.fail();
			}else {
				
				Assert.assertTrue(true);
				logger.info("TC_MI_044 Passed");
			}
			
	
	}
}