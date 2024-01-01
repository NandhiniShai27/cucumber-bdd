package com.pageobjectmoduleSIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasspractice.BaseClass_Practice;

public class MyInfo_PersonalDetails extends BaseClass_Practice {
	public static WebDriver driver;
	@FindBy(xpath="//span[text()='My Info']")
	WebElement Myinfo;
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	public WebElement getMyinfo() {
		return Myinfo;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getMiddlename() {
		return middlename;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getNickname() {
		return nickname;
	}


	public WebElement getEmpid() {
		return empid;
	}


	public WebElement getOtherid() {
		return otherid;
	}


	public WebElement getLicenseno() {
		return licenseno;
	}


	public WebElement getExpdate() {
		return expdate;
	}


	public WebElement getSsn() {
		return ssn;
	}


	public WebElement getSin() {
		return sin;
	}


	public WebElement getNationality() {
		return nationality;
	}


	public WebElement getAlgerian() {
		return Algeria;
	}


	public WebElement getStatus() {
		return status;
	}


	public WebElement getStatus2() {
		return status2;
	}


	public WebElement getDob() {
		return dob;
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getMilitary() {
		return military;
	}


	public WebElement getSmoker() {
		return smoker;
	}


	public WebElement getSave() {
		return save;
	}


	public WebElement getBloodtype() {
		return bloodtype;
	}


	public WebElement getPositive() {
		return positive;
	}


	public WebElement getSave2() {
		return save2;
	}


	@FindBy(xpath="//input[@name='middleName']")
	WebElement middlename;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;
	@FindBy(xpath="//label[text()='Nickname']/parent::div/following-sibling::div/input")
	WebElement nickname;
	@FindBy(xpath="//label[text()='Employee Id']//following::input[1]")
	WebElement empid;
	@FindBy(xpath="//label[text()='Other Id']//following::input[1]")
	WebElement otherid;
	@FindBy(xpath="(//label[@class='oxd-label'])[4]//following::input[1]")
	WebElement licenseno;
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[1]")
	WebElement expdate;
	@FindBy(xpath="//label[text()='SSN Number']//following::input[1]")
	WebElement ssn;
	@FindBy(xpath="//label[text()='SIN Number']//following::input[1]")
	WebElement sin;
	@FindBy(xpath="//label[text()='Nationality']/parent::div/following-sibling::div/div/div/div")
	WebElement nationality;
	@FindBy(xpath="//*[text()='Algerian']")
	WebElement Algeria;
	@FindBy(xpath="//label[text()='Marital Status']/parent::div/following-sibling::div/div/div/div[@tabindex='0']")
	WebElement status;
	@FindBy(xpath="//*[text()='Single']")
	WebElement status2;
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[2]")
	WebElement dob;
	@FindBy(xpath="(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]")
	WebElement gender;
	
	//@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[10]")
	@FindBy(xpath="//label[text()='Military Service']/parent::div/following-sibling::div/input")
	WebElement military;
	
	@FindBy(xpath="//label[text()='Smoker']/parent::div/following-sibling::div/div/label/input/following-sibling::span")
	WebElement smoker;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement save;
	@FindBy(xpath="//label[text()='Blood Type']/following::div[4]")
	WebElement bloodtype;
	@FindBy(xpath="//*[text()='A+']")
    WebElement positive;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement save2;
	
	
public MyInfo_PersonalDetails(WebDriver abc) {
    	driver=abc;
    	PageFactory.initElements(driver, this);
    	
    }

}
