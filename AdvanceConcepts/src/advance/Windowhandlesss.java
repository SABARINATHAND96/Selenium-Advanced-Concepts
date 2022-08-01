package advance;

import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlesss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver asus=new ChromeDriver();
		
		asus.manage().window().maximize();		
		asus.get("http://leafground.com/");
		//2.So we identify which window opened 
		String firstnewwindow =	asus.getWindowHandle();
		
		//1. First step find a webElement then click window button
		WebElement windowclick =asus.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[11]/a/img"));
		windowclick.click();
		//3.click homePage button and that's open one window 
		WebElement clickhomepage=asus.findElement(By.xpath("//*[@id=\'home\']"));
		clickhomepage.click();
		asus.manage().window().maximize();		
		//3.We saved set string ReturnType newly open window 
		Set<String> secondwindow=asus.getWindowHandles();
		
		//4.ForEach loop (secondWindow values stored in allWindows)
		//Then controls switch to allWindows 
		//Now you can click EditButton(New window)  
		for (String allwindows  : secondwindow) {
			
			asus.switchTo().window(allwindows);
			
		}
		
		
		WebElement clickeditbox=asus.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		clickeditbox.click();
		
		asus.close();
		
		asus.switchTo().window(firstnewwindow);
		
		WebElement clickMultipleWindowButton=asus.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		clickMultipleWindowButton.click();
		int LastOpenedWindows=asus.getWindowHandles().size();
		System.out.println("How Many windows Opened:" +LastOpenedWindows);
		
		WebElement ClickDontClosemeButton=asus.findElement(By.xpath("//*[@id=\'color\']"));
		ClickDontClosemeButton.click();
		
		Set<String> DontCloseWindows=asus.getWindowHandles();
		
		
		for (String Closeallwindows : DontCloseWindows) {
			
			if (!Closeallwindows.equals(firstnewwindow)) {
				asus.switchTo().window(Closeallwindows);
				asus.close();
				
				
				
			}
			
		}
		
		
		
		
		
		
	}

}
