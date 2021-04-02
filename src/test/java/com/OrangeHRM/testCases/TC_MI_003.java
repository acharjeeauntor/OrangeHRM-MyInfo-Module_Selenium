package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.utilities.XLUtils;

public class TC_MI_003 extends BaseClass{

	@Test(priority=1)
	public void LoginWithInValidUsername() throws InterruptedException, IOException {
		 String password = XLUtils.getCellData(excelPath, "sheet1", 3, 1);
		LoginPage lp = new LoginPage(driver);
		logger.info("Providing Username and Password.....");
		lp.getUserName("Auntor");
		lp.getPassword(password);
		lp.loginBtn();
		Thread.sleep(2000);
		
		logger.info("Dashboard page Validation Started....");
		if(driver.getPageSource().contains("Invalid credentials")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_003 Pass");
			
		}else {
			logger.info("TC_MI_003 failed");
			captureScreen(driver,"LoginWithInValidUsername");
			Assert.fail();
		}
	}
}
