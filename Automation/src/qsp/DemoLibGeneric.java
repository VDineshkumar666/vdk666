package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLibGeneric {
	public String getPropertyfile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String propertydata = p.getProperty(key);
		return propertydata;
	}
	public String getExcelfile(String unpw,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/unpwpage.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String exceldata=wb.getSheet(unpw).getRow(row).getCell(cell).toString();
		return exceldata;
	}
	

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		
		DemoLibGeneric dlg=new DemoLibGeneric();
		
		String url = dlg.getPropertyfile("url");
		String un = dlg.getPropertyfile("username");
		String pw = dlg.getPropertyfile("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		WebDriver d = new ChromeDriver();
		d.get(url);
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pw);
		String edata = dlg.getExcelfile("unpw", 0, 1);
        System.out.println(edata);
	}

}
