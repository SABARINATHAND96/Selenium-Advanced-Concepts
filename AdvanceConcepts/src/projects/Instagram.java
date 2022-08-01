package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver cincinati=new ChromeDriver();
		
		cincinati.navigate().to("http:\\www.instagram.com");
		Thread.sleep(3000);
		cincinati.findElement(By.xpath("//input[@name='username']")).sendKeys("asustuf45");
		cincinati.findElement(By.xpath("//input[@name='password']")).sendKeys("asus@123");
		cincinati.findElement(By.xpath("//*[text()='Log In']")).click();
		Thread.sleep(5000);
		cincinati.findElement(By.xpath("//*[@data-testid='user-avatar']")).click();
		
		cincinati.findElement(By.xpath("//*[text()='Profile']")).click();
		
		cincinati.findElement(By.xpath("//*[@aria-label='Search input']")).sendKeys("sabari_");
		
		
		//cincinati.findElement(By.xpath("//*[@aria-label]")).sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
	}

}
