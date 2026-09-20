package orangehrmday12;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HRMkeywordimplementation {
	
	protected WebDriver driver;
	public void launchbrowser() throws IOException
	{
		FileInputStream file = new FileInputStream("./src/test/resources/Day12/orangehrm.properties");
		Properties p = new Properties();
		p.load(file);
		String Browser = p.getProperty("browser");
		if(Browser.contains("edge"))
		{
			driver = new EdgeDriver();
		}
	}
	
	public void openurl() throws IOException
	{
		FileInputStream file = new FileInputStream("./src/test/resources/Day12/orangehrm.properties");
		Properties p = new Properties();
		p.load(file);
		String Url = p.getProperty("Url");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Url);
	}
	
	public void username() throws IOException, InterruptedException
	{
		FileInputStream file = new FileInputStream("./src/test/resources/Day12/orangehrm.properties");
		Properties p = new Properties();
		p.load(file);
		String Username = p.getProperty("Username");
		
		// login page
		HRMloginpg l = new HRMloginpg(driver);
		l.getUser(Username);
	}
	
	public void password() throws IOException, InterruptedException
	{
		FileInputStream file = new FileInputStream("./src/test/resources/Day12/orangehrm.properties");
		Properties p = new Properties();
		p.load(file);
		String Password = p.getProperty("Password");
		
		// login page
		HRMloginpg l = new HRMloginpg(driver);
		l.getPass(Password);
		Thread.sleep(1000);
	}
	
	public void loginbutton() throws IOException, InterruptedException
	{	
		HRMloginpg l = new HRMloginpg(driver);
		l.getLoginbut();
	}
	
	public void logoutbutton() throws IOException, InterruptedException
	{	
		HRMlogoutpg l = new HRMlogoutpg(driver);
		l.getProfileclick();
		Thread.sleep(1000);
		l.getLogout();
	}
	
	public void closebrowser()
	{
		driver.quit();
	}
	
	public WebDriver getDriver()
	{
	    return driver;
	}

}
