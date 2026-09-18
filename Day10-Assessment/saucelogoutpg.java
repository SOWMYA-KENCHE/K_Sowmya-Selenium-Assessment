package saucedemoday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucelogoutpg {
	
WebDriver driver = null;
	
	public saucelogoutpg(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement logoutclick;
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement logout;
	
	//getters
	
	public void getLogoutclick() {
		logoutclick.click();
	}

	public void getLogout() {
		logout.click();
	}
	
	public void quit()
	{
		driver.quit();
	}
	

}
