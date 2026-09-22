package LastAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMlogoutpg {
	
	WebDriver driver;
	public HRMlogoutpg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//declare
	
	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	private WebElement profileclick;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	//getters
	
	public void getProfileclick() {
		profileclick.click();
	}

	public void getLogout() {
		logout.click();
	}

}
