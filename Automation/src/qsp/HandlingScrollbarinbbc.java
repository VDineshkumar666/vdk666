package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbarinbbc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.get("https://www.bbc.com/");
	    JavascriptExecutor j = (JavascriptExecutor) d;
	    j.executeScript("window.scrollBy(0,3000)");
	}

}
