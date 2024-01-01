package com.helperpractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class DataReader_adactininfoproperties {
	//classname refname = new constructorname(parameter);	
	//properties is a local variable, it acces level is within the method only so we can call'it as class kula
		     Properties p;
		     
		public DataReader_adactininfoproperties() throws IOException {
			File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\src\\main\\java\\com\\propertyfile\\adactin_infor");
	        FileInputStream fis = new FileInputStream(f);
	        p = new Properties();
	        p.load(fis);

		}
		
		//same 4 lines procedure for properties convert to java, so we can create a new method for same scenarios 
		public String propertiesurl() throws IOException {
		
	        String url = p.getProperty("url");
		    return url;
		}
		
		public String propertiesusername() throws IOException {
			String username = p.getProperty("username");
		    return username;
		}
		public String propertiespassword() throws IOException {
			String password = p.getProperty("password");
	        return password;

	}
		public String propertieslogin () throws IOException{
			String login = p.getProperty("login");
	       return login;
		}
		
		public String proplocation () throws IOException  {
			String porploc = p.getProperty("location");
	        return porploc;
		}
		
		public String prophotels() throws IOException{
			String hotels = p.getProperty("hotels");
	        return hotels;
		}
		public String proproomtype() throws IOException{
			String roomtype = p.getProperty("roomtype");
	        return roomtype;
		}
		public String proproom() throws IOException{
			String room= p.getProperty("room");
	       return room;
		}
		
		public String propcheck() throws IOException{
	        String check = p.getProperty("check");		
	        return check;
		}
		public String propcheckout() throws IOException{
			String checkout = p.getProperty("checkout");
	        return checkout;
		}
		public String propadult() throws IOException{
			String adult = p.getProperty("adult");
	        return adult;
	  	}
		public String propchildren() throws IOException{
			String children = p.getProperty("children");
		    return children;
		}
		public String propsearch() throws IOException{
			String search = p.getProperty("search");
	        return search;
		}
		
		public String propradiobutton() {
			String radiobutton = p.getProperty("radiobutton");
	        return radiobutton;
		}
		
		public String propcontinue() {
			String continuebutton = p.getProperty("continuebutton");
	        return continuebutton;
		}
		
		public String propfirstname() {
		String firstname = p.getProperty("firstname");
	    return firstname;
		}
		public String proplastname() {
			String lastname = p.getProperty("lastname");
	        return lastname;
		}
		public String propaddress() {
			String address = p.getProperty("address");
	        return address;
		}
		public String porpcardno() {
			String creditcardno = p.getProperty("creditcardno");
	        return creditcardno;
		}
		public String propcardtype() {
			String creditcardtype = p.getProperty("creditcardtype");
	        return creditcardtype;
		}
		public String propexpmonth() {
			String month = p.getProperty("month");
	        return month;
		}
		public String propexpyear() {
		String year = p.getProperty("year");
	    return year;
		}
		public String propcvv() {
			String cvv = p.getProperty("cvv");
	        return cvv; 
		}
		public String propbooknow() {
			String booknow = p.getProperty("booknow");
	        return booknow;
		}
		
		public String propitinerary() {
			String Itinerary = p.getProperty("Itinerary");
	       return Itinerary;
		}
		public String propcheckbox() {
			String checkbox = p.getProperty("checkbox");
	        return checkbox;
		}
		public String propcancel() {
			String cancel = p.getProperty("cancel");
	        return cancel;
		}
		public String propokbutton() {
			String okbutton = p.getProperty("okbutton");
	        return okbutton;
		}
		public String proplogout() {
			String logout = p.getProperty("logout");
	        return logout;
		}
		
		
		
		
}
