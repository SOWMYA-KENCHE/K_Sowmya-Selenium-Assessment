//Testcase

Login to orangeHrm application ->click on Recruitment link -> click on + Add button -> enter firstname , middlename , lastname ,
select any option for vacancy ,enter email, mobile number , upload file ,select date of application ->click on save button -> click on candidates ->
select job title , select vacancy , select hiring manager ,select status , enter candidate name,select application date and click on search button -> 
verify whether the employee is added from the records found section and logout.





package Assessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangehrmutil.HRMcandidate;
import orangehrmutil.HRMhomepg;
import orangehrmutil.HRMloginpg;
import orangehrmutil.HRmRecruitmentpg;

public class day8testcase01 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// property file
		FileInputStream file = new FileInputStream("./src/test/resources/Day8/orangehrmday8.properties");
		Properties p = new Properties();
		p.load(file);
		//excel file
		FileInputStream file1 = new FileInputStream("src/test/resources/Day8/OrangeHrmRecruitmentpageData.xlsx");
		//workbook
		Workbook wb = WorkbookFactory.create(file1);
		//sheet
		String firstname = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String middlename = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String lastname = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String email = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		DataFormatter df = new DataFormatter();
		String phonenumber = df.formatCellValue(wb.getSheet("Sheet1").getRow(1).getCell(4));
		String resume_path = wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		String Browser = p.getProperty("browser");
		String url = p.getProperty("url");
		String username = p.getProperty("Username");
		String password = p.getProperty("Password");
		WebDriver driver = null;
		if(Browser.contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		Thread.sleep(1000);
		
		// Login page
		HRMloginpg l = new HRMloginpg(driver);
		l.getUser(username);
		l.getPass(password);
		l.getLoginbut();
		Thread.sleep(2000);
		
		// Home page
		HRMhomepg h = new HRMhomepg(driver);
		h.getRecruitment();
		Thread.sleep(2000);
		
		// Recruitment page
		HRmRecruitmentpg r = new HRmRecruitmentpg(driver);
		r.getAddbut();
		Thread.sleep(2000);
		
		// add candidate 
		HRMcandidate c = new HRMcandidate(driver);
		c.getFirstname(firstname);
		c.getMiddleName(middlename);
		c.getLastName(lastname);
		Thread.sleep(1000);
		c.getVacanyselect();
		c.getVacanyclick();
		Thread.sleep(1000);
		c.getEmail(email);
		Thread.sleep(2000);
		c.getPhoneno(phonenumber);
		c.getResume(resume_path);
		Thread.sleep(1000);
		c.getSavebut();
		Thread.sleep(1000);
		c.getCandidatesclick();
		
		//search candidate
		r.getJobtitle();
		r.getJobtitleclick();
		Thread.sleep(1000);
		r.getVacancy();
		r.getVacancyclick();
		Thread.sleep(1000);
		r.getHiringmanager();
		r.getHiringmanagerclick();
		Thread.sleep(1000);
		r.getStatus();
		r.getStatusclick();
		Thread.sleep(1000);
		r.getCandidatename(firstname);
		Thread.sleep(1000);
		r.getSearch();
		Thread.sleep(1000);
		r.getRecordFound();
		Thread.sleep(2000);
		r.getProfileclick();
		r.getLogout();
		Thread.sleep(2000);

//		close
		driver.quit();

	}

}
