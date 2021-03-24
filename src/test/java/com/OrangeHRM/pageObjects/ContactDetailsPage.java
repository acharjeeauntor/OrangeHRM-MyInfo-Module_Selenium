package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactDetailsPage {
WebDriver ldriver;
	
	public ContactDetailsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//b[normalize-space()='My Info']")
	WebElement myInfoTab;
	
	@FindBy(xpath="//a[normalize-space()='Contact Details']")
	WebElement contactDetails;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement editAndsaveBtn;
	
	@FindBy(xpath="//input[@id='contact_street1']")
	WebElement address1;
	
	@FindBy(xpath="//input[@id='contact_city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='contact_country']")
	WebElement country;
	
	
	
	
	public void clickMyInfo() {
		myInfoTab.click();
	}
	
	public void clickCD() {
		contactDetails.click();
	}
	
	public void clickEditAndSaveBtn() {
		editAndsaveBtn.click();
	}
	
	public void setAddress(String add) {
		address1.clear();
		address1.sendKeys(add);
	}

	public void setCity(String c) {
		city.clear();
		city.sendKeys(c);
	}
	
	
	public void setCountry(String name) {
		Select se = new Select(country);
		se.selectByVisibleText(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
