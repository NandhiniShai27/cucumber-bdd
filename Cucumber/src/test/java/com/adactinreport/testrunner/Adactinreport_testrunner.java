package com.adactinreport.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclasspractice.BaseClass_Practice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= "src//test//java//com//adactinforreportfeaturefile",
		glue="com.adactinforreportstepdefinition",
plugin={"html:HtmlReport/Adactin_login",
		"pretty", 
		"json:JsonReport/Adactindemo.json",
		"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/Adactin_login.html"})

public class Adactinreport_testrunner extends BaseClass_Practice {
	 
		public static WebDriver driver;
		
		@BeforeClass 	
		public static void browser_open() {
			driver = browserlaunch("chrome");
		}
		@AfterClass
	    public static void browser_close() {
		 quitbrowser();
	    }	 
}
