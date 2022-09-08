package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintCurrentUrl {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.seleniumhq.org/");
      String url = driver.getCurrentUrl();
      if(url.equals("https://www.selenium.dev/"))
      {
    	  System.out.println("url is successfully navigating and pass");
      }
      else
      {
    	  System.out.println("url is not navigating and fail");
      }
	}

}
