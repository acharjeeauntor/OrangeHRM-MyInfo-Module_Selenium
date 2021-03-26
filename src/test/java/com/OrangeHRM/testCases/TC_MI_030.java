package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_030 extends BaseClass {
	public String companyname="Prity";

	@Test(priority = 1)
	public void addWorkExp() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddWorkBtn();
		qp.setCompanyName(companyname);
		qp.setJobtitle("QA");
		qp.clickWorkSaveBtn();
			if(driver.getPageSource().contains(companyname)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_030 Passed");
			}else {
				logger.info("TC_MI_030 Failed");
				captureScreen(driver,"addWorkExp");
				Assert.fail();
			}
			
	
	}
}