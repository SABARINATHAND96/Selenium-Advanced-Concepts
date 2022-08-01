package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComputerDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver hdmi = new ChromeDriver();
		
		hdmi.get("https://computer-database.gatling.io/computers");
		
		WebElement tillle=hdmi.findElement(By.xpath("/html/head/title"));
		
		String tiiilll= hdmi.getTitle();
		System.out.println(tiiilll);
		
		String headdd=hdmi.findElement(By.xpath("/html/body/header/h1/a")).getText();
		
		System.out.println(headdd);
		
		if (tiiilll.equals(headdd)) {
			
			System.out.println("Correct");
			
			
		}else {
			System.out.println("Wrong");
		}
		
		
	}

}
