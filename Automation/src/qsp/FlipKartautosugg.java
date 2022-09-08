package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartautosugg {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allsugg = driver.findElements(By.xpath(/*"//li/div/a/div[2]*/"//span[contains(text(),'iphone')]"));
		int count = allsugg.size();
		System.out.println(count);
		for(WebElement all:allsugg)
		{
			String text = all.getText();
			System.out.println(text);
		}
		allsugg.get(count-1).click();
	}

}
