package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooooolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver gaming=new ChromeDriver();

		gaming.get("http://leafground.com/pages/tooltip.html");
		
		WebElement tooltip=gaming.findElement(By.id("age"));
		
		String txtprint=tooltip.getAttribute("title");		
		
		System.out.println(txtprint);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
