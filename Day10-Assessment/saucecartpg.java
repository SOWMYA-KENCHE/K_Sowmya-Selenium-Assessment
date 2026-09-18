package saucedemoday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucecartpg {
	WebDriver driver = null;
	
	public saucecartpg(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//declare
	
	@FindBy(css = "[class='shopping_cart_link']")
	private WebElement cartclick;
	
	@FindBy(css = "[class='inventory_item_name']")
	private WebElement productname;
	
	@FindBy(id ="checkout")
	private WebElement checkout;

	// getters 
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void getCartclick() {
		cartclick.click();
	}

	public void getProductname() {
		if(productname.getText().equals("Sauce Labs Backpack"))
		{
			System.out.println("Sauce Labs Backpack is displayed");
		}
		else
		{
			System.out.println("Sauce Labs Backpack is not displayed");
		}
	}
	
	public void getCheckout() {
		checkout.click();
	}

}
