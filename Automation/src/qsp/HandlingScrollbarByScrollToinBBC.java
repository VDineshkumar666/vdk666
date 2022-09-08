package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbarByScrollToinBBC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.get("https://www.bbc.com/");  
	    int x = d.findElement(By.xpath("(//a[@class='block-link__overlay-link'])[16]")).getLocation().getX();
	    int y = d.findElement(By.xpath("(//a[@class='block-link__overlay-link'])[16]")).getLocation().getY();
	    JavascriptExecutor j = (JavascriptExecutor) d;
	    j.executeScript("window.scrollTo("+x+","+y+")");
	}

}
