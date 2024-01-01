package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page_searchpage {
	 static WebDriver driver;
	   
	   
	 @FindBy(xpath=("//select[@name='location']"))
	 WebElement location;
	 @FindBy(xpath=("//select[@name='hotels']"))
	 WebElement hotels;
	 @FindBy(xpath=("//select[@name='room_type']"))  
	 WebElement room;
	 @FindBy(xpath=("//select[@name='room_nos']"))
	 WebElement roomtype;
	 @FindBy(xpath=("//input[@id='datepick_in']"))
	 WebElement check;
	 	 public static WebDriver getDriver() {
		return driver;
	}
	
		public WebElement getCheck() {
	 	return check;
	 }
	 public void setCheck(WebElement check) {
	 	this.check = check;
	 }



	 @FindBy(xpath=("//input[@id='datepick_out']"))	
	 WebElement checkout;

	 @FindBy(xpath=("//select[@id='adult_room']"))	
	 WebElement adult;                                    
	 @FindBy(xpath=("//select[@id='child_room']"))
	 WebElement children;
	 public WebElement getRoomtype() {
		return roomtype;
	}



	@FindBy(xpath=("//input[@id='Submit']"))
	 WebElement search;
	 public WebElement getLocation() {
	 	return location;
	 }
	 public WebElement getHotels() {
	 	return hotels;
	 }
	 public WebElement getRoom() {
	 	return room;
	 }
	 

	 public WebElement getCheckout() {
	 	return checkout;
	 }
	 public WebElement getAdult() {
	 	return adult;
	 }
	 
	 public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
	 	return search;
	 }

	 public  Page_searchpage(WebDriver abc ) {
	   this.driver=abc;
	   PageFactory.initElements(driver, this);
	 }
}
