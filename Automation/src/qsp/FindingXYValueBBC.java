package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingXYValueBBC {
     public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    WebDriver d = new ChromeDriver();
    d.get("https://www.bbc.com/");
    int xvalue = d.findElement(By.xpath("(//a[@class='block-link__overlay-link'])[16]")).getLocation().getX();
   int yvalue = d.findElement(By.xpath("(//a[@class='block-link__overlay-link'])[16]")).getLocation().getY();
    System.out.println(xvalue);
    System.out.println(yvalue);
     }

}
