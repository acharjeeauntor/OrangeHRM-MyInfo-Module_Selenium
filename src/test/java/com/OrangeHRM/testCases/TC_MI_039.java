package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_039 extends BaseClass {
	public String language="English";
	public String comment="this is my lanuguage";
	@Test(priority = 1)
	public void addLanguage() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddLanBtn();
		qp.setLanguage(language);
		qp.setFluency("Speaking");
		qp.setCompetency("Good");
		qp.setLanComment(comment);
		qp.clickLanSaveBtn();
		Thread.sleep(2000);
			if(driver.getPageSource().contains(comment)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_039 Passed");
			}else {
				logger.info("TC_MI_039 Failed");
				captureScreen(driver,"addLanguage");
				Assert.fail();
			}
			
	
	}
}