package com.pageobjectmoduleSIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasspractice.BaseClass_Practice;

public class Loginpage_HRM extends BaseClass_Practice {
	public static WebDriver driver;
    @FindBy(xpath="//input[@name='username']")
	WebElement username;
    public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//input[@name='password']")
    WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    WebElement login;
   
    public Loginpage_HRM(WebDriver abc) {
    	this.driver=abc;
    	PageFactory.initElements(driver, this);
    	
    }
}
