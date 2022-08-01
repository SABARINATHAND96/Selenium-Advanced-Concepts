package facebooksignuppage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1.Given any data then search 
		
		WebElement name = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		name.sendKeys("sdj");
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\'Wikipedia1_wikipedia-search-form\']/div/span[2]/span[2]/input"));
		search.click();
		
		//2.alert
		
		WebElement alertb=driver.findElement(By.xpath("//*[@id=\'HTML9\']/div[1]/button"));
		alertb.click();
		
		Alert cancelalert=driver.switchTo().alert();
		cancelalert.dismiss();
		
		//3.Send values text box
		
		WebElement txtb1 = driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-1\']"));
		txtb1.sendKeys("sdhfd");
		
		
		
		
		
		
	}

}
