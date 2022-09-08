package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleDataFrmExcelFileUNPW {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream fis = new FileInputStream("./data/unpwpage.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    int rowcount = wb.getSheet("unpw").getLastRowNum();
    for(int i=0;i<rowcount;i++)
    {
    	String undata = wb.getSheet("unpw").getRow(i).getCell(0).toString();
    	String pwdata = wb.getSheet("unpw").getRow(i).getCell(1).toString();
    	System.out.println(undata+" "+pwdata);
    	//System.out.println(pwdata);
    }
    wb.close();
	}

}
