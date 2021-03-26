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
	
	@FindBy(xpath="//input[@id='personal_txtEmployeeId']")
	WebElement employeeId;
	
	@FindBy(xpath="//input[@id='personal_txtLicenNo']")
	WebElement driverlicense;

	@FindBy(xpath="//input[@id='personal_txtNICNo']")
	WebElement ssnNum;
	
	@FindBy(xpath="//input[@id='personal_txtSINNo']")
	WebElement sinNum;
	
	@FindBy(xpath="//input[@id='personal_DOB']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//img[@id='empPic']")
	WebElement empImage;
	
	@FindBy(xpath="//input[@id='photofile']")
	WebElement fileChoose;

	
	
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
		Thread.sleep(2000);
		Select yearSelect = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearSelect.selectByValue(year);
		Select monthSelect = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthSelect.selectByVisibleText(month);
		ldriver.findElement(By.xpath("//a[normalize-space()='"+day+"']")).click();

	}
	
	public void maritalStatus(String status) {
		Select se = new Select(maritalStatus);
		se.selectByValue(status);
	}
	
	public void nationality(String n) {
		Select se = new Select(nationality);
		se.selectByVisibleText(n);
	}
	
	public void setEmpId(String id) {
		employeeId.sendKeys(id);
	}
	
	public void DriverLicenseNum(String n) {
		driverlicense.sendKeys(n);
	}
	
	
	
	public void SSNNum(String n) {
		ssnNum.sendKeys(n);
	}
	
	
	public void SINNum(String n) {
		sinNum.sendKeys(n);
	}
	
	
	public void DateOfBirth(String n) {
		dateOfBirth.sendKeys(n);
	}
	
	public void imageSelect() {
		empImage.click();
	}
	
	public void fileUpload(String path) {
		fileChoose.sendKeys(path);
	}
	
	
	
	
	
	
	
	
	
	
	
}
