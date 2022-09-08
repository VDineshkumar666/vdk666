package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XYoffb 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement user = driver.findElement(By.id("email"));
		int ux = user.getLocation().getX();
		int uy = user.getLocation().getY();
		System.out.println("facebook email x axis value is "+ux);
		System.out.println("facebook email y axis value is "+uy);
		driver.close();

	}

}
