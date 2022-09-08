package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginbutton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String tn = driver.findElement(By.tagName("button")).getText();
		String tn1=driver.findElement(By.id("loginbutton")).getText();
		System.out.println(tn);
		System.out.println(tn1);
		driver.close();
		

	}

}
