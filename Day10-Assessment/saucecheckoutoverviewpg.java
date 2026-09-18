package saucedemoday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucecheckoutoverviewpg {
	
	WebDriver driver = null;
	
	public saucecheckoutoverviewpg(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css= "[class='header_secondary_container']")
	private WebElement checkoutoverview;
	
	@FindBy(id = "finish")
	private WebElement finish;
	
	@FindBy(css = "[data-test='complete-header']")
	private WebElement message;
	
	public void getCheckoutoverview() {
		if(checkoutoverview.getText().equals("Checkout: Overview"))
		{
			System.out.println("Checkout: Overview page is displayed");
		}
		else
		{
			System.out.println("Checkout: Overview page is not displayed");
		}
	}

	public void getFinish() {
		finish.click();
	}

	public void getMessage() {
		if(message.getText().equals("Thank you for your order!"))
		{
			System.out.println("Thank you for your order! :message is printed");
		}
		else
		{
			System.out.println("Thank you for your order! :message is not printed");
		}
	}


}
