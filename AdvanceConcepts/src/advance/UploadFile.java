package advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver asus = new ChromeDriver();
		
		asus.get("http://leafground.com/pages/upload.html");
		
		
		
		WebElement click11=asus.findElement(By.name("filename"));
		click11.sendKeys("C:\\Users\\SABARINATHAN D\\Downloads\\Untitled document.pdf");
		
		
		
		String file="C:\\Users\\SABARINATHAN D\\Downloads\\Untitled document.pdf";
		StringSelection select=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		Robot ssss=new Robot();
		ssss.keyPress(KeyEvent.VK_CONTROL);
		ssss.keyPress(KeyEvent.VK_V);
		ssss.keyRelease(KeyEvent.VK_V);
		ssss.keyRelease(KeyEvent.VK_CONTROL);
		ssss.keyPress(KeyEvent.VK_ENTER);
		ssss.keyRelease(KeyEvent.VK_ENTER);
		
		Robot we=new Robot();
		
		we.keyPress(KeyEvent.VK_WINDOWS);
		we.keyPress(KeyEvent.VK_SHIFT);
		we.keyPress(KeyEvent.VK_S);
		
		we.keyRelease(KeyEvent.VK_S);
		we.keyRelease(KeyEvent.VK_SHIFT);
		we.keyRelease(KeyEvent.VK_WINDOWS);
		
		we.keyPress(KeyEvent.VK_TAB);
		we.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		we.keyPress(KeyEvent.VK_TAB);
		we.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		we.keyPress(KeyEvent.VK_TAB);
		we.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		we.keyPress(KeyEvent.VK_TAB);
		we.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		we.keyPress(KeyEvent.VK_TAB);
		we.keyRelease(KeyEvent.VK_TAB);
		
		we.keyPress(KeyEvent.VK_ENTER);
		
		we.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	
		
		
	}

}
