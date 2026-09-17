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
