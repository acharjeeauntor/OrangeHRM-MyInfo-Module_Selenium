package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_031 extends BaseClass {
	public String companyname="diu";

	@Test(priority = 1)
	public void addMultipleWorkExp() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddWorkBtn();
		qp.setCompanyName(companyname);
		qp.setJobtitle("QE");
		qp.clickWorkSaveBtn();
			if(driver.getPageSource().contains(companyname)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_031 Passed");
			}else {
				logger.info("TC_MI_031 Failed");
				captureScreen(driver,"addMultipleWorkExp");
				Assert.fail();
			}
			
	
	}
}