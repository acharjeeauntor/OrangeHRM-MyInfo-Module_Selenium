package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_008 extends BaseClass{

	@Test(priority=1)
	public void editPersonalDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		PersonalDetailsPage pd = new PersonalDetailsPage(driver);
		pd.clickMyInfo();
		pd.clickPD();
		pd.imageSelect();
		Thread.sleep(3000);
		pd.fileUpload("D:\\SQA-practice-project\\Automation-Selenium\\Project\\OrangeHRM\\Files\\tt.exe");
		logger.info("file upload Validation Start....");
		if(driver.getPageSource().contains("Failed to save")) {
			logger.info("TC_MI_008 passed....");
			Assert.assertTrue(true);
		}else {
			logger.warn("TC_MI_008 failed....");
			Assert.fail();
		}
		
	}
}