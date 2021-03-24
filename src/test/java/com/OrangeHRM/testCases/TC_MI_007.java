package com.OrangeHRM.testCases;

import java.io.IOException;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;

public class TC_MI_007 extends BaseClass {

	@Test(priority = 1)
	public void editPersonalDetails() throws InterruptedException, IOException {
		loginToTheApplication();
		PersonalDetailsPage pd = new PersonalDetailsPage(driver);
		pd.clickMyInfo();
		pd.clickPD();
		pd.clickEditAndSaveBtn();
		logger.info("Field Edit Start");
		
		try {
			pd.setEmpId("123");
			pd.DriverLicenseNum("145");
			pd.SSNNum("45");
			pd.SINNum("52");
			pd.DateOfBirth("22-11-1998");
		Assert.fail();
		logger.warn("TC_MI_007 fail");
		}catch(ElementNotInteractableException e) {
			Assert.assertTrue(true);
			logger.info("TC_MI_007 Passed");
		}

	}
}