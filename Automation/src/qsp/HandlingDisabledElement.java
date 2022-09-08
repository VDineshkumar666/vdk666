package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElement {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    WebDriver d = new ChromeDriver();
    d.get("file:///C:/Users/Dinesh%20kumar%20V/Desktop/selenium%20xpath/disabled.html");
    d.findElement(By.id("d1")).sendKeys("admin");
    JavascriptExecutor j = (JavascriptExecutor) d;
    j.executeScript("document.getElementById('d2').value='manager'");
    Thread.sleep(5000);
    d.findElement(By.id("d3")).click();
	}

}
