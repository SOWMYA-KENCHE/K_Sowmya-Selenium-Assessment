package orangehrmday12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//span[text()='Selenium tester']")
	private WebElement vacanycheckclick;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[4]")
	private WebElement statuscheck;

	@FindBy(xpath = "//span[text()='Active']")
	private WebElement statusclick;
	
	@FindBy(css = "[type='submit']")
	private WebElement search;
	
	@FindBy(css = "[class='oxd-text oxd-text--span']")
	private WebElement recordverify;
	
	@FindBy(css = "[href='/web/index.php/pim/viewMyDetails']")
	private WebElement myinfoclick;
	
	@FindBy(css = "[class='oxd-text oxd-text--h6 --strong']")
	private WebElement name;
	
	
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
		vacanycheckclick.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
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
		if(recordverify.getText().equals(" (1) Records Found"))
		{
			System.out.println("vacancy added is verified");
		}
		else
		{
			System.out.println("vacancy added is not verified");
		}
	}
	
	public void getMyinfoclick() {
		myinfoclick.click();
	}

	public void getName() {
		if(name.getText().equals("sowmya Kenche"))
		{
			System.out.println("edited details are updated");
		}
		else
		{
			System.out.println("edited details are not updated");
		}
	}

	
	

}
