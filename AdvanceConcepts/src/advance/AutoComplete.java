package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver intel=new ChromeDriver();
		intel.manage().window().maximize();
		
		intel.get("http://www.google.com");
		WebElement auto=intel.findElement(By.name("q"));
		auto.sendKeys("s");
		Thread.sleep(1000);
		
		List<WebElement> options=intel.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li"));

		System.out.println(options.size());
		for (WebElement ss : options) { 
			
			
			if (ss.getText().equals("sbi login")){				
				ss.click();
				break;
			}
			
		}
		
	}

}
