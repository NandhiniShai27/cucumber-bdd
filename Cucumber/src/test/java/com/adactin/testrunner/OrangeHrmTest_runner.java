package com.adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclasspractice.BaseClass_Practice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/adactinfeaturefile/orangehrm.feature",
           glue ="src/test/java/com/adactin/StepDefinition/OrangehrmStep_Definition")
public class OrangeHrmTest_runner extends BaseClass_Practice {

	public static WebDriver driver;
	@BeforeClass
	public static void browser_setup() {
    browserlaunch("Chrome");
	}
	
	@AfterClass
	public static void browser_quit() {
	quitbrowser();
	}
	
}
