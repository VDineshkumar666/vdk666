package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBoxMTR {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/Dinesh%20kumar%20V/Desktop/MTR.html");
		WebElement multilistbox = d.findElement(By.id("mtr"));
		Select s = new Select(multilistbox);
		s.selectByIndex(9);
		Thread.sleep(2000);
		s.selectByValue("i");
		Thread.sleep(2000);
        s.selectByVisibleText("vada");
        Thread.sleep(2000);
        s.deselectByIndex(9);
	}

}
