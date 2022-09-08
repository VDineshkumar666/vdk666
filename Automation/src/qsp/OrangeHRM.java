package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver d = new ChromeDriver(); 
	    d.get("https://opensource-demo.orangehrmlive.com/");
	    d.manage().window().maximize();
	    d.findElement(By.id("txtUsername")).sendKeys("Admin ");
	    d.findElement(By.id("txtPassword")).sendKeys("admin123 ");
	    d.findElement(By.name("Submit")).click();
	    d.findElement(By.linkText("Forgot your password?")).click();
	    d.findElement(By.name("securityAuthentication[userName]")).sendKeys("vdk123");
	    d.findElement(By.xpath("//input[@class='searchValues']")).submit();
	    //d.findElement(By.xpath("(//input[@name='button'])[2]")).click();
	    JavascriptExecutor j = (JavascriptExecutor) d;
	    j.executeScript("document.getElementById('btnCancel').click()");
	    //d.close();
}
}