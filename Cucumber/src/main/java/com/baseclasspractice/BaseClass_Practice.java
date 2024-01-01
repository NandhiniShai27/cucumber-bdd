package com.baseclasspractice;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass_Practice {
	 static WebDriver driver;
		
		public static WebDriver browserlaunch(String browser) {
			
			if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
		   driver.manage().window().maximize();
		return driver;
	     	}
		
		public static void url(String url) {
			driver.get(url);
		}
		
		public static void valuesonelement(WebElement element, String value) {
	        element.sendKeys(value);		
	        }
		
	    public static void buttonclick(WebElement element) {
		     element.click();
	      }	
	 public static void selectbyindex(WebElement element, int value) {
		Select sc = new Select(element);
		 sc.selectByIndex(value);
	}   

	 public static void selectbytext(WebElement element, String value) {
			Select sc = new Select(element);
			 sc.selectByVisibleText(value);
		}   
	public static String selectbydropdown(WebElement element, String Option, String value ) {
		Select a = new Select(element);
	    if (Option.equalsIgnoreCase("index")) {
	    	int indexvalue = Integer.parseInt(value);
	    	a.selectByIndex(indexvalue);
		} 
	    else if (Option.equalsIgnoreCase("value")) {
		a.selectByValue(value);	
		}
	    else if (Option.equalsIgnoreCase("text")) {
		a.selectByVisibleText(value);	
	    }
	    return Option;
	} 
	public static void clearonelement(WebElement element) {
		element.clear();
	} 
	public static void clickoncheckboxelement(WebElement element) {
		element.click();
	}
	public static void simplealert(WebElement element) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static void confirmationalert(WebElement element) {
		Alert alert = driver.switchTo().alert();
	    alert.dismiss();
	}
	//public static void clickonAlerts(WebElement element, String value) {
//		Alert alert = driver.switchTo().alert();
//		if (value=="accept") {
//			alert.accept();
//		}
//		else if (value=="dismiss") {
//			alert.dismiss();
//		}
	//}
	public static void promptalert(WebElement element, String Value) {
		Alert alert = driver.switchTo().alert();
	    alert.sendKeys(Value);
	    alert.accept();
	    }
	public static void Clickonlogout(WebElement element) {
		element.click();
	} 
	 
	public static void elementisenabled(WebElement element) {
		element.isEnabled();
	}
	public static void elementisdisplayed(WebElement element) {
		element.isDisplayed();
	}
	public static  void elementisselected(WebElement element) {
		element.isSelected();
	}
	public static void navigaterefresh() {
		driver.navigate().refresh();
	}
	public static void quitbrowser() {
		driver.quit();
	}
	public static void Navigatetourl(String Url) {
		driver.navigate().to(Url);
	}
	public static void Navigatebacktourl() {
		driver.navigate().back();
	}
	public static void Navigateforwardtourl() {
		driver.navigate().forward();
	}
	public static  void closethetab() {
		driver.close();
	}
	public static  String gettitle() {
	 String title = driver.getTitle();
	 System.out.println(title);
	 return title;
	}
	public static String getext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;
		}
	public static void getCurrenturl() {
	 driver.getCurrentUrl();
	}

	public static void getattribute(WebElement element, String name, String value) {
		element.getAttribute(name);
		element.getAttribute(value);
		}
	public static void getoptions(WebElement element) {
		Select sc = new Select(element);
	    List<WebElement> options = sc.getOptions();
	    System.out.println("OptionsAre:");
	    for(int i = 0; i<options.size(); i++) {
	     	WebElement element2 = options.get(i);
	       String text = element2.getText(); 
	       System.out.println(text);
	    }
	}
	   
	public static  void getallselectedoptions(WebElement element) {
		Select sc = new Select(element);
	    List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
	    System.out.println("Alloptionsare:");
	    for (int i = 0; i < allSelectedOptions.size(); i++) {
	    	WebElement element3= allSelectedOptions.get(i); 
			String text = element3.getText();	
			System.out.println(text);
			}
	}
	public static String getfirstselectedoptions(WebElement element) {
	     Select sc = new Select(element);
	     WebElement firstSelectedOption = sc.getFirstSelectedOption();
	     String text = firstSelectedOption.getText();
	     System.out.println(text);
	     return text;
	}
	public static void ismultiple(WebElement element) {
		Select sc = new Select(element);
		boolean multiple = sc.isMultiple();
		System.out.println(multiple);
	}
	public static String screenshot(String url) throws IOException {  //doubt
		TakesScreenshot ts = (TakesScreenshot)driver;
		File ts1= ts.getScreenshotAs(OutputType.FILE);
		File ts2 = new File(url);
		FileHandler.copy(ts1, ts2);
	    return screenshot(url);
	}
	//public static void scrollupandscrolldown(WebElement element, String option, String value) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		if (option.equalsIgnoreCase("down")) {
	//js.executeScript("winodw.scrollTo(0,+value)");
