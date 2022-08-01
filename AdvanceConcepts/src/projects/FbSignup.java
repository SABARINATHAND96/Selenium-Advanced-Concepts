package facebooksignuppage;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver sabari = new ChromeDriver();
		sabari.get("https://www.facebook.com/");
		
		//1.create new fb account 
		
		WebElement clickb =	sabari.findElement(By.linkText("Create New Account"));
		clickb.click();
		
	      sabari.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//Thread.sleep(400);
		//sabari.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
			
		
		//2.Fill first name last name,email, password
		
		WebElement firstname=sabari.findElement(By.name("firstname"));
		firstname.sendKeys("sabari");
		
		WebElement lastna=sabari.findElement(By.name("lastname"));
		lastna.sendKeys("nathan");
		
		WebElement mail=sabari.findElement(By.name("reg_email__"));
		mail.sendKeys("7598536988");
		
		
		WebElement pass=sabari.findElement(By.name("reg_passwd__"));
		pass.sendKeys("jd@2dfhkh");
		
		WebElement date=sabari.findElement(By.xpath("//*[@id=\'day\']"));
		Select datee=new Select(date);
		datee.selectByIndex(26);		
		
		
		WebElement mon=sabari.findElement(By.xpath("//*[@id=\'month\']"));
		Select month=new Select(mon);
		month.selectByIndex(9);	
		
		WebElement year=sabari.findElement(By.xpath("//*[@id=\'year\']"));
		Select yearr=new Select(year);
		yearr.selectByVisibleText("1996");

		WebElement radiomale=sabari.findElement(By.name("sex"));
		radiomale.click();
		
		sabari.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		WebElement sd = sabari.findElement(By.name("websubmit"));
		sd.click();
		
		
		
		
		
		}
		
		
	}


