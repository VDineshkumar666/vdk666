package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     WebDriver d=new ChromeDriver();
     d.get("https://www.bbc.com/");
    int y = d.findElement(By.xpath("(//a[@class='block-link__overlay-link'])[42]")).getLocation().getY();
    Thread.sleep(2000);
   JavascriptExecutor j=(JavascriptExecutor)d;
   j.executeScript("window.scrollBy(0,"+y+")");
	}

}
