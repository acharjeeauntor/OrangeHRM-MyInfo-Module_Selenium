package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.Job_Salary_Tax_Report_ToPage;
import com.OrangeHRM.pageObjects.QualificationsPage;


public class TC_MI_036 extends BaseClass {
	public String skill="JIRA";

	@Test(priority = 1)
	public void addSkill() throws InterruptedException, IOException {
		loginToTheApplication();
		showQualifications();
		QualificationsPage qp = new QualificationsPage(driver);
		qp.clickAddSkillBtn();
		qp.setSkill(skill);
		qp.setYear("02");
		qp.clickSkillSaveBtn();
			if(driver.getPageSource().contains(skill)) {
				Assert.assertTrue(true);
				logger.info("TC_MI_036 Passed");
			}else {
				logger.info("TC_MI_036 Failed");
				captureScreen(driver,"addSkill");
				Assert.fail();
			}
			
	
	}
}