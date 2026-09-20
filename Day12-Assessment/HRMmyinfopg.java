package orangehrmday12;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HRMmyinfopg {
	
	WebDriver driver;
	public HRMmyinfopg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	//declare
	
	@FindBy(name = "firstName")
	private WebElement firstName;
	
	@FindBy(name = "lastName")
	private WebElement lastName;
	
	@FindBy(xpath = "//label[text()='Employee Id']/../..//input")
	private WebElement empid;
	
	@FindBy(css = "[type='submit']")
	private WebElement savebutton;
	
	//getters
	
	public void getFirstName(String value) {
		firstName.sendKeys(Keys.CONTROL+"a");
		firstName.sendKeys(Keys.BACK_SPACE);
		firstName.sendKeys(value);
	}

	public void getLastName(String value) {
		lastName.sendKeys(Keys.CONTROL+"a");
		lastName.sendKeys(Keys.BACK_SPACE);
		lastName.sendKeys(value);
	}

	public void getEmpid(String value) {
	    empid.click();
	    empid.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	    empid.sendKeys(Keys.BACK_SPACE);
	    empid.sendKeys(value);
	    
	}

	public void getSavebutton() {
		savebutton.click();
	}
	
	public String getFirstName()
	{
		return firstName.getAttribute("value");
	}
	
	public void verifyDetailsUpdated(String value) throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println(getFirstName());
		Assert.assertEquals(getFirstName(),value);
	}
	
}
