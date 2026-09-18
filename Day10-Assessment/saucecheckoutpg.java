package saucedemoday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucecheckoutpg {
	
	WebDriver driver = null;
	
	public saucecheckoutpg(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "first-name")
	private WebElement firstname;
	
	@FindBy(id= "last-name")
	private WebElement lastname;
	
	@FindBy(id= "postal-code")
	private WebElement postalcode;
	
	@FindBy(id = "continue")
	private WebElement continueclick;

	
	//getters
	
	public void  getFirstname(String value) {
		firstname.sendKeys(value);
	}

	public void getLastname(String value) {
		lastname.sendKeys(value);
	}

	public void getPostalcode(String value) {
		postalcode.sendKeys(value);
	}

	public void getContinueclick() {
		continueclick.click();
	}


}
