package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver asus = new ChromeDriver();
		
		asus.get("http://leafground.com/pages/Image.html");
		
		WebElement Image=asus.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		
		if (Image.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println("Broken Image");
			
		}else {
			System.out.println("Not a Broken Image");
		}
		
		
		
	}

}
