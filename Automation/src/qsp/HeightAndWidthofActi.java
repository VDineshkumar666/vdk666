package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidthofActi 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement user = driver.findElement(By.id("username"));
         int uh = user.getSize().getHeight();
         int uw = user.getSize().getWidth();
         WebElement psd = driver.findElement(By.name("pwd"));
         int ph = psd.getSize().getHeight();
         int pw = psd.getSize().getWidth();
         System.out.println("username height is "+uh);
         System.out.println("username width is "+uw);
         System.out.println("password height is "+ph);
         System.out.println("password width is "+pw);
         if(uh==ph&&uw==pw)
        	 System.out.println("username & password height & width are same and pass");
         else
        	 System.out.println("username & password height & width are not same and fail");
}

}
