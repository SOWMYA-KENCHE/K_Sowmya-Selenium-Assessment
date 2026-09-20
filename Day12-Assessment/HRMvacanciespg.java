package orangehrmday12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class HRMvacanciespg {
	
	WebDriver driver;
	public HRMvacanciespg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//declare

	@FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement vacanciesadd;
	
	@FindBy(xpath = "(//div[@class='oxd-input-group__label-wrapper']/..//following::input[@class='oxd-input oxd-input--active'])[1]")
	private WebElement vacancyname;
	
	@FindBy(css = "[class='oxd-select-text oxd-select-text--active']")
	private WebElement jobtitle;
	
	@FindBy(xpath = "//span[text()='Automaton Tester']")
	private WebElement jobclick;
	
	@FindBy(css = "[class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	private WebElement description;
	
	@FindBy(css = "[placeholder='Type for hints...']")
	private WebElement hiringmanager;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement positions;
	
	@FindBy(css = "[type='submit']")
	private WebElement savebtn;
	
	@FindBy(css = "[class='oxd-userdropdown-name']")
	private WebElement hiringname;
	
	
	public String getHiringname() {
		return hiringname.getText();
	}
	
	//getters
	
	public void getVacanciesadd() {
		vacanciesadd.click();
	}

	public void getVacancyname(String value) {
		vacancyname.sendKeys(value);
	}

	public void getJobtitle() {
		jobtitle.click();
	}

	public void getJobclick() {
		jobclick.click();
	}

	public void getDescription(String value) {
		description.sendKeys(value);
	}

	public void getHiringmanager(String value) throws InterruptedException {
		hiringmanager.sendKeys(value);
		Thread.sleep(2000);
		hiringmanager.sendKeys(Keys.DOWN,Keys.ENTER);
	}
 
	public void getPositions(String value) {
		positions.sendKeys(value);
	}

	public void getSavebtn() {
		savebtn.click();
	}

	
}
