package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver loki=new ChromeDriver();
		loki.manage().window().maximize();
		/*loki.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		
		WebElement calendar=loki.findElement(By.id("datepicker"));
		//calendar.click();
		calendar.sendKeys("09/26/1996");
		
		/*	//WebElement pre=loki.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]"));
		WebElement pre1=loki.findElement(By.xpath("//a[@title='Prev']"));
		pre1.click();
		
		
		
		WebElement date=loki.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
		*/	
		
		loki.get("https://www.mercurytravels.co.in/");
		
		Actions at = new Actions(loki);
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
	      at.sendKeys(Keys.PAGE_UP).build().perform();

		
		//loki.findElement(By.id("flights")).click();
		Thread.sleep(2000);
		
		loki.findElement(By.xpath("//*[@id=\"dphh1\"]")).sendKeys("23/07/2022");

		//String ss=cca.getAttribute("data-date-format");
		//System.out.println(ss);
		
		
	}

}
