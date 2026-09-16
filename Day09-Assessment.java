// saucedemo implementation file

package KeywordDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemoimpl {
	WebDriver driver;
	
	public void launchbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void openurl()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	public void username()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	
	public void password()
	{
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	public void loginbutton()
	{
		driver.findElement(By.id("login-button")).click();
	}
	
	public void closebrowser()
	{
		driver.quit();
	}

}


// saucedemo execution file

package KeywordDriven;

public class saucedemoexecutors {
	
	saucedemoimpl s = new saucedemoimpl();
	
	public void executors(String keyword)
	{
		if(keyword.equals("LAUNCH_BROWSER"))
		{
			s.launchbrowser();
		}
		else if(keyword.equals("OPEN_URL"))
		{
			s.openurl();
		}
		else if(keyword.equals("USERNAME"))
		{
			s.username();
		}
		else if(keyword.equals("PASSWORD"))
		{
			s.password();
		}
		else if(keyword.equals("LOGIN_BUTTON"))
		{
			s.loginbutton();
		}
		else if(keyword.equals("CLOSE_BROWSER"))
		{
			s.closebrowser();
		}
	}

}


// main java file

package keyworddriven;

import KeywordDriven.saucedemoexecutors;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		saucedemoexecutors sauce = new saucedemoexecutors();
		sauce.executors("LAUNCH_BROWSER");
		sauce.executors("OPEN_URL");
		sauce.executors("USERNAME");
		sauce.executors("PASSWORD");
		Thread.sleep(1000);		
		sauce.executors("LOGIN_BUTTON");
		sauce.executors("CLOSE_BROWSER");

	}

}
