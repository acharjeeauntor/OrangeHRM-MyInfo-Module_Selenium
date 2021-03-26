package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_032 extends BaseClass {
	public String companyname="Prity";

	@Test(priority = 1)
	public void deleteWorkExp() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.checkWorkAll();
		qp.deleteWorkBtn();
		Thread.sleep(3000);
			if(driver.getPageSource().contains(companyname)&&driver.getPageSource().contains("QE")) {
				logger.info("TC_MI_032 Failed");
				captureScreen(driver,"deleteWorkExp");
				Assert.fail();
			}else {
				
				Assert.assertTrue(true);
				logger.info("TC_MI_032 Passed");
			}
			
	
	}
}