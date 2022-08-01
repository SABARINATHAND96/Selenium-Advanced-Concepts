package facebooksignuppage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteraQawebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver sabari =new ChromeDriver();
		
		sabari.get("https:\\www.google.com");
		
		WebElement google=  sabari.findElement(By.name("q"));
		
		google.sendKeys("iter-qa"+Keys.ENTER);
		
		1
		
		
		
		
		
		
		
		
	}

}
