package com.pageobjectmoduleSIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfo_EmergContact {
	public static WebDriver driver;
	@FindBy(xpath = "//a[text()='Emergency Contacts']")
    WebElement emgcontact; 
	@FindBy(xpath="(//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--text'])[1]")
    WebElement add;
    @FindBy(xpath="//label[text()='Name']//parent::div/following-sibling::div/input")
    WebElement name;
    @FindBy(xpath="//label[text()='Relationship']//parent::div/following-sibling::div/input")
    WebElement relationship;
    @FindBy(xpath="//label[text()='Home Telephone']//parent::div/following-sibling::div/input")
    WebElement emgphone;
    @FindBy(xpath="//label[text()='Mobile']//parent::div/following-sibling::div/input")
    WebElement emgmob;
    @FindBy(xpath="//label[text()='Work Telephone']//parent::div/following-sibling::div/input")
    WebElement emgwork;
    @FindBy(xpath="//button[@type='submit']")
    WebElement save4;
    
public WebElement getEmgcontact() {
		return emgcontact;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getRelationship() {
		return relationship;
	}

	public WebElement getEmgphone() {
		return emgphone;
	}

	public WebElement getEmgmob() {
		return emgmob;
	}

	public WebElement getEmgwork() {
		return emgwork;
	}

	public WebElement getSave4() {
		return save4;
	}

public MyInfo_EmergContact(WebDriver abc ){
	driver=abc;
	PageFactory.initElements(driver, this);
}
}