//			}
//			else if (option.equalsIgnoreCase("up")) {
//			js.executeScript("window.scrollTo(0,-value)");
//		} 
//				
//			}	
	public static void implicitywaits(int Duration) {
		driver.manage().timeouts().implicitlyWait(Duration, TimeUnit.SECONDS);

	}	
	public static void explicitwaits(int Duration) {
		WebDriverWait ew = new WebDriverWait(driver, Duration);
	    ew.until(null);
	}

	public static String  windowshandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		return windowHandle;
	}

	public static void windowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for(String ab : windowHandles) {
			System.out.println(ab);
			driver.switchTo().window(ab);
		    String title = driver.getTitle();
		    System.out.println(title);
		}
	}
	public static void Actions(WebElement element, String value) {
		Actions a = new Actions(driver);
		if(value=="click") {
	        a.click(element).build().perform();  
	    }
		else if (value=="doubleclick") {
			a.click(element).build().perform();
		}
		else if (value=="contextclick") {
			a.click(element).build().perform();
		} 
		else if (value=="movetoelement") {
			a.click(element).build().perform();
	    }
	}
	public static void clickonelement(WebElement element) {
		element.click();
	}
	public static void DragandDrop(WebElement element1, WebElement element2, String value) {
		Actions a = new Actions(driver);
	   if (value.equalsIgnoreCase("draganddrop")) {
		a.dragAndDrop(element1, element2).build().perform();
	}
	}
	public static void Robot(int code, String value) throws AWTException {
		Robot a = new Robot();
		if (value.equalsIgnoreCase("keypress")) {
			a.keyPress(code);
		}
		else if (value.equalsIgnoreCase("keyRelease")) {
			a.keyRelease(code);
		}
	 
	}

	public static String particulardata(String excelpath, String sheetname,int rowvalue, int columnvalue) throws IOException {
		String data = null;
		 String path =excelpath;
		File f = new File(excelpath);
		FileInputStream fis = new FileInputStream(f);	
		Workbook wb = new XSSFWorkbook(fis);
	    Sheet sheet = wb.getSheet(sheetname);
	    Row row = sheet.getRow(rowvalue);
	    Cell cell = row.getCell(columnvalue);
	    CellType cellType = cell.getCellType();    
	    if (cellType.equals(CellType.STRING)) {
	    	 data = cell.getStringCellValue();     //if we take a return type for getstring cell//we get string
		    System.out.println(data); //just data printed in console. If we change the string means username passed in the url
	    }
	    else if (cellType.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
		     data = Double.toString(ncv);
		     System.out.println(data);
	    }
	return data;
	
	}
	
	public static void clearonelementbyrobot(WebElement element) throws AWTException {
		Robot a = new Robot();
		 Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
		 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");

	}
	
	public static void explicitwait(int seconds) {
		WebDriverWait wa = new WebDriverWait(driver, seconds);
		wa.until(ExpectedConditions);

	}
}
