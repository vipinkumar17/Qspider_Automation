package handlngExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("Pass");

FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
wb.write(fos);
wb.close();
	}
}
