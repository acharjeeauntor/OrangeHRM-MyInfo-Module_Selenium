package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DependentsPage {
WebDriver ldriver;
	
	public DependentsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//b[normalize-space()='My Info']")
	WebElement myInfoTab;
	
	@FindBy(xpath="//a[normalize-space()='Dependents']")
	WebElement dependents;
	
	@FindBy(xpath="//input[@id='btnAddDependent']")
	WebElement addBtn;
	
	@FindBy(xpath="//input[@id='dependent_name']")
	WebElement name;
	
	@FindBy(xpath="//select[@id='dependent_relationshipType']")
	WebElement relationType;
	
	@FindBy(xpath="//input[@id='dependent_dateOfBirth']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//input[@id='btnSaveDependent']")
	WebElement saveBtn;
	
	@FindBy(xpath="//input[@id='delDependentBtn']")
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
	
	public void clickDependent() {
		dependents.click();
	}
	
	public void clickAddBtn() {
		addBtn.click();
	}
	
	public void setName(String n) {
		name.sendKeys(n);
	}

	public void setRelationShip(String relation) {
		Select se = new Select(relationType);
		se.selectByValue(relation);
		
	}
	
	public void setDateOfBirth(String yyyy,String month,String day) throws InterruptedException {
		dateOfBirth.click();
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
