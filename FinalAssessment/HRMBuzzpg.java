package LastAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HRMBuzzpg {
	
	WebDriver driver;
	public HRMBuzzpg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//declare
	
	@FindBy(css = "[rows='1']")
	private WebElement whatonminclick;
	
	@FindBy(css = "[type='submit']")
	private WebElement postclick;
	
	@FindBy(xpath = "//p[text()='hey, my battery is dead']")
	private WebElement verifytext;
	
	//getters

	public void getWhatonminclick(String value) {
		whatonminclick.sendKeys(value);
	}

	public void getPostclick() {
		postclick.click();
	}
	
	public void getVerifytext(String value) {
		Assert.assertEquals(verifytext.getText(),value);
//		boolean verify = verifytext.isDisplayed();
//		Assert.assertTrue(verify);
	}
	
}
