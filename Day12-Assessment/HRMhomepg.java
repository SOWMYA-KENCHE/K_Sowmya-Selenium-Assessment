package orangehrmday12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMhomepg {
	WebDriver driver;
	public HRMhomepg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//declare
	
	@FindBy(xpath = "//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")
	private WebElement recruitment;
	
	@FindBy(css = "[href='/web/index.php/pim/viewMyDetails']")
	private WebElement myinfo;
	
	//getters


	public void getRecruitment() {
		recruitment.click();
	}

	public void getMyinfo() {
		myinfo.click();
	}
	

}
