package advance;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWondow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver vivo=new ChromeDriver();
		
		vivo.get("http://www.leafground.com/pages/Window.html");
		
		String parentwindow=vivo.getWindowHandle();
	
		
		WebElement hompageclick=vivo.findElement(By.xpath("//*[@id=\'home\']"));
		hompageclick.click();
		
		vivo.switchTo().window(parentwindow);
		
		WebElement openmultiplewindow=	vivo.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openmultiplewindow.click();
		
		//vivo.switchTo().window(parentwindow);
		
		
		
		ArrayList<String> tabs=new ArrayList<String>(vivo.getWindowHandles());
		
		vivo.manage().window().maximize();
		vivo.switchTo().window(tabs.get(3)).close();
		
	
		
		
		  WebElement donotcloseme=vivo.findElement(By.xpath("//*[@id=\'color\']"));
		  donotcloseme.click();
		 
		 vivo.switchTo().window(parentwindow);
		  
		  Set<String> closeallwindow=vivo.getWindowHandles();
		 
		 for (String newwindow : closeallwindow) {
		  
		  if (!newwindow.equals(parentwindow)) {
		  
		  vivo.switchTo().window(newwindow); vivo.close(); }
		  
		  }
		  
		 
		
		

		}

		}
