package orangehrmday12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HRMVerifypg {
	
	WebDriver driver;
	public HRMVerifypg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[text()='-- Select --']")
	private WebElement jobcheckclick;
	
	@FindBy(xpath = "//span[text()='Automaton Tester']")
	private WebElement jobcheckclickjob;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	private WebElement vacanycheck;
	
	@FindBy(xpath = "//span[text()='Automation Testing']")
	private WebElement vacanycheckclick;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[4]")
	private WebElement statuscheck;

	@FindBy(xpath = "//span[text()='Active']")
	private WebElement statusclick;
	
	@FindBy(css = "[type='submit']")
	private WebElement search;
	
	@FindBy(xpath = "//span[text()='(1) Record Found']")
	private WebElement recordverify;
	
	@FindBy(css = "[href='/web/index.php/pim/viewMyDetails']")
	private WebElement myinfoclick;
	
	
	// getters
	
	public void getJobcheckclick() {
		jobcheckclick.click();
	}

	public void getJobcheckclickjob() {
		jobcheckclickjob.click();
	}

	public void getVacanycheck() {
		vacanycheck.click();
	}

	public void getVacanycheckclick() {
		vacanycheckclick.click();
	}

	public void getStatuscheck() {
		statuscheck.click();
	}

	public void getStatusclick() {
		statusclick.click();
	}
	
	public void getSearch() {
		search.click();
	}

	public void getRecordverify() {
		boolean recordverification = recordverify.isDisplayed();
		Assert.assertTrue(recordverification);
	}

	public void getMyinfoclick() {
		myinfoclick.click();
	}	

}
