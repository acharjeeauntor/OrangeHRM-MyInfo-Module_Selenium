package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ImmigrationPage {
WebDriver ldriver;
	
	public ImmigrationPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//b[normalize-space()='My Info']")
	WebElement myInfoTab;
	
	@FindBy(xpath="//a[normalize-space()='Immigration']")
	WebElement immigration;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addBtn;
	
	@FindBy(xpath="//input[@id='immigration_number']")
	WebElement number;
	
	@FindBy(xpath="//select[@id='immigration_country']")
	WebElement immigrationCountry;
	
	@FindBy(xpath="//input[@id='immigration_passport_issue_date']")
	WebElement issuedDate;
	
	@FindBy(xpath="//input[@id='immigration_passport_expire_date']")
	WebElement expiryDate;
	
	@FindBy(xpath="//input[@id='immigration_type_flag_1']")
	WebElement documentType;
	
	@FindBy(xpath="//textarea[@id='immigration_comments']")
	WebElement comment;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement saveBtn;
	
	@FindBy(xpath="//input[@id='btnDelete']")
	WebElement deleteBtn;
	
	@FindBy(xpath="//input[@id='btnAddAttachment']")
	WebElement attachmentsBtn;
	
	@FindBy(xpath="//input[@id='btnSaveAttachment']")
	WebElement btnSaveAttachment;
	
	@FindBy(xpath="//input[@id='ufile']")
	WebElement fileUploadLocation;
	
	
	
	public void clickMyInfo() {
		myInfoTab.click();
	}
	
	public void clickImmigration() {
		immigration.click();
	}
	
	public void clickAddBtn() {
		addBtn.click();
	}
	
	public void setNumber(String n) {
		number.sendKeys(n);
	}
	
	public void setComment(String com) {
		comment.sendKeys(com);
	}

	public void setImmigrationCountry(String country) {
		Select se = new Select(immigrationCountry);
		se.selectByVisibleText(country);
		
	}
	
	public void setIssuedDate(String yyyy,String month,String day) throws InterruptedException {
		issuedDate.click();
		Thread.sleep(2000);
		Select yearSelect = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearSelect.selectByValue(yyyy);
		Select monthSelect = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthSelect.selectByVisibleText(month);
		ldriver.findElement(By.xpath("//a[normalize-space()='"+day+"']")).click();
		
	}
	
	public void setExpiryDate(String yyyy,String month,String day) throws InterruptedException {
		expiryDate.click();
		Thread.sleep(2000);
		Select yearSelect = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearSelect.selectByValue(yyyy);
		Select monthSelect = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthSelect.selectByVisibleText(month);
		ldriver.findElement(By.xpath("//a[normalize-space()='"+day+"']")).click();
		
	}
	

	public void clickSave() {
		saveBtn.click();
	}
	
	public void clickDelete() {
		deleteBtn.click();
	}
	
	public void setDocumenttype() {
		documentType.click();
	}
	
	public void clickAttachmentsBtn() {
		attachmentsBtn.click();
	}
	
	
	public void uploadBtn() {
		btnSaveAttachment.click();
	}
	
	public void uploadFile(String filePath) {
		fileUploadLocation.sendKeys(filePath);
	}
	
	public void selectRow() {
		ldriver.findElement(By.xpath("//input[@id='immigrationCheckAll']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
