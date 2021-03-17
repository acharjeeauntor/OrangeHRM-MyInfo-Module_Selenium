package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;

public class TC_MI_004 extends BaseClass{

	@Test(priority=1)
	public void LoginWithInValidInfo() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		logger.info("Providing Username and Password.....");
		lp.getUserName("ontu");
		lp.getPassword("auntor");
		lp.loginBtn();
		Thread.sleep(2000);
		
		logger.info("Dashboard page Validation Started....");
		if(driver.getPageSource().contains("Invalid credentials")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_004 Pass");
			
		}else {
			logger.info("TC_MI_004 failed");
			captureScreen(driver,"LoginWithInValidInfo");
			Assert.fail();
		}
	}
}