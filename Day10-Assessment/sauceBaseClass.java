package saucedemoday10;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class sauceBaseClass {
	
	protected WebDriver driver = null;
	
	@BeforeSuite
	public void beforesuite()
	{
		Reporter.log("open database connectivity",true);
	}
	
	@BeforeTest
	public void beforetest()
	{
		Reporter.log("pre conditions",true);
	}
	
	@BeforeClass
	public void beforeclass() throws IOException
	{
		// file
		FileInputStream file = new FileInputStream("./src/test/resources/Day10/saucedemo.properties");
		Properties p = new Properties();
		p.load(file);
		// launch the browser 
		String BROWSER=p.getProperty("browser");
		if(BROWSER.contains("chrome"))
		{
			// Avoid Change Password popup
			ChromeOptions settings = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("profile.password_manager_leak_detection", false);
			settings.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(settings);
		}
		Reporter.log("launch browser",true);
		
	}
	
	@BeforeMethod
	public void beforemethod() throws IOException, InterruptedException
	{
		// file
		FileInputStream file = new FileInputStream("./src/test/resources/Day10/saucedemo.properties");
		Properties p = new Properties();
		p.load(file);
		// application
		String URL=p.getProperty("url");
		String username = p.getProperty("username");
		String pass=p.getProperty("password");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		// login
		sauceloginpg l = new sauceloginpg(driver);
		l.getUsername(username);
		l.getPassword(pass);
		l.getLoginbutton();
		Thread.sleep(1000);
		
		Reporter.log("login successful",true);
	
	}
	
	@AfterMethod
	public void aftermethod()
	{
		saucelogoutpg lo = new saucelogoutpg(driver);
		lo.getLogoutclick();
		lo.getLogout();
		Reporter.log("logout",true);
	}
	
	@AfterClass
	public void afterclass()
	{
		saucelogoutpg lo = new saucelogoutpg(driver);
		lo.quit();
		Reporter.log("closing the  browser",true);
	}
	
	@AfterTest
	public void aftertest()
	{
		Reporter.log("post conditions",true);
	}
	
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("close database connectivity",true);
	}

}
