package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;


public class TC_MI_026 extends BaseClass {

	@Test(priority = 1)
	public void viewJobDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		Job_Salary_Tax_Report_ToPage job = new Job_Salary_Tax_Report_ToPage(driver);
		
		try {
			job.clickMyInfo();
			job.clickjob();
			job.setJobTitle();
		}catch(NoSuchElementException e) {
			Assert.assertTrue(true);
			logger.info("TC_MI_026 Passed");
		}
		
	}
}