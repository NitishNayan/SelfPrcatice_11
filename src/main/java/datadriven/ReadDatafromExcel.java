package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDatafromExcel
{
	@Test
	public void read() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./TestData/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String email =wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(email);

		String url =wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(url);

		String password =wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(password);
	}

}
