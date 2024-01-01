package com.orangehrm.testrunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclasspractice.BaseClass_Practice;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\orangehrmfeaturefile\\orangehrm.feature",
           glue ="com.orangehrmstepdefinition")
public class OrangehrmTest_runner extends BaseClass_Practice {

    public static WebDriver driver;
	
	@BeforeClass
	public static void browser_setup() {
    driver =browserlaunch("Chrome");
	}
	
	@AfterClass
	public static void browser_quit() {
	quitbrowser();
    }
	
}
