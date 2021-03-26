package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_035 extends BaseClass {
	public String institutionName="Sristy";

	@Test(priority = 1)
	public void deleteEducation() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.checkEduAll();
		qp.deleteEduBtn();
			if(driver.getPageSource().contains(institutionName)) {
				logger.info("TC_MI_035 Failed");
				captureScreen(driver,"deleteEducation");
				Assert.fail();
			}else {
				
				Assert.assertTrue(true);
				logger.info("TC_MI_035 Passed");
			}
			
	
	}
}