package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLFromUserAllLink {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter the url");
		Scanner s=new Scanner(System.in);
		String url = s.nextLine();
WebDriver driver = new ChromeDriver();
driver.get(url);

	}

}
