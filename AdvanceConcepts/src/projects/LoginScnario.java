package projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScnario {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		//1.Goto Guru99 Site
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\geckodriver.exe");
		WebDriver vivo=new FirefoxDriver();		
		vivo.get("http://www.demo.guru99.com/V4/");
		//2.Put Login Data
		vivo.findElement(By.name("uid")).sendKeys("mngr426812");
		vivo.findElement(By.name("password")).sendKeys("AvenYna");
		vivo.findElement(By.name("btnLogin")).submit();
		//3.Click a New Customer Link
		Thread.sleep(2000);
		vivo.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		//4.Fill Out All CUSTOMER DETAILS
		vivo.findElement(By.name("name")).sendKeys("Rohit");
		vivo.findElement(By.name("rad1")).click();
		vivo.findElement(By.id("dob")).click();
		Thread.sleep(3000);
		
		Robot sss=new Robot();
		sss.keyPress(KeyEvent.VK_SHIFT);
		sss.keyPress(KeyEvent.VK_TAB);
		sss.keyRelease(KeyEvent.VK_TAB);
		sss.keyRelease(KeyEvent.VK_SHIFT);
		sss.keyPress(KeyEvent.VK_9);
		sss.keyRelease(KeyEvent.VK_9);
		sss.keyPress(KeyEvent.VK_2);
		sss.keyRelease(KeyEvent.VK_2);
		sss.keyPress(KeyEvent.VK_6);
		sss.keyRelease(KeyEvent.VK_6);
		sss.keyPress(KeyEvent.VK_1);
		sss.keyRelease(KeyEvent.VK_1);
		sss.keyPress(KeyEvent.VK_9);
		sss.keyRelease(KeyEvent.VK_9);
		sss.keyPress(KeyEvent.VK_9);
		sss.keyRelease(KeyEvent.VK_9);
		sss.keyPress(KeyEvent.VK_6);
		sss.keyRelease(KeyEvent.VK_6);
		sss.keyPress(KeyEvent.VK_TAB);
		sss.keyRelease(KeyEvent.VK_TAB);
		vivo.findElement(By.name("addr")).sendKeys("999 Middle Street Salem TamilNadu");
		vivo.findElement(By.name("city")).sendKeys("SALEM");
		vivo.findElement(By.name("state")).sendKeys("TAMIL NADU");
		vivo.findElement(By.name("pinno")).sendKeys("636102");
		vivo.findElement(By.name("telephoneno")).sendKeys("9498649578");
		vivo.findElement(By.name("emailid")).sendKeys("sabarisv1454@gmail.com");
		vivo.findElement(By.name("password")).sendKeys("Rohit@45");
		vivo.findElement(By.name("sub")).click();
		
		
		//5.Create a New Account
		
		//vivo.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		
		
		
		
		
	
		
		
	}

}
