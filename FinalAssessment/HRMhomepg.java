package LastAssessment;

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
	
	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement Buzzclick;
		
		
	//getters

	public void getBuzzclick() {
		Buzzclick.click();
	}
	

}
