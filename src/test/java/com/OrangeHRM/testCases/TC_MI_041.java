package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_041 extends BaseClass {
	public String language="Chinese";

	@Test(priority = 1)
	public void deleteLanguage() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.checkLanAll();
		qp.deleteLanBtn();
			if(driver.getPageSource().contains(language)) {
				logger.info("TC_MI_041 Failed");
				captureScreen(driver,"deleteLanguage");
				Assert.fail();
			}else {
				
				Assert.assertTrue(true);
				logger.info("TC_MI_041 Passed");
			}
			
	
	}
}