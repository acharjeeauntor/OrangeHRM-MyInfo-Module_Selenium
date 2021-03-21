package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPage {
WebDriver ldriver;
	
	public PersonalDetailsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//b[normalize-space()='My Info']")
	WebElement myInfoTab;
	
	@FindBy(xpath="//a[normalize-space()='Personal Details']")
	WebElement personalDetails;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement editAndsaveBtn;
	
	@FindBy(xpath="//input[@id='personal_txtEmpFirstName']")
	WebElement fName;
	
	@FindBy(xpath="//input[@id='personal_txtEmpMiddleName']")
	WebElement mName;
	
	@FindBy(xpath="//input[@id='personal_txtEmpLastName']")
	WebElement lName;
	
	@FindBy(xpath="//input[@id='personal_txtLicExpDate']")
	WebElement licenseExpiryDate;
	
	@FindBy(xpath="//select[@id='personal_cmbMarital']")
	WebElement maritalStatus;
	
	@FindBy(xpath="//select[@id='personal_cmbNation']")
	WebElement nationality;

	
	public void clickMyInfo() {
		myInfoTab.click();
	}
	
	public void clickPD() {
		personalDetails.click();
	}
	
	public void clickEditAndSaveBtn() {
		editAndsaveBtn.click();
	}
	
	public void firstName(String name) {
		fName.clear();
		fName.sendKeys(name);
	}
	
	public void middleName(String name) {
		mName.clear();
		mName.sendKeys(name);
	}
	
	public void lastName(String name) {
		lName.clear();
		lName.sendKeys(name);
	}
	
	public void licenseDate(String year,String month,String day) throws InterruptedException {
		licenseExpiryDate.click();

		WebElement selectYear = ldriver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		WebElement selectMonth = ldriver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		WebElement selectDay = ldriver.findElement(By.xpath("//a[normalize-space()='"+day+"']"));
		Select yearSelect = new Select(selectYear);
		Select monthSelect = new Select(selectMonth);
		yearSelect.selectByValue(year);
		Thread.sleep(2000);
//		monthSelect.selectByVisibleText(month);
//		Thread.sleep(2000);
		selectDay.click();
		
	}
	
	public void maritalStatus(String status) {
		Select se = new Select(maritalStatus);
		se.selectByValue(status);
	}
	
	public void nationality(String n) {
		Select se = new Select(nationality);
		se.selectByVisibleText(n);
	}
	
	
}
