package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
        WebElement target = driver.findElement(By.partialLinkText("Resources"));
        
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement dclick = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
		a.doubleClick(dclick).perform();
		boolean display = driver.findElement(By.xpath("//h1[text()='HackerEarth + Vtiger CRM']")).isDisplayed();
		if(display==true)
			System.out.println("HackerEarth + Vtiger CRM page is displayed");
		else
			System.out.println("HackerEarth + Vtiger CRM page is not displayed");
	}

}
