package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page_loginpage {
static WebDriver driver;
	
	@FindBy(xpath=("//input[@id='username']"))
	private WebElement user; 
    
		@FindBy(xpath=("//input[@id='password']"))
	private WebElement pass;

	@FindBy(xpath=("//input[@id='login']"))
	private WebElement login;	
	
	public WebElement getUser() {
		return user;
	}

    public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
//Methodoverloadingconcept this currentclassreferencee
 public Page_loginpage(WebDriver abc) {
	this.driver=abc;
	PageFactory.initElements(driver, this);
}
}
