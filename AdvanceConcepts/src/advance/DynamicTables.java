package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver thor=new ChromeDriver();
		
		thor.navigate().to("http://www.leafground.com/pages/table.html");
		
		Actions at = new Actions(thor);
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
	      Thread.sleep(2000);
	      at.sendKeys(Keys.PAGE_UP).build().perform();

			List<WebElement> dd=thor.findElements(By.xpath("//td[2]"));
			
			List<Integer> ww=new ArrayList<>();
			
			for (WebElement ele : dd) {
				
				String ss=ele.getText().replace("%", "");
				
				ww.add(Integer.parseInt(ss));
				
			
			}
			System.out.println(ww);

			int ccc=Collections.max(ww);
			
			System.out.println(ccc);
			
			String gg1=Integer.toString(ccc)+"%";
			
			String zz="//td[normalize-space()="+"\""+gg1+"\""+"]"+"//following::td[1]";
			
			System.out.println(zz);
			
			WebElement vv=thor.findElement(By.xpath(zz));
			vv.click();
			
			
		
	}

}
