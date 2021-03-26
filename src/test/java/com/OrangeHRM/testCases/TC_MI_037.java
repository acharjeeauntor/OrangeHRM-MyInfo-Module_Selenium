package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_037 extends BaseClass {
	public String skill="Perl";

	@Test(priority = 1)
	public void addMultipleSkill() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddSkillBtn();
		qp.setSkill(skill);
		qp.setYear("01");
			if(driver.getPageSource().contains(skill)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_037 Passed");
			}else {
				logger.info("TC_MI_037 Failed");
				captureScreen(driver,"addMultipleSkill");
				Assert.fail();
			}
			
	
	}
}