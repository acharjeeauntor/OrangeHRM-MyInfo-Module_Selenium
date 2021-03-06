package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_033 extends BaseClass {
	public String institutionName="Diu";

	@Test(priority = 1)
	public void addEducation() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddEduBtn();
		qp.setLevel("College Undergraduate");
		qp.setInstitute(institutionName);
		qp.clickEduSaveBtn();
		Thread.sleep(2000);
			if(driver.getPageSource().contains(institutionName)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_033 Passed");
			}else {
				logger.info("TC_MI_033 Failed");
				captureScreen(driver,"addEducation");
				Assert.fail();
			}
			
	
	}
}