package assessment1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import LastAssessment.Baseclassorangehrm;
import LastAssessment.HRMBuzzpg;
import LastAssessment.HRMhomepg;

public class orangehrm extends Baseclassorangehrm {
	
	@Test
	public void buzzpost() throws EncryptedDocumentException, IOException
	{
		// click on buzz
		HRMhomepg hp = new HRMhomepg(driver);
		hp.getBuzzclick();
		
		// buzz page
		
		FileInputStream file = new FileInputStream("./src/test/resources/lastassessment/orangehrmlast.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String data = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		HRMBuzzpg bp = new HRMBuzzpg(driver);
		bp.getWhatonminclick(data);
		bp.getPostclick();
		
		// verify post
		bp.getVerifytext(data);
		Reporter.log("post is displayed on the page",true);

	}

}
