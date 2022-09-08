package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFileDDT {
	 static {
	 		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 	}

	public static void main(String[] args) throws IOException, InterruptedException {
     FileInputStream fis=new FileInputStream("./data/commondata.property");
     Properties p = new Properties();
     p.load(fis);
     String url = p.getProperty("url");
     String un = p.getProperty("username");
     String pw = p.getProperty("password");
     System.out.println(url);
     System.out.println(un);
     System.out.println(pw);
     //Thread.sleep(2000);
    
     WebDriver d=new ChromeDriver();
     d.get(url);
     d.findElement(By.id("username")).sendKeys(un);
     d.findElement(By.name("pwd")).sendKeys(pw);
     d.close();
     
     
	}

}
