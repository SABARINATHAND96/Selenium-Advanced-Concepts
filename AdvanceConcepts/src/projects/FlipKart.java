package facebooksignuppage;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver sabari = new ChromeDriver();
		sabari.get("https://www.google.co.in");
		//1.search flipKart website
		
		WebElement search = sabari.findElement(By.name("q"));
		search.sendKeys("Flipkart"+Keys.ENTER);
		
		//2.goto flipKart
		
		WebElement flipk = sabari.findElement(By.partialLinkText("Flipkart"));
		flipk.click();
		
		WebElement alert1=sabari.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		alert1.sendKeys(Keys.ESCAPE);
		
		
		
		
	}

}
