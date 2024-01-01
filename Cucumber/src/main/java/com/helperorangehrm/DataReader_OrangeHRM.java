package com.helperorangehrm;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader_OrangeHRM {
	
	public static Properties p;
 public DataReader_OrangeHRM() throws IOException{
  File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\src\\main\\java\\com\\propertyfile\\orangehrm.properties");
  FileInputStream fis = new FileInputStream(f);
  p = new Properties();
  p.load(fis);
 }
 
 public String getpropertybrowser() {
	String browser = p.getProperty("browser");
    return browser;
   }
  
 public String getpropertyurl() {
	String url = p.getProperty("url");
    return url; 
 }
  
 public String  getpropertyusername() {
	String username = p.getProperty("username"); 
	return username;

} 
 public String getpropertypassword() {
    String password = p.getProperty("password");
    return password;
}
  
  
  
  
  
  
 }

	
	

