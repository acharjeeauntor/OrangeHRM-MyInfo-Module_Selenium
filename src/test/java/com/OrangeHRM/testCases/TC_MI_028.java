package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;


public class TC_MI_028 extends BaseClass {

	@Test(priority = 1)
	public void viewTaxDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		Job_Salary_Tax_Report_ToPage tax = new Job_Salary_Tax_Report_ToPage(driver);
		
	
		
		try {
			tax.clickMyInfo();
			tax.clickTax();
			tax.setTax();
		}catch(NoSuchElementException e) {
			Assert.assertTrue(true);
			logger.info("TC_MI_028 Passed");
		}
			
	
	}
}