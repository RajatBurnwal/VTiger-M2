package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDataToExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\Data.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.createSheet("Companies");
//		Row r = sh.createRow(2);
//		Cell c = r.createCell(2);
//		c.setCellValue("Kochi");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\rajat burnwal\\Desktop\\Data.xlsx");
//		wb.write(fos);
		ExcelUtility eUtil = new ExcelUtility();
		eUtil.writeDataToExcel("Subject", 2, 4, "Selenium");

	}

}
