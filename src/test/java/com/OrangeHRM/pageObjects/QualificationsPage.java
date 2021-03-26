package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QualificationsPage {
	WebDriver ldriver;

	public QualificationsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//b[normalize-space()='My Info']")
	WebElement myInfoTab;

	@FindBy(xpath = "//a[normalize-space()='Qualifications']")
	WebElement qualifications;

	// Working Experience Part

	@FindBy(xpath = "//input[@id='addWorkExperience']")
	WebElement addWorkBtn;

	@FindBy(xpath = "//input[@id='experience_employer']")
	WebElement company;

	@FindBy(xpath = "//input[@id='experience_jobtitle']")
	WebElement jobTitle;

	@FindBy(xpath = "//input[@id='btnWorkExpSave']")
	WebElement workSaveBtn;

	@FindBy(xpath = "//input[@id='workCheckAll']")
	WebElement workCheck;

	@FindBy(xpath = "//input[@id='delWorkExperience']")
	WebElement deleteWorkBtn;

	// Education Part

	@FindBy(xpath = "//input[@id='addEducation']")
	WebElement addEduBtn;

	@FindBy(xpath = "//select[@id='education_code']")
	WebElement level;

	@FindBy(xpath = "//input[@id='education_institute']")
	WebElement institute;

	@FindBy(xpath = "//input[@id='btnEducationSave']")
	WebElement eduSaveBtn;

	@FindBy(xpath = "//input[@id='educationCheckAll']")
	WebElement eduCheck;

	@FindBy(xpath = "//input[@id='delEducation']")
	WebElement deleteEduBtn;

	// Skills Part

	@FindBy(xpath = "//input[@id='addSkill']")
	WebElement addSkillBtn;

	@FindBy(xpath = "//select[@id='skill_code']")
	WebElement skill;

	@FindBy(xpath = "//input[@id='skill_years_of_exp']")
	WebElement year;

	@FindBy(xpath = "//input[@id='btnSkillSave']")
	WebElement skillSaveBtn;

	@FindBy(xpath = "//input[@id='skillCheckAll']")
	WebElement skillCheck;

	@FindBy(xpath = "//input[@id='delSkill']")
	WebElement deleteSkillBtn;

	// Language Part

	@FindBy(xpath = "//input[@id='addLanguage']")
	WebElement addLanBtn;

	@FindBy(xpath = "//select[@id='language_code']")
	WebElement lanCode;

	@FindBy(xpath = "//select[@id='language_lang_type']")
	WebElement fluency;

	@FindBy(xpath = "//select[@id='language_competency']")
	WebElement competency;

	@FindBy(xpath = "//input[@id='btnLanguageSave']")
	WebElement lanSaveBtn;

	@FindBy(xpath = "//input[@id='languageCheckAll']")
	WebElement lanCheck;

	@FindBy(xpath = "//input[@id='delLanguage']")
	WebElement deleteLanBtn;

	// License Part

	@FindBy(xpath = "//input[@id='addLicense']")
	WebElement addLicBtn;

	@FindBy(xpath = "//select[@id='license_code']")
	WebElement licCode;

	@FindBy(xpath = "//input[@id='license_license_no']")
	WebElement number;

	@FindBy(xpath = "//input[@id='btnLicenseSave']")
	WebElement licSaveBtn;

	@FindBy(xpath = "//input[@id='licenseCheckAll']")
	WebElement licCheck;

	@FindBy(xpath = "//input[@id='delLicense']")
	WebElement deleteLicBtn;

// Attachments Part

	@FindBy(xpath = "//input[@id='btnAddAttachment']")
	WebElement addAttachBtn;

	@FindBy(xpath = "//input[@id='ufile']")
	WebElement fileChoose;

	@FindBy(xpath = "//input[@id='btnSaveAttachment']")
	WebElement attachmentSaveBtn;

	@FindBy(xpath = "//input[@id='attachmentsCheckAll']")
	WebElement attchmentCheck;

	@FindBy(xpath = "//input[@id='btnDeleteAttachment']")
	WebElement deleteAttachmentBtn;

	public void clickMyInfo() {
		myInfoTab.click();
	}

	public void clickQualification() {
		qualifications.click();
	}

	// Working Experience Part

	public void setCompanyName(String name) {
		company.sendKeys(name);
	}

	public void setJobtitle(String name) {
		jobTitle.sendKeys(name);
	}

	public void clickWorkSaveBtn() {
		workSaveBtn.click();
	}

	public void clickAddWorkBtn() {
		addWorkBtn.click();
	}

	public void checkWorkAll() {
		workCheck.click();
	}

	public void deleteWorkBtn() {
		deleteWorkBtn.click();
	}

	// Education Part

	public void setLevel(String name) {
		Select se = new Select(skill);
		se.selectByVisibleText(name);
	}

	public void setInstitute(String name) {
		institute.sendKeys(name);
	}

	public void clickEduSaveBtn() {
		eduSaveBtn.click();
	}

	public void clickAddEduBtn() {
		addEduBtn.click();
	}

	public void checkEduAll() {
		eduCheck.click();
	}

	public void deleteEduBtn() {
		deleteEduBtn.click();
	}

	// Skills Part

	public void setSkill(String name) {
		Select se = new Select(level);
		se.selectByVisibleText(name);
	}

	public void setYear(String n) {
		year.sendKeys(n);
	}

	public void clickSkillSaveBtn() {
		skillSaveBtn.click();
	}

	public void clickAddSkillBtn() {
		addSkillBtn.click();
	}

	public void checkSkillAll() {
		skillCheck.click();
	}

	public void deleteSkillBtn() {
		deleteSkillBtn.click();
	}

	// Language Part

	public void setLanguage(String name) {
		Select se = new Select(lanCode);
		se.selectByVisibleText(name);
	}

	public void setFluency(String n) {
		Select se = new Select(fluency);
		se.selectByVisibleText(n);
	}

	public void setCompetency(String name) {
		Select se = new Select(competency);
		se.selectByVisibleText(name);
	}

	public void clickLanSaveBtn() {
		lanSaveBtn.click();
	}

	public void clickAddLanBtn() {
		addLanBtn.click();
	}

	public void checkLanAll() {
		lanCheck.click();
	}

	public void deleteLanBtn() {
		deleteLanBtn.click();
	}

	// License Part

	public void setLLicenseType(String name) {
		Select se = new Select(licCode);
		se.selectByVisibleText(name);
	}

	public void setLLicenseNumber(String n) {
		number.sendKeys(n);
	}

	public void clickLicSaveBtn() {
		licSaveBtn.click();
	}

	public void clickAddLicBtn() {
		addLicBtn.click();
	}

	public void checkLicAll() {
		licCheck.click();
	}

	public void deleteLicBtn() {
		deleteLicBtn.click();
	}

//Attachment Part

	public void setLfile(String location) {
		fileChoose.sendKeys(location);
	}

	public void clickUploadBtn() {
		attachmentSaveBtn.click();
	}

	public void clickAddAttachmentBtn() {
		addAttachBtn.click();
	}

	public void checkAttachmentAll() {
		attchmentCheck.click();
	}

	public void deleteAttachmentBtn() {
		deleteAttachmentBtn.click();
	}
}
