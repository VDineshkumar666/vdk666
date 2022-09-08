package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class DemoB {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
public static void main(String[] args) {
	//WebDriver driver=new ChromeDriver();
	//DemoA.testA(driver);
	WebDriver driver1=new FirefoxDriver();
	driver1.get("https://www.google.com/");
	DemoA.testA(driver1);
}
}
