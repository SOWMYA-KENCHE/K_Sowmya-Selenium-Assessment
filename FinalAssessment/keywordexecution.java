package LastAssessment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class keywordexecution {
	
	keywordimple k = new keywordimple();
	
	public void executors(String keyword) throws IOException, InterruptedException
	{
		if(keyword.contains("LAUNCH_BROWSER"))
		{
			k.launchbrowser();
		}
		if(keyword.contains("OPEN_URL"))
		{
			k.openurl();
		}
		if(keyword.contains("USERNAME"))
		{
			k.username();
		}
		if(keyword.contains("PASSWORD"))
		{
			k.password();
		}
		if(keyword.contains("LOGIN_BUTTON"))
		{
			k.loginbutton();
		}
		if(keyword.contains("LOGOUT_BUTTON"))
		{
			k.logoutbutton();
		}
		if(keyword.contains("CLOSE_BROWSER"))
		{
			k.closebrowser();
		}
	}

	public WebDriver getDriver()
	{
	    return k.getDriver();
	}
	

}
