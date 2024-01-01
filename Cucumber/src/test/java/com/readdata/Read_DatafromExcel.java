package com.readdata;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.baseclasspractice.BaseClass_Practice;
import com.pageobjectmanagerpractice.PageObjectManager_OrangeHRM;
public class Read_DatafromExcel extends BaseClass_Practice{
	public static  WebDriver driver =browserlaunch("chrome");
	public static PageObjectManager_OrangeHRM pom = new PageObjectManager_OrangeHRM(driver);
	static String path ="C:\\Users\\ADMIN\\eclipse-workspace\\Mavenproject\\Excel\\Book1.xlsx";
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
    url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    implicitywaits(10);
	  //loginpage	
		valuesonelement(pom.getInstanceoflp().getUsername(), particulardata(path, "LoginPage", 1,1));
	    valuesonelement(pom.getInstanceoflp().getPassword(), particulardata(path, "LoginPage", 1,2));
	    buttonclick(pom.getInstanceoflp().getLogin());
	//emg contact personsl detail
	    buttonclick(pom.getInstanceofpd().getMyinfo());
	    
	     buttonclick(pom.getInstanceofpd().getFirstname());
	      WebDriverWait wa1 = new WebDriverWait(driver, 10);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
		 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(pom.getInstanceofpd().getFirstname(), particulardata(path, "PersonalDetails", 1, 1));

