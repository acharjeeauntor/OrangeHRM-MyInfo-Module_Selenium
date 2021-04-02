package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.utilities.XLUtils;

public class TC_MI_001 extends BaseClass{

	@Test(priority=1)
	public void LoginWithValidInfo() throws InterruptedException, IOException {
		String username = XLUtils.getCellData(excelPath, "sheet1", 3, 0);
		 String password = XLUtils.getCellData(excelPath, "sheet1", 3, 1);
		LoginPage lp = new LoginPage(driver);
		logger.info("Providing Username and Password.....");
		lp.getUserName(username);
		lp.getPassword(password);
		lp.loginBtn();
		Thread.sleep(2000);
		
		logger.info("Dashboard page Validation Started....");
		if(driver.getPageSource().contains("Personal Details")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_001 Pass");
		}else {
			logger.info("TC_MI_001 failed");
			captureScreen(driver,"LoginWithValidInfo");
			Assert.fail();
		}
	}
	
	
}
