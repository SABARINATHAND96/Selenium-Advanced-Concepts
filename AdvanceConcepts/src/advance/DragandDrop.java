package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver gaming=new ChromeDriver();

		gaming.get("http://leafground.com/pages/drag.html");

		WebElement Fromdragg=gaming.findElement(By.id("draggable"));
		
		WebElement	Todrop=gaming.findElement(By.id("droppable"));

		Actions dragdrop=new Actions(gaming);
		
		//1
		dragdrop.clickAndHold(Fromdragg).moveToElement(Todrop).release().build().perform();
		
		dragdrop.dragAndDrop(Fromdragg, Todrop).build().perform();
		
	}

}
