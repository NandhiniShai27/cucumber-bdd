package com.writeData_DD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Write_Data_DATADRIVEN {
	public static void main(String[] args)	throws FileNotFoundException, IOException {
		File f = new File(".\\Excel\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
        Workbook wb = new XSSFWorkbook(fis);
//Loginpage
        	wb.createSheet("LoginPage").createRow(0).createCell(0).setCellValue("S.N0");
        	wb.getSheet("LoginPage").getRow(0).createCell(1).setCellValue("username");
        	wb.getSheet("LoginPage").getRow(0).createCell(2).setCellValue("password");
        	wb.getSheet("LoginPage").createRow(1).createCell(0).setCellValue("1");
        	wb.getSheet("LoginPage").getRow(1).createCell(1).setCellValue("Admin");
        	wb.getSheet("LoginPage").getRow(1).createCell(2).setCellValue("admin123");
        	
 //personal details
         wb.createSheet("PersonalDetails").createRow(0).createCell(0).setCellValue("S.No");
         wb.getSheet("PersonalDetails").getRow(0).createCell(1).setCellValue("firstname");
        wb.getSheet("PersonalDetails").getRow(0).createCell(2).setCellValue("middlename");
        wb.getSheet("PersonalDetails").getRow(0).createCell(3).setCellValue("lastname");
        wb.getSheet("PersonalDetails").getRow(0).createCell(4).setCellValue("nickname");
        wb.getSheet("PersonalDetails").getRow(0).createCell(5).setCellValue("empid");
        wb.getSheet("PersonalDetails").getRow(0).createCell(6).setCellValue("otherid");
        wb.getSheet("PersonalDetails").getRow(0).createCell(7).setCellValue("licenseno");
        wb.getSheet("PersonalDetails").getRow(0).createCell(8).setCellValue("expdate");
        wb.getSheet("PersonalDetails").getRow(0).createCell(9).setCellValue("ssn");
        wb.getSheet("PersonalDetails").getRow(0).createCell(10).setCellValue("sin");
        wb.getSheet("PersonalDetails").getRow(0).createCell(11).setCellValue("Algeria");
        wb.getSheet("PersonalDetails").getRow(0).createCell(12).setCellValue("status2");
        wb.getSheet("PersonalDetails").getRow(0).createCell(13).setCellValue("dob");
        wb.getSheet("PersonalDetails").getRow(0).createCell(14).setCellValue("gender");
        wb.getSheet("PersonalDetails").getRow(0).createCell(15).setCellValue("military");
        wb.getSheet("PersonalDetails").getRow(0).createCell(16).setCellValue("smoker");
        wb.getSheet("PersonalDetails").getRow(0).createCell(17).setCellValue("save");
        wb.getSheet("PersonalDetails").getRow(0).createCell(18).setCellValue("Bloodtype");
        wb.getSheet("PersonalDetails").getRow(0).createCell(19).setCellValue("save");

        wb.getSheet("PersonalDetails").createRow(1).createCell(0).setCellValue("1");
        wb.getSheet("PersonalDetails").getRow(1).createCell(1).setCellValue("Shai");
        wb.getSheet("PersonalDetails").getRow(1).createCell(2).setCellValue("Krishna");
        wb.getSheet("PersonalDetails").getRow(1).createCell(3).setCellValue("M");
        wb.getSheet("PersonalDetails").getRow(1).createCell(4).setCellValue("Hari");
        wb.getSheet("PersonalDetails").getRow(1).createCell(5).setCellValue("921500");
        wb.getSheet("PersonalDetails").getRow(1).createCell(6).setCellValue("2150");
        wb.getSheet("PersonalDetails").getRow(1).createCell(7).setCellValue("NAM0 92178367890");
        wb.getSheet("PersonalDetails").getRow(1).createCell(8).setCellValue("2031-12-12");
        wb.getSheet("PersonalDetails").getRow(1).createCell(9).setCellValue("34567898993");
        wb.getSheet("PersonalDetails").getRow(1).createCell(10).setCellValue("45678998292");
        wb.getSheet("PersonalDetails").getRow(1).createCell(11).setCellValue("Algeria");
        wb.getSheet("PersonalDetails").getRow(1).createCell(12).setCellValue("Single");
        wb.getSheet("PersonalDetails").getRow(1).createCell(13).setCellValue("1998-10-23");
        wb.getSheet("PersonalDetails").getRow(1).createCell(14).setCellValue("Male");
        wb.getSheet("PersonalDetails").getRow(1).createCell(15).setCellValue("No");
        wb.getSheet("PersonalDetails").getRow(1).createCell(16).setCellValue("No");
        wb.getSheet("PersonalDetails").getRow(1).createCell(17).setCellValue("Click");
        wb.getSheet("PersonalDetails").getRow(1).createCell(18).setCellValue("A+");
        wb.getSheet("PersonalDetails").getRow(1).createCell(19).setCellValue("Click");
//contact details
        wb.createSheet("ContactDetails").createRow(0).createCell(0).setCellValue("S.No");
        wb.getSheet("ContactDetails").getRow(0).createCell(1).setCellValue("street1");
        wb.getSheet("ContactDetails").getRow(0).createCell(2).setCellValue("street2");
        wb.getSheet("ContactDetails").getRow(0).createCell(3).setCellValue("city");
        wb.getSheet("ContactDetails").getRow(0).createCell(4).setCellValue("state");
        wb.getSheet("ContactDetails").getRow(0).createCell(5).setCellValue("Zipcode");
        wb.getSheet("ContactDetails").getRow(0).createCell(6).setCellValue("countrie");
        wb.getSheet("ContactDetails").getRow(0).createCell(7).setCellValue("home");
        wb.getSheet("ContactDetails").getRow(0).createCell(8).setCellValue("mobile");
        wb.getSheet("ContactDetails").getRow(0).createCell(9).setCellValue("work");
        wb.getSheet("ContactDetails").getRow(0).createCell(10).setCellValue("workmail");
        wb.getSheet("ContactDetails").getRow(0).createCell(11).setCellValue("mail");
        wb.getSheet("ContactDetails").getRow(0).createCell(12).setCellValue("save3");
 
        wb.getSheet("ContactDetails").createRow(1).createCell(0).setCellValue("1");
        wb.getSheet("ContactDetails").getRow(1).createCell(1).setCellValue("No.10, Ambedkar Street");
        wb.getSheet("ContactDetails").getRow(1).createCell(2).setCellValue("GandhiNagar, Velachery");
        wb.getSheet("ContactDetails").getRow(1).createCell(3).setCellValue("Chennai");
        wb.getSheet("ContactDetails").getRow(1).createCell(4).setCellValue("TamilNadu");
        wb.getSheet("ContactDetails").getRow(1).createCell(5).setCellValue("6000098");
        wb.getSheet("ContactDetails").getRow(1).createCell(6).setCellValue("India");
        wb.getSheet("ContactDetails").getRow(1).createCell(7).setCellValue("9568456589");
        wb.getSheet("ContactDetails").getRow(1).createCell(8).setCellValue("9845356879");
        wb.getSheet("ContactDetails").getRow(1).createCell(9).setCellValue("0445678238");
        wb.getSheet("ContactDetails").getRow(1).createCell(10).setCellValue("najhdinaid2389@gmail.com");
        wb.getSheet("ContactDetails").getRow(1).createCell(11).setCellValue("najuakauhanja5689@gmail.com");
        wb.getSheet("ContactDetails").getRow(1).createCell(12).setCellValue("Click");
//EmergencyContact
        wb.createSheet("EmergencyContact").createRow(0).createCell(0).setCellValue("S.No");
        wb.getSheet("EmergencyContact").getRow(0).createCell(1).setCellValue("name");
        wb.getSheet("EmergencyContact").getRow(0).createCell(2).setCellValue("relationship");
        wb.getSheet("EmergencyContact").getRow(0).createCell(3).setCellValue("emgphone");
        wb.getSheet("EmergencyContact").getRow(0).createCell(4).setCellValue("emgmob");
        wb.getSheet("EmergencyContact").getRow(0).createCell(5).setCellValue("emgwork");
        wb.getSheet("EmergencyContact").getRow(0).createCell(6).setCellValue("save4");
        wb.getSheet("EmergencyContact").createRow(1).createCell(0).setCellValue("1");
        wb.getSheet("EmergencyContact").getRow(1).createCell(1).setCellValue("Mahi");
        wb.getSheet("EmergencyContact").getRow(1).createCell(2).setCellValue("Father");
        wb.getSheet("EmergencyContact").getRow(1).createCell(3).setCellValue("8928475958");
        wb.getSheet("EmergencyContact").getRow(1).createCell(4).setCellValue("9999955555");
        wb.getSheet("EmergencyContact").getRow(1).createCell(5).setCellValue("04455598961");
        wb.getSheet("EmergencyContact").getRow(1).createCell(6).setCellValue("Click");
        FileOutputStream  fos= new FileOutputStream(f);
	    wb.write(fos);
	    }
      }
