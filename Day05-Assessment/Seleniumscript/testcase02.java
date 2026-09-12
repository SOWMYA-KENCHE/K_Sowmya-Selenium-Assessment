//Testcase 2 

1.Navigate to orange Hrm application
2.Enter the username password and click on login buuton
by redaing the data from excel file.


  package Assessment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day5testcase02 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//file
		FileInputStream file = new FileInputStream("./src/test/resources/DDT/orangehmdemo.xlsx");
		//workbook
		Workbook wb = WorkbookFactory.create(file);
		//sheet
		Sheet sheet = wb.getSheet("Sheet1");
		//row
		Row row = sheet.getRow(1);
		//value
		String  BROWSER = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String  URL = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String  USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String  PASSWORD = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	    WebDriver driver = null;
		if(BROWSER.contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(BROWSER.contains("Edge"))
		{
			driver = new EdgeDriver();
		}
		if(BROWSER.contains("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(4000);
		//close
		driver.quit();
	}

}
