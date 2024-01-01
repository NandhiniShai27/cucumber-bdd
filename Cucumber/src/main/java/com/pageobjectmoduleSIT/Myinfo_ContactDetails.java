package com.pageobjectmoduleSIT;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclasspractice.BaseClass_Practice;

public class Myinfo_ContactDetails extends BaseClass_Practice {
	public static WebDriver driver;
	 @FindBy(xpath="//a[text()='Contact Details']")
	 WebElement contactdetails;
     @FindBy(xpath="//label[text()='Street 1']/parent::div/following-sibling::div/input")
	 WebElement street1; 
     @FindBy(xpath = "//label[text()='Street 2']/parent::div/following-sibling::div/input")
     WebElement street2;
     @FindBy(xpath ="//label[text()='City']/parent::div/following-sibling::div/input" )
     WebElement city;
    @FindBy(xpath="//label[text()='State/Province']/parent::div/following-sibling::div/input")
     WebElement state;
    @FindBy(xpath="//label[text()='Zip/Postal Code']/parent::div/following-sibling::div/input")
     WebElement Zipcode;
    @FindBy(xpath="//label[text()='Country']/parent::div/following-sibling::div/div/div/div[1]")
     WebElement country;
    public WebElement getContactdetails() {
		return contactdetails;
	}

	public WebElement getStreet1() {
		return street1;
	}

	public WebElement getStreet2() {
		return street2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return Zipcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getIndia() {
		return india;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getWork() {
		return work;
	}

	public WebElement getWorkmail() {
		return workmail;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getSave3() {
		return save3;
	}

	@FindBy(xpath ="//*[text()='India']" )
     WebElement india;
    @FindBy(xpath="//label[text()='Home']/parent::div/following-sibling::div/input")
     WebElement home;
    @FindBy(xpath="//label[text()='Mobile']/parent::div/following-sibling::div/input") 
    WebElement mobile;
    @FindBy(xpath="//label[text()='Work']/parent::div/following-sibling::div/input")
     WebElement work;
    @FindBy(xpath="//label[text()='Work Email']/parent::div/following-sibling::div/input")
     WebElement workmail;
     @FindBy(xpath="//label[text()='Other Email']/parent::div/following-sibling::div/input")
	 WebElement mail;
     @FindBy(xpath="//button[@type='submit']")
     WebElement save3; 

     public Myinfo_ContactDetails(WebDriver abc) {
    	 driver=abc;
    	 PageFactory.initElements(driver, this);
     }
     
}
