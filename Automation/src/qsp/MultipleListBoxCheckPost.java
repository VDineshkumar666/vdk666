package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBoxCheckPost
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.get("file:///C:/Users/Dinesh%20kumar%20V/Desktop/MTR.html");
	    WebElement cplistbox = d.findElement(By.id("cp"));
	    Select s = new Select(cplistbox);
	    Thread.sleep(2000);
	    s.selectByIndex(5);
	    Thread.sleep(2000);
	    s.selectByValue("r");
	    s.selectByVisibleText("khara bath");
        s.deselectAll();
	}
}
