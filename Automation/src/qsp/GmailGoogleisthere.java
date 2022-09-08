package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailGoogleisthere {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver d = new ChromeDriver(); 
	    d.navigate().to("https://mail.google.com/mail/u/0/#inbox");
        boolean url = d.findElement(By.partialLinkText("https://mail.google.com/mail/u/0/#inbox")).isDisplayed();
	    if(url==true)
	    	System.out.println("google is there");
	    else
	    	System.out.println("google is not there");
	}
}
