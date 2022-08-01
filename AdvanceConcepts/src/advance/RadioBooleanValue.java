package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBooleanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver nathan = new ChromeDriver();
		
		nathan.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unchecked=nathan.findElement(By.xpath("//*[@value='0']"));
		unchecked.click();
		WebElement checked = nathan.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		
			unchecked.isSelected();
		
	}

}
