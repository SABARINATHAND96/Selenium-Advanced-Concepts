package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortablesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver loki=new ChromeDriver();
		
		loki.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> kk=loki.findElements(By.xpath("//*[@id='sortable']//li"));
		
		WebElement from=kk.get(5);
		WebElement to=kk.get(0);
		
		Actions acionss=new Actions(loki);
		
		acionss.clickAndHold(from);
		acionss.moveToElement(to);
		acionss.release();
		acionss.build().perform();
	//	Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//
	//	ImageIO.write(screenshot.getImage(), "jpg", new File("c:\\ElementScreenshot.jpg"));

		
		
	}

}
