package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page_Myitenarypage {
	public WebElement getNow() {
		return now;
	}
static WebDriver driver;
@FindBy(id=("my_itinerary"))
WebElement now;


public Page_Myitenarypage(WebDriver abc) {
	this.driver=abc;
	PageFactory.initElements(driver, this);
	
}
}
