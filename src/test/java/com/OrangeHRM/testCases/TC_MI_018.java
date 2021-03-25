package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.ContactDetailsPage;
import com.OrangeHRM.pageObjects.EmergencyContactsPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PersonalDetailsPage;
import com.OrangeHRM.pageObjects.DependentsPage;

public class TC_MI_018 extends BaseClass{
 public static String name ="ontu";
 public static String relation ="child";

	@Test(priority=1)
	public void addMultipleDependents() throws InterruptedException, IOException {
		loginToTheApplication();
		DependentsPage dep = new DependentsPage(driver);
		dep.clickMyInfo();
		dep.clickDependent();
		dep.clickAddBtn();
		dep.setName(name);
		dep.setRelationShip(relation);
	dep.setDateOfBirth("2005", "Jan", "21");
	dep.clickSave();
		if(driver.getPageSource().contains(name)) {
			Assert.assertTrue(true);
			logger.info("TC_MI_018 Pass");
		}else {
			logger.warn("TC_MI_018 failed");
			captureScreen(driver,"addMultipleDependents");
			Assert.fail();
		}
	}
}