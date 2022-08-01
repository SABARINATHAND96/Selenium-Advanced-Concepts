package advance;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHanldess {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver gaming=new ChromeDriver();
		
		gaming.get("http://leafground.com/pages/Window.html");
		
		String practice=gaming.getWindowHandle();
		
		//1.click window button	
		
		WebElement windowsbutton=gaming.findElement(By.xpath("//*[@id=\"home\"]"));
		windowsbutton.click();
		
		gaming.switchTo().window(practice);
		
		WebElement OpenMultipleWindows=gaming.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		OpenMultipleWindows.click();
	
		
		
		
		WebElement dontcloseme=gaming.findElement(By.xpath("//*[@id=\'color\']"));
		dontcloseme.click();

		
		Set<String> newpracticewindows=	gaming.getWindowHandles();
		
		
		for (String allnewwindows : newpracticewindows) {
			
			if (!allnewwindows.equals(practice)) {
				Thread.sleep(2000);
			
				gaming.switchTo().window(allnewwindows);
				//WebElement menu=gaming.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
				//menu.click();
				gaming.close();
				
				
				
				
			
			}
			
		}
		
		
		
		ArrayList<String> windowHandles5=new ArrayList<String>(gaming.getWindowHandles());
		
		gaming.switchTo().window(windowHandles5.get(3));
		
			
		

	}

}
