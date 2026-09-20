package orangehrmday12;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclasshrm {
	 
	HRMkeywordexecution e = new HRMkeywordexecution();
	protected WebDriver driver = null;

	
	 @BeforeSuite
	 public void beforesuite()
	 {
		 Reporter.log("--establish database connectivity--",true);
	 }
	 
	 @BeforeTest
	 public void beforetest()
	 {
		 Reporter.log("--Pre-conditions--",true);
	 }
	 
	 @BeforeClass
	 public void beforeclass() throws IOException, InterruptedException
	 {
		 
		 e.executors("LAUNCH_BROWSER");
		 driver = e.getDriver();
		 Reporter.log("launched browser",true);
	 }
	 
	 @BeforeMethod
	 public void beforemethod() throws IOException, InterruptedException
	 {
		 
		 e.executors("OPEN_URL");
		 e.executors("USERNAME");
		 e.executors("PASSWORD");
		 e.executors("LOGIN_BUTTON");
		 Reporter.log("login successful",true);
		 Thread.sleep(2000);
	 }
	 
	 @AfterMethod
	 public void aftermethod() throws IOException, InterruptedException
	 {
		 
		 e.executors("LOGOUT_BUTTON");
		 Reporter.log("logout successful",true);
	 }
	 
	 @AfterClass
	 public void afterclass() throws IOException, InterruptedException
	 {
		 
		 e.executors("CLOSE_BROWSER");
		 Reporter.log("closing browser",true);
	 }
	 
	 @AfterTest
	 public void aftertest()
	 {
		 Reporter.log("--Post-conditions--",true);
	 }
	 
	 @AfterSuite
	 public void aftersuite()
	 {
		 Reporter.log("--close database connectivity--",true);
	 }

}
