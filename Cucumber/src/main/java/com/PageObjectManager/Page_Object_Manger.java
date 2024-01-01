package com.PageObjectManager;
import org.openqa.selenium.WebDriver;
import com.pom.Page_Booknowpage;
import com.pom.Page_Logoutpage;
import com.pom.Page_Myitenarypage;
import com.pom.Page_continuepage;
import com.pom.Page_loginpage;
import com.pom.Page_searchpage;
public class Page_Object_Manger {
	static WebDriver driver;
	   
	  private Page_loginpage lp;              //class variable --null
	    public Page_loginpage getInstanceLP() {      //instance of class
		   if (lp==null) {
			   lp= new Page_loginpage(driver);      //memory allocate
			   }
	      return lp;                                //return the loginpage memory
	        }
	  private Page_searchpage sp; 
	     public Page_searchpage getInstanceSP() {
		    if (sp==null) {
			sp= new Page_searchpage(driver);
		    }
		   return sp;
	       }
	   private Page_continuepage cp;
	      public Page_continuepage getInstanceCP() {
	       if (cp==null) {
			cp= new Page_continuepage(driver);
		    }
		  return cp;
	       }
	   private Page_Booknowpage bp;
	      public Page_Booknowpage getInstanceBP() {
	    	  if (bp==null) {
				bp= new Page_Booknowpage(driver);
			}
			return bp;
	      }
	    private Page_Myitenarypage mp;
	        public  Page_Myitenarypage getInstanceMP() {
			   if (mp==null) {
				 mp= new Page_Myitenarypage(driver);
			}
			return mp;
	     }
	   private Page_Logoutpage lgp;
	        public  Page_Logoutpage getInstanceLGP() {
		        if (lgp==null) {
					lgp = new Page_Logoutpage(driver);
				}
				return lgp;
		        }
	   
	   public Page_Object_Manger(WebDriver abc) {
		this.driver=abc;
	}

	  
}
