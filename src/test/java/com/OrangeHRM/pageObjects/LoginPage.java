package com.OrangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginBtn;
	
	public void getUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void getPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void loginBtn() {
		loginBtn.submit();
	}
	
}
