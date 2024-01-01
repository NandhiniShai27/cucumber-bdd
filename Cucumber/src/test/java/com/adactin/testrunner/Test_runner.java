package com.adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclasspractice.BaseClass_Practice;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= "src//test//java//com//adactinfeaturefile//adactin//featurefile",
		glue="com.adactin.StepDefinition")

public class Test_runner extends BaseClass_Practice {
     
	public static WebDriver driver;
	@BeforeClass 	
	public static void set_up() {
		driver = browserlaunch("chrome");
	}
	@AfterClass
    public static void teardown() {
	 quitbrowser();
    }	 
	
	
	
}
