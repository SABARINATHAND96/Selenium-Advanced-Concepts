package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver loki=new ChromeDriver();
		
		loki.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homepage=loki.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		
		loki.navigate().back();
		
		WebElement findme=loki.findElement(By.partialLinkText("Find where am supposed to go without clicking me?"));
		
		String link=findme.getAttribute("href");
		System.out.println("You will be redirect this Link : " +link);
		
		//Find am a Broken
		
		WebElement broken=loki.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		
		String ti=loki.getTitle();
		
		if(ti.contains("404")) {
			System.out.println("Link is Broken");
			//loki.navigate().back();
		}
		else {
			
		System.out.println("Link is Not Broken");			
				
		}
		
		loki.navigate().back();
		homepage.click();
		
		loki.navigate().back();
		
		List<WebElement> links=loki.findElements(By.tagName("a"));
		
		int count=	links.size();
		System.out.println("Link Counts are : "+count);
		
	}

}
