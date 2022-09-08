package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFileDDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./data/testcript.xlsx");
   Workbook wb= WorkbookFactory.create(fis);
   String exceldata = wb.getSheet("CreateCustomer").getRow(1).getCell(2).toString();
   System.out.println(exceldata);
	}

}