	    buttonclick(pom.getInstanceofpd().getMiddlename());
		Robot(KeyEvent.VK_CONTROL, "keypress");
		Robot(KeyEvent.VK_A, "keypress");
		Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
		Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getMiddlename(), particulardata(path, "PersonalDetails", 1, 2));
	 
	    buttonclick(pom.getInstanceofpd().getLastname());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
		Robot(KeyEvent.VK_A, "keypress");
		Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
		Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getLastname(), particulardata(path, "PersonalDetails", 1, 3));
	    
	    buttonclick(pom.getInstanceofpd().getNickname());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
		Robot(KeyEvent.VK_A, "keypress");
		Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
		Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getNickname(),particulardata(path, "PersonalDetails", 1, 4));
	    
	    buttonclick(pom.getInstanceofpd().getEmpid());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
	    Robot(KeyEvent.VK_A, "keypress");
	    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
	    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getEmpid(), particulardata(path,"PersonalDetails", 1, 5));
	   
	    buttonclick(pom.getInstanceofpd().getOtherid());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
	    Robot(KeyEvent.VK_A, "keypress");
	    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
	    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getOtherid(), particulardata(path,"PersonalDetails", 1, 6));
	   
	    buttonclick(pom.getInstanceofpd().getLicenseno());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
	    Robot(KeyEvent.VK_A, "keypress");
	    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
	    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getLicenseno(), particulardata(path,"PersonalDetails", 1, 7));
	    
	    buttonclick(pom.getInstanceofpd().getExpdate());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
	    Robot(KeyEvent.VK_A, "keypress");
		Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
		Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getExpdate(),particulardata(path,"PersonalDetails", 1, 8));
	    
	    buttonclick(pom.getInstanceofpd().getSsn());
	    clearonelement(pom.getInstanceofpd().getSsn());
	    valuesonelement(pom.getInstanceofpd().getSsn(), particulardata(path, "PersonalDetails", 1, 9));
	    
	    buttonclick(pom.getInstanceofpd().getSin());
	    clearonelement(pom.getInstanceofpd().getSin());
	    valuesonelement(pom.getInstanceofpd().getSin(), particulardata(path,"PersonalDetails", 1, 10));
	    
	    clickonelement(pom.getInstanceofpd().getNationality());
	    WebDriverWait wa2 = new WebDriverWait(driver,20);
	    clickonelement(pom.getInstanceofpd().getAlgerian());
	    
	    clickonelement(pom.getInstanceofpd().getStatus());
	    WebDriverWait wa3= new WebDriverWait(driver,10);
	    clickonelement(pom.getInstanceofpd().getStatus2());
	    
	    clickonelement(pom.getInstanceofpd().getDob());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
	    Robot(KeyEvent.VK_A, "keypress");
	    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
	    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getDob(), particulardata(path, "PersonalDetails", 1, 13));
	    
	    clickonelement(pom.getInstanceofpd().getGender());
	    
	    clickonelement(pom.getInstanceofpd().getMilitary());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
	    Robot(KeyEvent.VK_A, "keypress");
	    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
	    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	    valuesonelement(pom.getInstanceofpd().getMilitary(), particulardata(path, "PersonalDetails", 1, 15));
	    
	    buttonclick(pom.getInstanceofpd().getSmoker());
	    
	    buttonclick(pom.getInstanceofpd().getSave());
	    
	    clickonelement(pom.getInstanceofpd().getBloodtype());
	    clickonelement(pom.getInstanceofpd().getPositive());
	    
	    buttonclick(pom.getInstanceofpd().getSave2());
	  //contactdetails
	    implicitywaits(10);
	    buttonclick(pom.getInstanceofcd().getContactdetails());
	    buttonclick(pom.getInstanceofcd().getStreet1());
	    valuesonelement(pom.getInstanceofcd().getStreet1(), particulardata(path, "ContactDetails", 1, 1));
	    buttonclick(pom.getInstanceofcd().getStreet2());
	    valuesonelement(pom.getInstanceofcd().getStreet2(), particulardata(path,"ContactDetails", 1, 2));
	    buttonclick(pom.getInstanceofcd().getCity());
	    valuesonelement(pom.getInstanceofcd().getCity(), particulardata(path,"ContactDetails", 1, 3));
	    buttonclick(pom.getInstanceofcd().getState());
	    valuesonelement(pom.getInstanceofcd().getState(), particulardata(path,"ContactDetails", 1, 4));
	    buttonclick(pom.getInstanceofcd().getZipcode());
	    valuesonelement(pom.getInstanceofcd().getZipcode(), particulardata(path, "ContactDetails", 1, 5));
	    buttonclick(pom.getInstanceofcd().getCountry());
	    buttonclick(pom.getInstanceofcd().getIndia());
	    buttonclick(pom.getInstanceofcd().getHome());
	    valuesonelement(pom.getInstanceofcd().getHome(), particulardata(path,"ContactDetails", 1, 7));
	    buttonclick(pom.getInstanceofcd().getMobile());
	    valuesonelement(pom.getInstanceofcd().getMobile(), particulardata(path,"ContactDetails", 1, 8));
	    buttonclick(pom.getInstanceofcd().getWork());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
		 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
		 valuesonelement(pom.getInstanceofcd().getWork(), particulardata(path, "ContactDetails", 1, 9));
	    buttonclick(pom.getInstanceofcd().getWorkmail());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
		 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
		 valuesonelement(pom.getInstanceofcd().getWorkmail(), particulardata(path,"ContactDetails", 1, 10));
	    buttonclick(pom.getInstanceofcd().getMail());
	    Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	    Robot(KeyEvent.VK_CONTROL,"keyrelease");
	    Robot(KeyEvent.VK_A,"keyRelease");
		 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
		 valuesonelement(pom.getInstanceofcd().getMail(),particulardata(path, "ContactDetails", 1, 11));
	    buttonclick(pom.getInstanceofcd().getSave3());
	//Emergencycontact
	implicitywaits(10);
	    clickonelement(pom.getInstanceofec().getEmgcontact());
	    clickonelement(pom.getInstanceofec().getAdd());
	    clickonelement(pom.getInstanceofec().getName());
	    valuesonelement(pom.getInstanceofec().getName(),particulardata(path, "EmergencyContact", 1, 1));
	    clickonelement(pom.getInstanceofec().getRelationship());
	    valuesonelement(pom.getInstanceofec().getRelationship(), particulardata(path, "EmergencyContact", 1, 2));
	    clickonelement(pom.getInstanceofec().getEmgphone());
	    valuesonelement(pom.getInstanceofec().getEmgphone(), particulardata(path, "EmergencyContact", 1, 3));
	    clickonelement(pom.getInstanceofec().getEmgmob());
	    valuesonelement(pom.getInstanceofec().getEmgmob(), particulardata(path, "EmergencyContact", 1, 4));
	    clickonelement(pom.getInstanceofec().getEmgwork());
	    valuesonelement(pom.getInstanceofec().getEmgwork(), particulardata(path, "EmergencyContact", 1,5));
	    clickonelement(pom.getInstanceofec().getSave4());

	    
	    
	    
	}
	
	
	
	
}
