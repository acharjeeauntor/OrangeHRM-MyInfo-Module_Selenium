package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_006 extends BaseClass{
	public static String fName= "Auntor";
	public static String mName = "Acharja";
	public static String lName = "Ontu";

	@Test(priority=1)
	public void editPersonalDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		PersonalDetailsPage pd = new PersonalDetailsPage(driver);
		pd.clickMyInfo();
		pd.clickPD();
		pd.clickEditAndSaveBtn();
		logger.info("Field Edit Start");
		pd.firstName(fName);
		pd.middleName(mName);
		pd.lastName(lName);
		pd.licenseDate("1998", "Jun", "22");
		pd.maritalStatus("Single");
		pd.nationality("Bangladeshi");
		logger.info("Field Edit End");
		Thread.sleep(2000);
		pd.clickEditAndSaveBtn();
		
		logger.info("Edit Validation Start....");
		if(driver.getPageSource().contains(fName+" "+mName+" "+lName)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_006 Pass");
		}else {
			logger.warn("TC_MI_006 failed");
			captureScreen(driver,"editPersonalDetails");
			Assert.fail();
		}
		
	}
}