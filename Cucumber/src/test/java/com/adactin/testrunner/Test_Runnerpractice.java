package com.adactin.testrunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclasspractice.BaseClass_Practice;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//ADMIN//eclipse-workspace//Cucumber//src//test//java//com//adactinfeaturefile//scenariooutline.feature",
    glue="com.adactin.StepDefinition//StepDefinition_Scenariooutline")
public class Test_Runnerpractice extends BaseClass_Practice  {
public  static WebDriver driver; 
@BeforeClass
public static void set_up() {
 driver = browserlaunch("chrome");
}
@AfterClass
public static void tear_up() {
	quitbrowser();
}
}
