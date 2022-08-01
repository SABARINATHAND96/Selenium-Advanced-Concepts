package advance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadsFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver sssss =new ChromeDriver();
		
		sssss.get("https://www.rejinpaul.com/2022/06/ge8076-professional-ethics-in-engineering-important-questions.html");
		
WebElement s=sssss.findElement(By.partialLinkText("Click here to Download"));
		*/
		
		File down=new File("C:\\Users\\SABARINATHAN D\\Downloads\\Documents");
		File[] ss=down.listFiles();
		Thread.sleep(2000);
		System.out.println(ss);
		for (File file : ss) {
			
			if (file.getName().equalsIgnoreCase("Bill no 10.pdf")) {
				
				System.out.println(file);
				break;
			}
			else {
				System.out.println("sdfs");
				break;
			}
			
			
			
			
		}
		
		
		
		
	}

}
