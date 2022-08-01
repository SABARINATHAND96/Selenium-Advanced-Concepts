package advance;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandless {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver asus = new ChromeDriver();
		
		asus.get("http://www.leafground.com/pages/Window.html");
		
		asus.manage().window().maximize();
		//1.Window handles
		
		String controloldwindow=	asus.getWindowHandle();
		
		
		WebElement buttonclick=asus.findElement(By.id("home"));
		
		buttonclick.click();
		
		Thread.sleep(2000);
		
		Set<String> controlnewwindow=asus.getWindowHandles();
		
		for (String newwindows : controlnewwindow) {
			
			
			asus.switchTo().window(newwindows);
			
		}
		
		Thread.sleep(2000);
		WebElement editbox=asus.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		
		editbox.click();
		
		asus.close();
		
		asus.switchTo().window(controloldwindow);
		Thread.sleep(2000);
		WebElement clickmultiplewindow =asus.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		clickmultiplewindow.click();
		
		int noofwindowsopened=asus.getWindowHandles().size();
		System.out.println("No of window opened"+noofwindowsopened);
		
		//WebElement dontcloseme1 =asus.findElement(By.xpath("//*[@id=\'color\']"));
		//dontcloseme1.click();
		//Thread.sleep(2000);
		
		Set<String> newwindowhandles1= asus.getWindowHandles();
		
		for (String allwindow : newwindowhandles1) {
			
			if(!allwindow.equals(controloldwindow))
			{
				
				asus.switchTo().window(allwindow);
				asus.close();
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
