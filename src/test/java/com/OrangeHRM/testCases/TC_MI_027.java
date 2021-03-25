package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;


public class TC_MI_027 extends BaseClass {

	@Test(priority = 1)
	public void viewSalaryDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		Job_Salary_Tax_Report_ToPage salary = new Job_Salary_Tax_Report_ToPage(driver);
		
	
			salary.clickMyInfo();
			salary.clickSalary();
			if(driver.getPageSource().contains("Assigned Salary Components")) {
				Assert.assertTrue(true);
				logger.info("TC_MI_027 Passed");
			}else {
				logger.info("TC_MI_027 Failed");
				captureScreen(driver,"viewSalaryDetails");
				Assert.fail();
			}
			
	
	}
}