package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_038 extends BaseClass {
	public String skill="Perl";
	public String comment = "This is second skill";

	@Test(priority = 1)
	public void deleteSkill() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.checkSkillAll();
		qp.deleteSkillBtn();
		Thread.sleep(2000);
			if(driver.getPageSource().contains(comment)) {
				logger.info("TC_MI_038 Failed");
				captureScreen(driver,"deleteSkill");
				Assert.fail();
			}else {
				
				Assert.assertTrue(true);
				logger.info("TC_MI_038 Passed");
			}
			
	
	}
}