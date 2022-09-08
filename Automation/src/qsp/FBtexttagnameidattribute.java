package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBtexttagnameidattribute {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.facebook.com/");
		 String id = driver.findElement(By.id("loginbutton")).getText();
		 String tag = driver.findElement(By.tagName("button")).getText();
		 String name = driver.findElement(By.name("login")).getText();
		System.out.println("id "+id);
		System.out.println("tagname "+tag);
		System.out.println("name "+name);
	}

}
