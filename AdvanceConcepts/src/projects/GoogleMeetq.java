package facebooksignuppage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleMeetq {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver sabari = new ChromeDriver();
		
		sabari.get("https://meet.google.com/ydb-esvp-sfh");
		Thread.sleep(5000);
		Alert alertt= sabari.switchTo().alert();
		alertt.accept();
		
		
		//WebElement cameraa=sabari.findElement(By.xpath("//*[@id=\'yDmH0d\']/c-wiz/div/div/div[10]/div[3]/div/div[1]/div[4]/div/div/div[1]/div[1]/div/div[4]/div[2]/div/div[1]/span/span/div/span[1]/svg/path"));
		
		//cameraa.click();
		
		
		
		
		
		
		
	}

}
