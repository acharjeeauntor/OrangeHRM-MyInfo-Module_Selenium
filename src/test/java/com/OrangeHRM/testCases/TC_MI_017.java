package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;
import com.OrangeHRM.pageObjects.DependentsPage;

public class TC_MI_017 extends BaseClass{
 public static String name ="Auntor";
 public static String relation ="child";

	@Test(priority=1)
	public void addDependents() throws InterruptedException, IOException {
		loginToTheApplication();
		DependentsPage dep = new DependentsPage(driver);
		dep.clickMyInfo();
		dep.clickDependent();
		dep.clickAddBtn();
		dep.setName(name);
		dep.setRelationShip(relation);
	dep.setDateOfBirth("2001", "Apr", "21");
	dep.clickSave();
		if(driver.getPageSource().contains(name)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_017 Pass");
		}else {
			logger.warn("TC_MI_017 failed");
			captureScreen(driver,"addDependents");
			Assert.fail();
		}
	}
}