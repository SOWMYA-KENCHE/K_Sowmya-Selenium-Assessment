package orangehrmday12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRmRecruitmentpg {
	WebDriver driver;
	public HRmRecruitmentpg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//declare
	
	@FindBy(xpath = "//a[text()='Vacancies']")
	private WebElement vacancies;
	
	//getters
	
	public void getVacancies() {
		vacancies.click();
	}
	
	
}
