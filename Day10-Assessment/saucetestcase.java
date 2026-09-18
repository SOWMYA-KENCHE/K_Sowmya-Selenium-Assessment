//Testcase

NAvigate to SauceDemo Application.
Login using a valid username and password.
Verify that the Products page is displayed.
Add Sauce Labs Backpack to the cart.
Verify that the cart contains 1 item.
Open the cart.
Verify that Sauce Labs Backpack is displayed.
Click on  to checkout.
Enter: Fisrt Name ,Last Name and postal code and click on continue.
Verify that the Checkout: Overview page is displayed.
Click Finish.
Verify the message "Thank you for your order!".
Close the browser.


Note : Use Two test MEthods
1.loginTest()
2.oderPalcementTest()

Maintain property file,Excel File,Pom Pages and Use TestNg annotations 


package Assessment;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import saucedemoday10.sauceBaseClass;
import saucedemoday10.saucecartpg;
import saucedemoday10.saucecheckoutoverviewpg;
import saucedemoday10.saucecheckoutpg;
import saucedemoday10.sauceproductspg;

public class day10testcase  extends sauceBaseClass{
	@Test
	public void loginTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		// Verify Product Page
        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
        	Reporter.log("Product Page is displayed",true);
        } else {
        	Reporter.log("Page is Not displayed",true);
        }    
		System.out.println("login executed");
	}
	
	@Test(dependsOnMethods = "loginTest" )
	public void oderPalcementTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		// products page
		sauceproductspg pr = new sauceproductspg(driver);
		pr.getProductpage();
		pr.getAddtocart();
		Thread.sleep(1000);
		pr.getCart();
						
		// cart page
		saucecartpg c = new saucecartpg(driver);
		c.getCartclick();
		c.getProductname();
		c.getCheckout();
						
		// excel file 
		FileInputStream file1 = new FileInputStream("./src/test/resources/Day10/saucedemoorder.xlsx");
		Workbook wb = WorkbookFactory.create(file1);
		String firstname = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String lastname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		DataFormatter df = new DataFormatter();
		String zipcode =df.formatCellValue(wb.getSheet("Sheet1").getRow(1).getCell(2));
						
		//checkout page
		saucecheckoutpg ch = new saucecheckoutpg(driver);
		ch.getFirstname(firstname);
		ch.getLastname(lastname);
		ch.getPostalcode(zipcode);
		Thread.sleep(2000);
		ch.getContinueclick();
		
		//checkout overview page
		saucecheckoutoverviewpg sc = new saucecheckoutoverviewpg(driver);
		sc.getCheckoutoverview();
		Thread.sleep(1000);
		sc.getFinish();
		Thread.sleep(2000);
		sc.getMessage();
		Thread.sleep(2000);
		System.out.println("order placement done successfully ");
	}

}
