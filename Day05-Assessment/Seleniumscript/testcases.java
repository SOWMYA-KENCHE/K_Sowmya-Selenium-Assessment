//Test- case  1 
1.Navigate to DemoWebshop application 
2.Click on login link .
3.Enter email and password and click on login button by reading the data from property file.

package Assessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day5testcase01 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// file
		FileInputStream file = new FileInputStream("./src/test/resources/DDT/webshop.properties");
		// create object for properties class
		Properties p = new Properties();
		// use properties to load file
		p.load(file);
		// fetch data from property file 
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String EMAIL = p.getProperty("Email");
		String PASSWORD= p.getProperty("Password");
		// browser
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
		// open application
		driver.get(URL);
		//maximize
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		//enter email and password
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		Thread.sleep(1000);
		//click on login
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		//close 
		driver.quit();
	}

}


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

//Testcase 3 

1.Navigate to Demoappsqspiders application
2.Enter name, email,password and click on login  submit button
3.Read the data from json file.

package Assessment;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day5testcase03 {

	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		//open file
	    FileReader fis=new FileReader("./src/test/resources/DDT/demoqspiders.json");
	    JSONParser js=new JSONParser();
	    Object obj = js.parse(fis);
	    JSONObject json =(JSONObject)obj;
	    String BROWSER=(String) json.get("browser");
	    String URL=(String) json.get("url");
	    String name=(String) json.get("name");
	    String email=(String) json.get("EmailId");
	    String pass=(String) json.get("Password");
	    WebDriver driver=null;
	   	if(BROWSER.contains("chrome"))
	   	{
	   		driver= new ChromeDriver();
	   	}
	   	if(BROWSER.contains("edge"))
	   	{
	   		driver= new EdgeDriver();
	   	}
	   	if(BROWSER.contains("firefox"))
	   	{
	   		driver= new FirefoxDriver();
	   	}
	   	driver.manage().window().maximize();
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	driver.get(URL);
	   	Thread.sleep(2000);
	   	driver.findElement(By.id("name")).sendKeys(name);
	   	Thread.sleep(1000);
	   	driver.findElement(By.id("email")).sendKeys(email);
	   	Thread.sleep(1000);
	   	driver.findElement(By.id("password")).sendKeys(pass);
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("//button[text()='Register']")).click();
	   	Thread.sleep(1000);
	   	driver.quit();
	}
   
}
