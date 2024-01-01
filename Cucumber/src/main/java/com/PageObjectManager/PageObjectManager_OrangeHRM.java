package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.pageobjectmoduleSIT.Loginpage_HRM;
import com.pageobjectmoduleSIT.MyInfo_EmergContact;
import com.pageobjectmoduleSIT.MyInfo_PersonalDetails;
import com.pageobjectmoduleSIT.Myinfo_ContactDetails;

public class PageObjectManager_OrangeHRM {
  
	public static WebDriver driver;
   
  private Loginpage_HRM lp;
   public Loginpage_HRM getInstanceoflp() {
	if (lp==null) {
		lp= new Loginpage_HRM(driver);
		}
	return lp;
   }
   
   private MyInfo_PersonalDetails pd;
   public  MyInfo_PersonalDetails  getInstanceofpd() {
	if (pd==null) {
		pd= new MyInfo_PersonalDetails(driver);
	}
   return pd;
  }
   private Myinfo_ContactDetails cd;
   public Myinfo_ContactDetails getInstanceofcd() {
	   if (cd==null) {
		cd= new Myinfo_ContactDetails(driver);
	}
	return cd;
   }
   private MyInfo_EmergContact ec;
   public MyInfo_EmergContact getInstanceofec() {
	   if(ec==null) {
		   ec= new MyInfo_EmergContact(driver);
	   }
	   return ec;
   }
   public PageObjectManager_OrangeHRM(WebDriver abc) {
		this.driver=abc;
	}
}
