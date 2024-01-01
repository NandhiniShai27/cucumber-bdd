package com.adactin.StepDefinition;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.PageObjectManager.PageObjectManager_OrangeHRM;
import com.adactin.testrunner.OrangeHrmTest_runner;
import com.baseclasspractice.BaseClass_Practice;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class OrangehrmStep_Definition extends BaseClass_Practice {
   
	public static WebDriver driver =OrangeHrmTest_runner.driver;

    public static PageObjectManager_OrangeHRM pom = new PageObjectManager_OrangeHRM(driver);
	
    @Given("^User launch the url$")
    public void user_launch_the_url() throws Throwable {
    	 url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");    
     }

    @When("^User enter the username in username field$")
    public void user_enter_the_username_in_username_field() throws Throwable {
    	 valuesonelement(pom.getInstanceoflp().getUsername(), "Admin");
    }

    @When("^User enter the password in password field$")
    public void user_enter_the_password_in_password_field() throws Throwable {
    	valuesonelement(pom.getInstanceoflp().getPassword(), "admin123");
    }

    @Then("^User click the login button and it navigate to Dashboard page$")
    public void user_click_the_login_button_and_it_navigate_to_Dashboard_page() throws Throwable {
    	 clickoncheckboxelement(pom.getInstanceoflp().getLogin());
    }

    @When("^User enter the Firstname in firstname field$")
    public void user_enter_the_Firstname_in_firstname_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getFirstname());
		clearonelementbyrobot(pom.getInstanceofpd().getFirstname());
   	    valuesonelement(pom.getInstanceofpd().getFirstname(), "Krish");
	
    }

    @When("^User enter the middlename in middlename field$")
    public void user_enter_the_middlename_in_middlename_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getMiddlename());
	    clearonelementbyrobot(pom.getInstanceofpd().getMiddlename());
		valuesonelement(pom.getInstanceofpd().getMiddlename(), "shai");
    }

    @When("^User enter the lastname in lastname field$")
    public void user_enter_the_lastname_in_lastname_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getLastname());
	    clearonelementbyrobot(pom.getInstanceofpd().getLastname());
	    valuesonelement(pom.getInstanceofpd().getLastname(), "M");	

    }

    @When("^User enter the nickname in nickname field$")
    public void user_enter_the_nickname_in_nickname_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getNickname());
        clearonelementbyrobot(pom.getInstanceofpd().getNickname());
	    valuesonelement(pom.getInstanceofpd().getNickname(), "Hari");
    }

    @When("^User enter the id in employeeid field$")
    public void user_enter_the_id_in_employeeid_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getEmpid());
		clearonelementbyrobot(pom.getInstanceofpd().getEmpid());
		valuesonelement(pom.getInstanceofpd().getEmpid(), "921500");
    }

    @When("^User enter the other id in other id field$")
    public void user_enter_the_other_id_in_other_id_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getOtherid());
		clearonelementbyrobot(pom.getInstanceofpd().getOtherid());
	    valuesonelement(pom.getInstanceofpd().getOtherid(), "2150");
    }

    @When("^User enter the license no in Driver's License no field$")
    public void user_enter_the_license_no_in_Driver_s_License_no_field() throws Throwable {
    	 buttonclick(pom.getInstanceofpd().getLicenseno());
		 clearonelementbyrobot(pom.getInstanceofpd().getLicenseno());
		 valuesonelement(pom.getInstanceofpd().getLicenseno(), "NAM0 92178367890");

    }

    @When("^User select the expiry date of license expiry date$")
    public void user_select_the_expiry_date_of_license_expiry_date() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getExpdate());
		clearonelementbyrobot(pom.getInstanceofpd().getExpdate());
	    valuesonelement(pom.getInstanceofpd().getExpdate(),"2031-12-12");
    }

    @When("^User enter the SSN no in SSN Number field$")
    public void user_enter_the_SSN_no_in_SSN_Number_field() throws Throwable {
    	   buttonclick(pom.getInstanceofpd().getSsn());
   	    clearonelementbyrobot(pom.getInstanceofpd().getSsn());
   	    valuesonelement(pom.getInstanceofpd().getSsn(), "34567898993");

    }

    @When("^User enter the SIN no in SIN number field$")
    public void user_enter_the_SIN_no_in_SIN_number_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getSin());
	    clearonelementbyrobot(pom.getInstanceofpd().getSin());
	    valuesonelement(pom.getInstanceofpd().getSin(), "45678998292");

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
		valuesonelement(pom.getInstanceofpd().getDob(), "1998-10-23");
    }

    @When("^User click the gender in gender checkbox$")
    public void user_click_the_gender_in_gender_checkbox() throws Throwable {
    	clickonelement(pom.getInstanceofpd().getGender());
    }

    @When("^User enter the Service in Military service field$")
    public void user_enter_the_Service_in_Military_service_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getMilitary());
		 clearonelementbyrobot(pom.getInstanceofpd().getMilitary());
	    valuesonelement(pom.getInstanceofpd().getMilitary(), "No");

    }

    @When("^User click the radiobutton in smoker field$")
    public void user_click_the_radiobutton_in_smoker_field() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getSmoker());
    }

    @When("^User click the save button\\.$")
    public void user_click_the_save_button() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getSave());
    }

    @When("^User select the bloodgrSoup in BloodType field$")
    public void user_select_the_bloodgroup_in_BloodType_field() throws Throwable {
    	clickonelement(pom.getInstanceofpd().getBloodtype());
	    clickonelement(pom.getInstanceofpd().getPositive());
	
    }

    @Then("^User click the save button and it show the Successfully Updated message$")
    public void user_click_the_save_button_and_it_show_the_Successfully_Updated_message() throws Throwable {
    	buttonclick(pom.getInstanceofpd().getSave2());
    }

    @When("^User click the contact detail tab and we have to fill the details$")
    public void user_click_the_contact_detail_tab_and_we_have_to_fill_the_details() throws Throwable {
    	implicitywaits(10);
    	 buttonclick(pom.getInstanceofcd().getContactdetails());
		}

    @When("^User enter the halfstreet address in street(\\d+) field$")
    public void user_enter_the_halfstreet_address_in_street_field(int arg1) throws Throwable {
    	buttonclick(pom.getInstanceofcd().getStreet1());
	    valuesonelement(pom.getInstanceofcd().getStreet1(), "No.10, Ambedkar Street");
     }

    @When("^User enter the street address in street(\\d+) field$")
    public void user_enter_the_street_address_in_street_field(int arg1) throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getStreet2());
		    valuesonelement(pom.getInstanceofcd().getStreet2(), "GandhiNagar, Velachery");
	}

    @When("^User enter the city in city field$")
    public void user_enter_the_city_in_city_field() throws Throwable {
    	buttonclick(pom.getInstanceofcd().getCity());
	    valuesonelement(pom.getInstanceofcd().getCity(), "Chennai");
    }

    @When("^User enter the state in State/Province field$")
    public void user_enter_the_state_in_State_Province_field() throws Throwable {
    	buttonclick(pom.getInstanceofcd().getState());
        valuesonelement(pom.getInstanceofcd().getState(), "TamilNadu");

    }

    @When("^User enter the zipcode in Zip/Postal Code field$")
    public void user_enter_the_zipcode_in_Zip_Postal_Code_field() throws Throwable {
    	  buttonclick(pom.getInstanceofcd().getZipcode());
    	    valuesonelement(pom.getInstanceofcd().getZipcode(), "6000098");
    }

    @When("^User select the country in Country field$")
    public void user_select_the_country_in_Country_field() throws Throwable {
    	  buttonclick(pom.getInstanceofcd().getCountry());
    	    buttonclick(pom.getInstanceofcd().getIndia());
    	  
    }

    @When("^User enter the home phone no in Home field$")
    public void user_enter_the_home_phone_no_in_Home_field() throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getHome());
    	    valuesonelement(pom.getInstanceofcd().getHome(), "9568456589");
    	   
    }

    @When("^User enter the mobile no in Mobile field$")
    public void user_enter_the_mobile_no_in_Mobile_field() throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getMobile());
    	    valuesonelement(pom.getInstanceofcd().getMobile(), "9845356879");
    	    }

    @When("^User enter the work phoneno in Work field$")
    public void user_enter_the_work_phoneno_in_Work_field() throws Throwable {
    	  buttonclick(pom.getInstanceofcd().getWork());
    	  clearonelementbyrobot(pom.getInstanceofcd().getWork());
    	  valuesonelement(pom.getInstanceofcd().getWork(), "0445678238");

    }

    @When("^User enter the work mail in WorkEmail field$")
    public void user_enter_the_work_mail_in_WorkEmail_field() throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getWorkmail());
    	 clearonelementbyrobot(pom.getInstanceofcd().getWorkmail());
         valuesonelement(pom.getInstanceofcd().getWorkmail(), "najhdinaid@gmail.com");
    	    
    }

    @When("^User enter the extra mail in OtherEmail field$")
    public void user_enter_the_extra_mail_in_OtherEmail_field() throws Throwable {
    	 buttonclick(pom.getInstanceofcd().getMail());
    	 clearonelementbyrobot(pom.getInstanceofcd().getMail());
         valuesonelement(pom.getInstanceofcd().getMail(), "najuakauhanja@5689");
    }
    @When("^User click the emergency details Save button and it show the Successfully Updated message$")
    public void user_click_the_emergency_details_Save_button_and_it_show_the_Successfully_Updated_message() throws Throwable {
    	buttonclick(pom.getInstanceofcd().getSave3());
    }

    @When("^User click the emergency detail tab and we have to fill the details$")
    public void user_click_the_emergency_detail_tab_and_we_have_to_fill_the_details() throws Throwable {
    	implicitywaits(10);
        clickonelement(pom.getInstanceofec().getEmgcontact());
    }

    @When("^User click the add in Assigned Emergency Contacts field$")
    public void user_click_the_add_in_Assigned_Emergency_Contacts_field() throws Throwable {
    	clickonelement(pom.getInstanceofec().getAdd());
    }

    @When("^User enter the name in Name field$")
    public void user_enter_the_name_in_Name_field() throws Throwable {
    	 clickonelement(pom.getInstanceofec().getName());
    	    valuesonelement(pom.getInstanceofec().getName(),"Mahi");
    }

    @When("^User enter the relationship of the name in relationship field$")
    public void user_enter_the_relationship_of_the_name_in_relationship_field() throws Throwable {
    	clickonelement(pom.getInstanceofec().getRelationship());
        valuesonelement(pom.getInstanceofec().getRelationship(), "Father");
    }

    @When("^User enter the phone no in Home Telephone field$")
    public void user_enter_the_phone_no_in_Home_Telephone_field() throws Throwable {
    	clickonelement(pom.getInstanceofec().getEmgphone());
        valuesonelement(pom.getInstanceofec().getEmgphone(), "8928475958");
    }
    @When("^User enter the emergency details tab mobile no in Mobile field$")
    public void user_enter_the_emergency_details_tab_mobile_no_in_Mobile_field() throws Throwable {
    	 clickonelement(pom.getInstanceofec().getEmgmob());
    	    valuesonelement(pom.getInstanceofec().getEmgmob(), "9999955555");
    }

    @When("^User enter the work phoneno in Work Telephone field$")
    public void user_enter_the_work_phoneno_in_Work_Telephone_field() throws Throwable {
    	clickonelement(pom.getInstanceofec().getEmgwork());
        valuesonelement(pom.getInstanceofec().getEmgwork(), "04455598961");
    }

    @When("^User click the Save button and it show the Successfully Updated message$")
    public void user_click_the_Save_button_and_it_show_the_Successfully_Updated_message() throws Throwable {
    	clickonelement(pom.getInstanceofec().getSave4());
    }


}
