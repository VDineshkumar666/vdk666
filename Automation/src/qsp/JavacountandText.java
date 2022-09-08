package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavacountandText {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> allLink = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
        int count = allLink.size();
        System.out.println(count);
        for(WebElement link:allLink)
        {
        	String text = link.getText();
        	System.out.println(text);
        }
        allLink.get(0).click();
	}

}
