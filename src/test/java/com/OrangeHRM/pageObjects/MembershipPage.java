package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MembershipPage {
WebDriver ldriver;
	
	public MembershipPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//b[normalize-space()='My Info']")
	WebElement myInfoTab;
	
	@FindBy(xpath="//a[normalize-space()='Memberships']")
	WebElement membership;
	
	@FindBy(xpath="//input[@id='btnAddMembershipDetail']")
	WebElement addBtn;
	
	@FindBy(xpath="//select[@id='membership_membership']")
	WebElement selectMembership;
	
	@FindBy(xpath="//input[@id='membership_subscriptionAmount']")
	WebElement amount;
	
	@FindBy(xpath="//input[@id='btnSaveMembership']")
	WebElement saveBtn;
	
	@FindBy(xpath="//input[@id='delMemsBtn']")
	WebElement deleteBtn;
	
	
	
	
	public void clickMyInfo() {
		myInfoTab.click();
	}
	
	public void clickMembership() {
		membership.click();
	}
	
	public void clickAddBtn() {
		addBtn.click();
	}
	
	public void setAmount(String n) {
		amount.sendKeys(n);
	}

	public void setMembership(String t) {
		Select se = new Select(selectMembership);
		se.selectByVisibleText(t);
		
	}
	

	public void clickSave() {
		saveBtn.click();
	}
	
	public void clickDelete() {
		deleteBtn.click();
	}
	
	public void selectRow() {
		ldriver.findElement(By.xpath("//input[@id='checkAllMem']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
