package com.adactinforreportstepdefinition;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.Page_Object_Manger;
import com.adactinreport.testrunner.Adactinreport_testrunner;
import com.baseclasspractice.BaseClass_Practice;
import com.helperpractice.DataReaderManger_Adactin;
import com.helperpractice.DataReader_adactininfoproperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactinreport_StepDefinition extends BaseClass_Practice {
	
	public static WebDriver driver = Adactinreport_testrunner.driver;
	
	public static Page_Object_Manger pom = new Page_Object_Manger(driver);
	
	@Given("^launch the url$")
	public void launch_the_url() throws Throwable {
	   String propertiesurl = DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propertiesurl();
	   url(propertiesurl);
	}

	@When("^User enter the username in user field$")
	public void user_enter_the_username_in_user_field() throws Throwable {
	   valuesonelement(pom.getInstanceLP().getUser(), DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propertiesusername());
	}

	@When("^User enter the password in password field$")
	public void user_enter_the_password_in_password_field() throws Throwable {
	    String password = DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propertiespassword();
	    valuesonelement(pom.getInstanceLP().getPass(), password);
	}

	@Then("^User click the login button and it navigate to search page$")
	public void user_click_the_login_button_and_it_navigate_to_search_page() throws Throwable {
	   buttonclick(pom.getInstanceLP().getLogin());
	 }
	
	@When("^User select the location in location field$")
	public void user_select_the_location_in_location_field() throws Throwable {
        selectbydropdown(pom.getInstanceSP().getLocation(), "index", DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().proplocation());
	}

	@When("^User select the Hotels in hotel field$")
	public void user_select_the_Hotels_in_hotel_field() throws Throwable {
        selectbydropdown(pom.getInstanceSP().getHotels(),"index",DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().prophotels());
	}
	
	@When("^User select the required room type in room type field$")
	public void user_select_the_required_room_type_in_room_type_field() throws Throwable {
        selectbydropdown(pom.getInstanceSP().getRoomtype(), "index", DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().proproomtype());
	}


	@When("^User select the number of rooms in number of rooms field$")
	public void user_select_the_number_of_rooms_in_number_of_rooms_field() throws Throwable {
	    
	    selectbydropdown(pom.getInstanceSP().getRoom(), "index", DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().proproom());
	}

	@When("^User enter the Checkin date in checkin date field$")
	public void user_enter_the_Checkin_date_in_checkin_date_field() throws Throwable {
	 clearonelement(pom.getInstanceSP().getCheck());
	 valuesonelement(pom.getInstanceSP().getCheck(),DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propcheck());
	}

	@When("^User enter the checkout date in checkout date field$")
	public void user_enter_the_checkout_date_in_checkout_date_field() throws Throwable {
        clearonelement(pom.getInstanceSP().getCheckout()); 
	    valuesonelement(pom.getInstanceSP().getCheckout(), DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propcheckout());
	}

	@When("^User select the number of adult room in adult per room field$")
	public void user_select_the_number_of_adult_room_in_adult_per_room_field() throws Throwable {
	     selectbydropdown(pom.getInstanceSP().getAdult(), "index", DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propadult());
        }

	@When("^User select the number of children per room in children per room field$")
	public void user_select_the_number_of_children_per_room_in_children_per_room_field() throws Throwable {
	      
	     selectbydropdown(pom.getInstanceSP().getChildren(), "index", DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propchildren());
	 }

	@Then("^User click the search button and it navigate to select hotel page$")
	public void user_click_the_search_button_and_it_navigate_to_select_hotel_page() throws Throwable {
	
	   buttonclick(pom.getInstanceSP().getSearch());
	}

		@When("^User click the radiobutton in select field$")
		public void user_click_the_radiobutton_in_select_field() throws Throwable {
		   buttonclick(pom.getInstanceCP().getRadio());
		}

		@Then("^User click the continue button and it navigate to Book A Hotel Page$")
		public void user_click_the_continue_button_and_it_navigate_to_Book_A_Hotel_Page() throws Throwable {
		    buttonclick(pom.getInstanceCP().getCont());
		}
		@When("^User enter the firstname in firstname field$")
		public void user_enter_the_firstname_in_firstname_field() throws Throwable {
		   valuesonelement(pom.getInstanceBP().getFirstname(), DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propfirstname());
		}

		@When("^User enter the lastname in lastname field$")
		public void user_enter_the_lastname_in_lastname_field() throws Throwable {
		   valuesonelement(pom.getInstanceBP().getLastname(), DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().proplastname());
		}

		@When("^User enter the Address in Billing Address field\\.$")
		public void user_enter_the_Address_in_Billing_Address_field() throws Throwable {
		    valuesonelement(pom.getInstanceBP().getAddress(), DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propaddress());
		}

		@When("^User enter the credit card no in credit card no field$")
		public void user_enter_the_credit_card_no_in_credit_card_no_field() throws Throwable {
		    valuesonelement(pom.getInstanceBP().getCard(), DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().porpcardno());
		}

		@When("^User select the card type in Credit Card Type filed$")
		public void user_select_the_card_type_in_Credit_Card_Type_filed() throws Throwable {
            selectbydropdown(pom.getInstanceBP().getCc(),"index", DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propcardtype());
		}

		@When("^User select the month in Expiry Date Month field$")
		public void user_select_the_month_in_Expiry_Date_Month_field() throws Throwable {
		   selectbydropdown(pom.getInstanceBP().getExp(),"index", DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propexpmonth());    		
		}

		@When("^User select the year in Expiry Date Year Field$")
		public void user_select_the_year_in_Expiry_Date_Year_Field() throws Throwable {
		   selectbydropdown(pom.getInstanceBP().getYear(), "index",DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propexpyear());
		}

		@When("^User enter the CVV no in  CVV Field$")
		public void user_enter_the_CVV_no_in_CVV_Field() throws Throwable {
			valuesonelement(pom.getInstanceBP().getCvv(), DataReaderManger_Adactin.InstanceofDRM().InstanceofDR().propcvv());
		}

		@Then("^User click the Booknow button and it navigate to booking confirmation page$")
		public void user_click_the_Booknow_button_and_it_navigate_to_booking_confirmation_page() throws Throwable {
		   buttonclick(pom.getInstanceBP().getBook());		
		   }
		@Then("^User click the My Itinerary button and it navigate to  Booked Itinerary page$")
		public void user_click_the_My_Itinerary_button_and_it_navigate_to_Booked_Itinerary_page() throws Throwable {
		    implicitywaits(10);
		    buttonclick(pom.getInstanceMP().getNow());
		}

		@When("^User click the checkbox in checkbox field$")
		public void user_click_the_checkbox_in_checkbox_field() throws Throwable {
		      buttonclick(pom.getInstanceLGP().getCheckall());
		}

		@When("^User click the Cancel Selected button it switch to alert$")
		public void user_click_the_Cancel_Selected_button_it_switch_to_alert() throws Throwable {
		    buttonclick(pom.getInstanceLGP().getCancelall());
		}

		@When("^User click the OK button to close the alert$")
		public void user_click_the_OK_button_to_close_the_alert() throws Throwable {
		    simplealert(pom.getInstanceLGP().getCancelall());
		}

		@Then("^User click the logout button and it navigate to Homepage of addactin hotelapp$")
		public void user_click_the_logout_button_and_it_navigate_to_Homepage_of_addactin_hotelapp() throws Throwable {
		    buttonclick(pom.getInstanceLGP().getLogout());
		}



		



}