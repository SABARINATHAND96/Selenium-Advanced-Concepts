package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;

public class Selectablec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver sss=new ChromeDriver();		

		sss.get("http://leafground.com/pages/selectable.html");
		
		
		List<WebElement> s=sss.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		int selectt=s.size();
		System.out.println(selectt);
		
		Actions ss=new Actions(sss);
	
	//	ss.keyDown(Keys.CONTROL).click(s.get(3)).build().perform();		
		
		
		
		ss.clickAndHold(s.get(5));
		
		ss.clickAndHold(s.get(3));
		ss.build().perform();
		
		
		
	}

}
