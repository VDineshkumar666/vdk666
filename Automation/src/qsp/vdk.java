package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vdk {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Dinesh%20kumar%20V/Desktop/File.hm");
		//d.findElement(By.xpath("(//button)[2]")).click();
		File f=new File("./data/VDK3.pdf");
		String absolute = f.getAbsolutePath();
		d.findElement(By.xpath("//pre")).sendKeys(absolute);
	}

}
