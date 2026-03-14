package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingMultipleDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\Data.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("City");
//		int rowNum = sh.getLastRowNum();
//		DataFormatter df = new DataFormatter();
//		for(int i=1;i<=rowNum;i++) {
//			Row r = sh.getRow(i);
//			short cellNum = r.getLastCellNum();
//			for(int j=0;j<cellNum;j++) {
//				Cell c = r.getCell(j);
//				String value = df.formatCellValue(c);
//				System.out.print(value+" ");
//			}
//			System.out.println();
//		}
		ExcelUtility eUtil = new ExcelUtility();
		List<String> a1 = eUtil.getMultipleDataFromExcel("City", 1, 0);
		System.out.println(a1);

	}

}
