package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver asus = new ChromeDriver();
		
		asus.get("https://letcode.in/frame");
		
		asus.switchTo().frame("firstFr");
		
		asus.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input")).sendKeys("SABARI");
		
		asus.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input")).sendKeys("NATHAN");
		
		
		
		//asus.switchTo().defaultContent();
		
		asus.switchTo().frame(1);
		
		
		asus.findElement(By.name("email")).sendKeys("SABARI@GMAIL.COM");
		
		
	}

}
