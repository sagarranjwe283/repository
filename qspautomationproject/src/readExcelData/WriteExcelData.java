package readExcelData;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/ActiTimeLogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		//--------------------------------------------------
		
		Cell cell = row.createCell(2);
		cell.setCellValue("status");
		
		//--------------------------------------------------
		
		FileOutputStream fos = new FileOutputStream("./data/ActiTimeLogin.xlsx");
		wb.write(fos);
		
		}

}