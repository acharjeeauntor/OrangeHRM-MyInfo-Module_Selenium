package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_034 extends BaseClass {
	public String institutionName="Sristy";

	@Test(priority = 1)
	public void addMultipleEducation() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddEduBtn();
		qp.setLevel("College Undergraduate");
		qp.setInstitute(institutionName);
		qp.clickEduSaveBtn();
			if(driver.getPageSource().contains(institutionName)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_034 Passed");
			}else {
				logger.info("TC_MI_034 Failed");
				captureScreen(driver,"addMultipleEducation");
				Assert.fail();
			}
			
	
	}
}