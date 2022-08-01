package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guruu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\geckodriver.exe");
		
		WebDriver vivo=new FirefoxDriver();		
		vivo.get("https://demo.guru99.com/test/");
		
		vivo.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("01/01/2022");
	}

}
