package com.orangehrmstepdefinition;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.PageObjectManager.PageObjectManager_OrangeHRM;

import com.baseclasspractice.BaseClass_Practice;
import com.helperorangehrm.DataReaderManager_OrangeHRM;
import com.helperorangehrm.DataReader_OrangeHRM;
import com.orangehrm.testrunner.OrangehrmTest_runner;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orangehrm_Step_Definition extends BaseClass_Practice {
   
	 static WebDriver driver =OrangehrmTest_runner.driver;

     static PageObjectManager_OrangeHRM pom = new PageObjectManager_OrangeHRM(driver);
	
     static  String  expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
     
     static String path ="C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\Excel\\Book1.xlsx";
     
     
    @Given("^User launch the url$")
    public void user_launch_the_url() throws Throwable {
    	 url(DataReaderManager_OrangeHRM.getinstanceDRM().getinstanceDR().getpropertyurl());    
     }

    @When("^User enter the username in username field$")
    public void user_enter_the_username_in_username_field() throws Throwable {
    	implicitywaits(10);
    	 valuesonelement(pom.getInstanceoflp().getUsername(),DataReaderManager_OrangeHRM.getinstanceDRM().getinstanceDR().getpropertyusername());
    }

    @When("^User enter the password in password field$")
    public void user_enter_the_password_in_password_field() throws Throwable {
    	valuesonelement(pom.getInstanceoflp().getPassword(), DataReaderManager_OrangeHRM.getinstanceDRM().getinstanceDR().getpropertypassword());
    }

    @Then("^User click the login button and it navigate to Dashboard page$")
    public void user_click_the_login_button_and_it_navigate_to_Dashboard_page() throws Throwable {
    	 clickoncheckboxelement(pom.getInstanceoflp().getLogin());
    	 String currentUrl = driver.getCurrentUrl();
    	 assertEquals(expectedURL, currentUrl);  //we have to choose object
    }
    
    
    @When("^User click the MyInfo tab to enter the personal details$")
    public void user_click_the_MyInfo_tab_to_enter_the_personal_details() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getMyinfo());
    }

    @When("^User enter the Firstname in firstname field$")
    public void user_enter_the_Firstname_in_firstname_field() throws Throwable {
    	WebDriverWait wa1 = new WebDriverWait(driver, 10);
    	wa1.until(ExpectedConditions.elementToBeClickable(pom.getInstanceofpd().getFirstname()));
        buttonclick(pom.getInstanceofpd().getFirstname());
		clearonelementbyrobot(pom.getInstanceofpd().getFirstname());
   	    valuesonelement(pom.getInstanceofpd().getFirstname(),particulardata(path, "PersonalDetails", 1, 1));
	}

    @When("^User enter the middlename in middlename field$")
    public void user_enter_the_middlename_in_middlename_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getMiddlename());
	    clearonelementbyrobot(pom.getInstanceofpd().getMiddlename());
		valuesonelement(pom.getInstanceofpd().getMiddlename(), particulardata(path, "PersonalDetails", 1, 2));
    }

    @When("^User enter the lastname in lastname field$")
    public void user_enter_the_lastname_in_lastname_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getLastname());
	    clearonelementbyrobot(pom.getInstanceofpd().getLastname());
	    valuesonelement(pom.getInstanceofpd().getLastname(), particulardata(path, "PersonalDetails", 1, 3));	

    }

    @When("^User enter the nickname in nickname field$")
    public void user_enter_the_nickname_in_nickname_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getNickname());
        clearonelementbyrobot(pom.getInstanceofpd().getNickname());
	    valuesonelement(pom.getInstanceofpd().getNickname(), particulardata(path, "PersonalDetails", 1, 4));
    }

    @When("^User enter the id in employeeid field$")
    public void user_enter_the_id_in_employeeid_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getEmpid());
		clearonelementbyrobot(pom.getInstanceofpd().getEmpid());
		valuesonelement(pom.getInstanceofpd().getEmpid(), particulardata(path, "PersonalDetails", 1, 5));
    }

    @When("^User enter the other id in other id field$")
    public void user_enter_the_other_id_in_other_id_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getOtherid());
		clearonelementbyrobot(pom.getInstanceofpd().getOtherid());
	    valuesonelement(pom.getInstanceofpd().getOtherid(), particulardata(path, "PersonalDetails", 1, 6));
    }

    @When("^User enter the license no in Driver's License no field$")
    public void user_enter_the_license_no_in_Driver_s_License_no_field() throws Throwable {
    	 buttonclick(pom.getInstanceofpd().getLicenseno());
		 clearonelementbyrobot(pom.getInstanceofpd().getLicenseno());
		 valuesonelement(pom.getInstanceofpd().getLicenseno(), particulardata(path, "PersonalDetails", 1, 7));

    }

    @When("^User select the expiry date of license expiry date$")
    public void user_select_the_expiry_date_of_license_expiry_date() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getExpdate());
		clearonelementbyrobot(pom.getInstanceofpd().getExpdate());
	    valuesonelement(pom.getInstanceofpd().getExpdate(),particulardata(path, "PersonalDetails", 1, 8));
    }

    @When("^User enter the SSN no in SSN Number field$")
    public void user_enter_the_SSN_no_in_SSN_Number_field() throws Throwable {
    	   buttonclick(pom.getInstanceofpd().getSsn());
   	    clearonelementbyrobot(pom.getInstanceofpd().getSsn());
   	    valuesonelement(pom.getInstanceofpd().getSsn(), particulardata(path, "PersonalDetails", 1, 9));

    }

    @When("^User enter the SIN no in SIN number field$")
    public void user_enter_the_SIN_no_in_SIN_number_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getSin());
	    clearonelementbyrobot(pom.getInstanceofpd().getSin());
	    valuesonelement(pom.getInstanceofpd().getSin(), particulardata(path, "PersonalDetails", 1,10));

    }

    @When("^User select the nationality in nationality dropdown$")
    public void user_select_the_nationality_in_nationality_dropdown() throws Throwable {
    	clickonelement(pom.getInstanceofpd().getNationality());
	    WebDriverWait wa2 = new WebDriverWait(driver,20);
	    clickonelement(pom.getInstanceofpd().getAlgerian());

    }

    @When("^User select the status in Marital Status field$")
    public void user_select_the_status_in_Marital_Status_field() throws Throwable {
    	clickonelement(pom.getInstanceofpd().getStatus());
	    WebDriverWait wa3= new WebDriverWait(driver,10);
	    clickonelement(pom.getInstanceofpd().getStatus2());
    }

    @When("^User select the DOB in Date of Birth field$")
    public void user_select_the_DOB_in_Date_of_Birth_field() throws Throwable {
    	clickonelement(pom.getInstanceofpd().getDob());
		clearonelementbyrobot(pom.getInstanceofpd().getDob());
		valuesonelement(pom.getInstanceofpd().getDob(), particulardata(path, "PersonalDetails", 1, 13));
    }

    @When("^User click the gender in gender checkbox$")
    public void user_click_the_gender_in_gender_checkbox() throws Throwable {
    	clickonelement(pom.getInstanceofpd().getGender());
    }

    @When("^User enter the Service in Military service field$")
    public void user_enter_the_Service_in_Military_service_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getMilitary());
		 clearonelementbyrobot(pom.getInstanceofpd().getMilitary());
	    valuesonelement(pom.getInstanceofpd().getMilitary(), particulardata(path, "PersonalDetails", 1, 15));

    }

    @When("^User click the radiobutton in smoker field$")
    public void user_click_the_radiobutton_in_smoker_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getSmoker());
    }

    @When("^User click the save button\\.$")
    public void user_click_the_save_button() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getSave());
    }

    @When("^User select the bloodgroup in BloodType field$")
    public void user_select_the_bloodgroup_in_BloodType_field() throws Throwable {
    	clickonelement(pom.getInstanceofpd().getBloodtype());
	    clickonelement(pom.getInstanceofpd().getPositive());
	
    }

    @Then("^User click the save button and it show the Successfully Updated message$")
    public void user_click_the_save_button_and_it_show_the_Successfully_Updated_message() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getSave2());
    }
    @Before    
    public void beforeHooks(Scenario scenrio) {// scenario interface //one time use
		 String name = scenrio.getName();      //once we use this one time it will automatically goes to another scenario also
		 System.out.println(name  + "is started");
	}
    @After
    public void afterhooks(Scenario scenario) {
    	String name = scenario.getName();
		String status = scenario.getStatus();
		System.out.println(name +"is" +status );
	}

  //cd
    @When("^User click the contact detail tab and we have to fill the details$")
    public void user_click_the_contact_detail_tab_and_we_have_to_fill_the_details() throws Throwable {
    	WebDriverWait wa2= new WebDriverWait(driver, 20);
    	wa2.until(ExpectedConditions.elementToBeClickable(pom.getInstanceofcd().getContactdetails()));
    	buttonclick(pom.getInstanceofcd().getContactdetails());
		}

    @When("^User enter the halfstreet address in street(\\d+) field$")
    public void user_enter_the_halfstreet_address_in_street_field(int arg1) throws Throwable {
    	buttonclick(pom.getInstanceofcd().getStreet1());
	    valuesonelement(pom.getInstanceofcd().getStreet1(), particulardata(path, "ContactDetails", 1, 1));
     }

    @When("^User enter the street address in street(\\d+) field$")
    public void user_enter_the_street_address_in_street_field(int arg1) throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getStreet2());
		    valuesonelement(pom.getInstanceofcd().getStreet2(), particulardata(path, "ContactDetails", 1, 2));
	}

    @When("^User enter the city in city field$")
    public void user_enter_the_city_in_city_field() throws Throwable {
    	buttonclick(pom.getInstanceofcd().getCity());
	    valuesonelement(pom.getInstanceofcd().getCity(), particulardata(path, "ContactDetails", 1, 3));
    }

    @When("^User enter the state in State/Province field$")
    public void user_enter_the_state_in_State_Province_field() throws Throwable {
    	buttonclick(pom.getInstanceofcd().getState());
        valuesonelement(pom.getInstanceofcd().getState(), particulardata(path, "ContactDetails", 1, 4));

    }

    @When("^User enter the zipcode in Zip/Postal Code field$")
    public void user_enter_the_zipcode_in_Zip_Postal_Code_field() throws Throwable {
    	  buttonclick(pom.getInstanceofcd().getZipcode());
    	    valuesonelement(pom.getInstanceofcd().getZipcode(), particulardata(path, "ContactDetails", 1, 5));
    }

    @When("^User select the country in Country field$")
    public void user_select_the_country_in_Country_field() throws Throwable {
    	  buttonclick(pom.getInstanceofcd().getCountry());
    	    buttonclick(pom.getInstanceofcd().getIndia());
    	  
    }

    @When("^User enter the home phone no in Home field$")
    public void user_enter_the_home_phone_no_in_Home_field() throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getHome());
    	    valuesonelement(pom.getInstanceofcd().getHome(), particulardata(path, "ContactDetails", 1, 7));
    	   
    }

    @When("^User enter the mobile no in Mobile field$")
    public void user_enter_the_mobile_no_in_Mobile_field() throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getMobile());
    	    valuesonelement(pom.getInstanceofcd().getMobile(), particulardata(path, "ContactDetails", 1, 8));
    	    }

    @When("^User enter the work phoneno in Work field$")
    public void user_enter_the_work_phoneno_in_Work_field() throws Throwable {
    	  buttonclick(pom.getInstanceofcd().getWork());
    	  clearonelementbyrobot(pom.getInstanceofcd().getWork());
    	  valuesonelement(pom.getInstanceofcd().getWork(), particulardata(path, "ContactDetails", 1, 9));

    }

    @When("^User enter the work mail in WorkEmail field$")
    public void user_enter_the_work_mail_in_WorkEmail_field() throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getWorkmail());
    	 clearonelementbyrobot(pom.getInstanceofcd().getWorkmail());
         valuesonelement(pom.getInstanceofcd().getWorkmail(), particulardata(path, "ContactDetails", 1, 10));
    	    
    }

    @When("^User enter the extra mail in OtherEmail field$")
    public void user_enter_the_extra_mail_in_OtherEmail_field() throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getMail());
    	 clearonelementbyrobot(pom.getInstanceofcd().getMail());
         valuesonelement(pom.getInstanceofcd().getMail(), particulardata(path, "ContactDetails", 1, 11));
    }
    @Then("^User click the emergency details Save button and it show the Successfully Updated message$")
    public void user_click_the_emergency_details_Save_button_and_it_show_the_Successfully_Updated_message() throws Throwable {
    	buttonclick(pom.getInstanceofcd().getSave3());
    }
