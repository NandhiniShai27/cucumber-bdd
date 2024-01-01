package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page_Logoutpage {
	static WebDriver driver;
	@FindBy(xpath=("//input[@name='check_all']"))	
	WebElement checkall;
	@FindBy(xpath=("//input[@name='cancelall']"))
	WebElement cancelall;
	@FindBy(xpath=("//input[@name='logout']"))
	WebElement logout;

	public WebElement getCheckall() {
		return checkall;
	}
	public WebElement getCancelall() {
		return cancelall;
	}
	public WebElement getLogout() {
		return logout;
	}
	public Page_Logoutpage(WebDriver abc) {
	this.driver=abc;
	PageFactory.initElements(driver,this);
	}
}
