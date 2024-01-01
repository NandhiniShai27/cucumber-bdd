package Junit_cucumberpreference;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Cucumner_Annotationpratice {

@Before
public  void username() {
System.out.println("user name entered succesfully");
}
@BeforeClass
public static void urlLaunch() {
System.out.println("Url launched succesfully");
}

@Test
public void password() {
System.out.println("password entered successfully");
}
@After
public void login() {
System.out.println("Login button clicked succesfully");
}
@AfterClass
public static void logout() {
	System.out.println("Logout Successfully");

}

}
