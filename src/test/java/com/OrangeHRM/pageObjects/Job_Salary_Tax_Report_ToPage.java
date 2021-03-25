package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Job_Salary_Tax_Report_ToPage {
WebDriver ldriver;
	
	public Job_Salary_Tax_Report_ToPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//b[normalize-space()='My Info']")
	WebElement myInfoTab;
	
	@FindBy(xpath="//a[normalize-space()='Job']")
	WebElement job;
	
	@FindBy(xpath="//a[normalize-space()='Salary']")
	WebElement salary;
	
	@FindBy(xpath="//a[normalize-space()='Tax Exemptions']")
	WebElement tax;
	
	
	@FindBy(xpath="//a[normalize-space()='Report-to']")
	WebElement report;
	
	@FindBy(xpath="//select[@id='job_job_title']")
	WebElement selcetJobtitle;
	
	@FindBy(xpath="//select[@id='tax_state']")
	WebElement selcetTax;
	
	
	
	public void clickMyInfo() {
		myInfoTab.click();
	}
	
	public void clickjob() {
		job.click();
	}
	
	public void clickSalary() {
		salary.click();
	}
	
	public void clickTax() {
		tax.click();
	}
	
	public void clickReport() {
		report.click();
	}
	
	
	public void setJobTitle() {
		Select se = new Select(selcetJobtitle);
	 se.selectByVisibleText("Abx");
		
	}
	
	public void setTax() {
		Select se = new Select(selcetTax);
	 se.selectByVisibleText("Abx");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
