package com.adactin.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.Page_Object_Manger;

import com.adactin.testrunner.Test_Runnerpractice;

import com.baseclasspractice.BaseClass_Practice;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class StepDefinition_Scenariooutline extends BaseClass_Practice {
	
	public static WebDriver driver = Test_Runnerpractice.driver;

	public static Page_Object_Manger pom = new Page_Object_Manger(driver);
	
	@Given("^launch the url$")
	public void launch_the_url() throws Throwable {
    url("http://adactinhotelapp.com/");
	}

	@When("^User enter the \"([^\"]*)\" in user field$")
	public void user_enter_the_in_user_field(String un) throws Throwable {
	valuesonelement(pom.getInstanceLP().getUser(), un);
	}

	@When("^User enter the \"([^\"]*)\" in password field$")
	public void user_enter_the_in_password_field(String pw) throws Throwable {
	valuesonelement(pom.getInstanceLP().getPass(), pw);
	}

	@Then("^User click the login button and it navigate to search page$")
	public void user_click_the_login_button_and_it_navigate_to_search_page() throws Throwable {
	buttonclick(pom.getInstanceLP().getLogin());    
	}


	}
