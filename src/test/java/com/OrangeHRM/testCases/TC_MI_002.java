package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;

public class TC_MI_002 extends BaseClass{

	@Test(priority=1)
	public void LoginWithInValidPass() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		logger.info("Providing Username and Password.....");
		lp.getUserName(username);
		lp.getPassword("fog12345");
		lp.loginBtn();
		Thread.sleep(2000);
		
		logger.info("Dashboard page Validation Started....");
		if(driver.getPageSource().contains("Invalid credentials")) {
			Assert.assertTrue(true);
			logger.info("TC_MI_002 Pass");
			
		}else {
			logger.info("TC_MI_002 failed");
			captureScreen(driver,"LoginWithInValidPass");
			Assert.fail();
		}
	}
}