//ec
    @When("^User click the emergency detail tab and we have to fill the details$")
    public void user_click_the_emergency_detail_tab_and_we_have_to_fill_the_details() throws Throwable {
    	WebDriverWait wa1 = new WebDriverWait(driver, 10);
    	wa1.until(ExpectedConditions.elementToBeClickable(pom.getInstanceofec().getEmgcontact()));
        clickonelement(pom.getInstanceofec().getEmgcontact());
    }

    @When("^User click the add in Assigned Emergency Contacts field$")
    public void user_click_the_add_in_Assigned_Emergency_Contacts_field() throws Throwable {
    	clickonelement(pom.getInstanceofec().getAdd());
    }

    @When("^User enter the name in Name field$")
    public void user_enter_the_name_in_Name_field() throws Throwable {
    	 clickonelement(pom.getInstanceofec().getName());
    	    valuesonelement(pom.getInstanceofec().getName(),particulardata(path, "EmergencyContact", 1, 1));
    }

    @When("^User enter the relationship of the name in relationship field$")
    public void user_enter_the_relationship_of_the_name_in_relationship_field() throws Throwable {
    	clickonelement(pom.getInstanceofec().getRelationship());
        valuesonelement(pom.getInstanceofec().getRelationship(), particulardata(path, "EmergencyContact", 1, 2));
    }

    @When("^User enter the phone no in Home Telephone field$")
    public void user_enter_the_phone_no_in_Home_Telephone_field() throws Throwable {
    	clickonelement(pom.getInstanceofec().getEmgphone());
        valuesonelement(pom.getInstanceofec().getEmgphone(), particulardata(path, "EmergencyContact", 1, 3));
    }
    @When("^User enter the emergency details tab mobile no in Mobile field$")
    public void user_enter_the_emergency_details_tab_mobile_no_in_Mobile_field() throws Throwable {
    	 clickonelement(pom.getInstanceofec().getEmgmob());
    	    valuesonelement(pom.getInstanceofec().getEmgmob(), particulardata(path, "EmergencyContact", 1, 4));
    }

    @When("^User enter the work phoneno in Work Telephone field$")
    public void user_enter_the_work_phoneno_in_Work_Telephone_field() throws Throwable {
    	clickonelement(pom.getInstanceofec().getEmgwork());
        valuesonelement(pom.getInstanceofec().getEmgwork(), particulardata(path, "EmergencyContact", 1, 5));
    }

    @Then("^User click the Save button and it show the Successfully Updated message$")
    public void user_click_the_Save_button_and_it_show_the_Successfully_Updated_message() throws Throwable {
    	clickonelement(pom.getInstanceofec().getSave4());
    }

   

}
