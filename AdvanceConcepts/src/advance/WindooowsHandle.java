package advance;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindooowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver intel=new ChromeDriver();
		
		intel.get("http://leafground.com/pages/Window.html");
		String Parentwindow=intel.getWindowHandle();
		
		WebElement dontcloseme=intel.findElement(By.xpath("//*[@id=\'color\']"));
		dontcloseme.click();
		
		Set<String> NewchildWindow=intel.getWindowHandles();
		
		for (String allnewchildwindows : NewchildWindow) {
			
			intel.switchTo().window(allnewchildwindows);
			System.out.println(allnewchildwindows);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
