package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxEx {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
    WebDriver d = new ChromeDriver();
    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    d.get("https://www.facebook.com/");
    d.findElement(By.linkText("Create New Account")).click();
    WebElement monthListBox = d.findElement(By.id("month"));
    Select s=new Select(monthListBox);
    Thread.sleep(3000);
    s.selectByIndex(5);
    
    
	}
	
}
