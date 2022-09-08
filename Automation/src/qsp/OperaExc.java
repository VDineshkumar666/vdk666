package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaExc {
static
{
	System.setProperty("driver.opera.driver","/Automation/driver/operadriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new OperaDriver();
driver.get("https://www.google.com/");
	}

}
