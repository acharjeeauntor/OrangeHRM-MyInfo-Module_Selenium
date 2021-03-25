package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;


public class TC_MI_029 extends BaseClass {

	@Test(priority = 1)
	public void viewReport() throws InterruptedException, IOException {
		loginToTheApplication();
		Job_Salary_Tax_Report_ToPage report = new Job_Salary_Tax_Report_ToPage(driver);
		
	
		report.clickMyInfo();
		report.clickReport();
			if(driver.getPageSource().contains("Assigned Supervisors")) {
				Assert.assertTrue(true);
				logger.info("TC_MI_029 Passed");
			}else {
				logger.info("TC_MI_029 Failed");
				captureScreen(driver,"viewReport");
				Assert.fail();
			}
			
	
	}
}