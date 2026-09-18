package saucedemoday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauceproductspg {
	
	WebDriver driver = null;
	
	public sauceproductspg(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//declare
	
	@FindBy(xpath = "//span[text()='Products']")
	private WebElement productpage;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addtocart;
	
	@FindBy(xpath = "//span[text()='1']")
	private WebElement cart;


	// getters
	
	public void getProductpage() {
		if(productpage.isDisplayed())
		{
			System.out.println("Products page is displayed");
		}
		else
		{
			System.out.println("Products page is not displayed");
		}
	}
	
	public void getAddtocart() {
		addtocart.click();
	}

	public void getCart() {
		if(cart.getText().equals("1"))
		{
			System.out.println("cart contains 1 item");
		}
		else
		{
			System.out.println("cart contains o items");
		}
	}
	

}
