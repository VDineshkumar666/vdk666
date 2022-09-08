package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		boolean button = driver.findElement(By.id("loginbutton")).isEnabled();
		if(button==true)
			System.out.println(" login button is enabled");
		else
			System.out.println(" login button is not enabled");
		//driver.close();
	}

}
