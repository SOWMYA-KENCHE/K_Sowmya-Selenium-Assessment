//TestCase  - 1

Login to orangeHrm application ->click on Recruitment link ->click on vacancies link ->enter vacancy name ,
select job title,add description , select hiring manager, number of positons-> 
click on save button 
//Testcase 2

Login to orangeHrm application ->click on MyInfo link ->change employee first name, lastname ,employee id ->
click on save->logut and then login again ->verify whether the edited details are updated-> logout


------Use all  required frameWork concepts-----



package Assessment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import orangehrmday12.Baseclasshrm;
import orangehrmday12.HRMVerifypg;
import orangehrmday12.HRMhomepg;
import orangehrmday12.HRMmyinfopg;
import orangehrmday12.HRMvacanciespg;
import orangehrmday12.HRmRecruitmentpg;

public class day12testcase01 extends Baseclasshrm {
	
	@Test(priority = 1)
	public void vacancyadd()throws EncryptedDocumentException, IOException, InterruptedException
	{
		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
		{
		Reporter.log("login executed",true);
		Assert.assertTrue(true);
		}
		
		// home page
		HRMhomepg hp = new HRMhomepg(driver);
		hp.getRecruitment();
				
		// recruitment page
		HRmRecruitmentpg rp = new HRmRecruitmentpg(driver);
		rp.getVacancies();
				
		// vacancy page
		HRMvacanciespg vp = new HRMvacanciespg(driver);
		vp.getVacanciesadd();
				
		// read excel file
		FileInputStream file1 = new FileInputStream("./src/test/resources/Day12/OranagleHRMSpecificData.xlsx");
		Workbook wb = WorkbookFactory.create(file1);
		String vacancyname = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String description = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String manager = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		DataFormatter df = new DataFormatter();
		String positions = df.formatCellValue(wb.getSheet("Sheet1").getRow(1).getCell(3));
				
		// vacancy add
		vp.getVacancyname(vacancyname);
		vp.getJobtitle();
		vp.getJobclick();
		vp.getDescription(description);
		vp.getHiringmanager(vp.getHiringname());
		Thread.sleep(1000);
		vp.getPositions(positions);
		Thread.sleep(1000);
		vp.getSavebtn();
				
		Reporter.log("vacancy is added",true);
		
		rp.getVacancies();
		
		//verify 
		HRMVerifypg verify = new HRMVerifypg(driver);
		verify.getJobcheckclick();
		verify.getJobcheckclickjob();
		Thread.sleep(1000);
		verify.getVacanycheck();
		verify.getVacanycheckclick();
		Thread.sleep(1000);
		verify.getStatuscheck();
		verify.getStatusclick();
		Thread.sleep(1000);
		verify.getSearch();
		Thread.sleep(3000);
		verify.getRecordverify();
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void myinfoupdate() throws EncryptedDocumentException, IOException, InterruptedException
	{
		// file 
		FileInputStream file1 = new FileInputStream("./src/test/resources/Day12/OranagleHRMSpecificData.xlsx");
		Workbook wb = WorkbookFactory.create(file1);
		String firstname = wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String lastname = wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		DataFormatter df = new DataFormatter();
		String empid = df.formatCellValue(wb.getSheet("Sheet1").getRow(1).getCell(6));
		// home page
		HRMhomepg hp = new HRMhomepg(driver);
		hp.getMyinfo();
		
		// update data
		HRMmyinfopg ip = new HRMmyinfopg(driver);
		Thread.sleep(5000);
		ip.getFirstName(firstname);
		Thread.sleep(2000);
		ip.getMiddleName();
		ip.getLastName(lastname);
		Thread.sleep(2000);
		ip.getEmpid(empid);
		Thread.sleep(3000);
		ip.getSavebutton();
		Thread.sleep(3000);
		Reporter.log("info is updated",true);
	}
	
	@Test(priority = 3, dependsOnMethods = "myinfoupdate")
	public void myinfoverify() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Reporter.log("my info verification",true);
		// verify page
		HRMVerifypg verify = new HRMVerifypg(driver);
		verify.getMyinfoclick();
		Thread.sleep(2000);
		FileInputStream file1 = new FileInputStream("./src/test/resources/Day12/OranagleHRMSpecificData.xlsx");
		Workbook wb = WorkbookFactory.create(file1);
		String firstname = wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		HRMmyinfopg my = new HRMmyinfopg(driver);
		my.verifyDetailsUpdated(firstname);
		Reporter.log("edited details are updated",true);
	}

}
