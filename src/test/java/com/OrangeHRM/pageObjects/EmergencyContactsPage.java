package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmergencyContactsPage {
WebDriver ldriver;
	
	public EmergencyContactsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//b[normalize-space()='My Info']")
	WebElement myInfoTab;
	
	@FindBy(xpath="//a[normalize-space()='Emergency Contacts']")
	WebElement EmergencyContacts;
	
	@FindBy(xpath="//input[@id='btnAddContact']")
	WebElement addBtn;
	
	@FindBy(xpath="//input[@id='emgcontacts_name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='emgcontacts_relationship']")
	WebElement relation;
	
	@FindBy(xpath="//input[@id='emgcontacts_mobilePhone']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='btnSaveEContact']")
	WebElement saveBtn;
	
	@FindBy(xpath="//input[@id='delContactsBtn']")
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
	
	public void clickEC() {
		EmergencyContacts.click();
	}
	
	public void clickAddBtn() {
		addBtn.click();
	}
	
	public void setName(String n) {
		name.sendKeys(n);
	}

	public void setRelationShip(String c) {
		relation.sendKeys(c);
	}
	
	public void setMobile(String m) {
		mobile.sendKeys(m);
	}
	

	public void clickSave() {
		saveBtn.click();
	}
	
	public void clickDelete() {
		deleteBtn.click();
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
		ldriver.findElement(By.xpath("//input[@id='checkAll']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
