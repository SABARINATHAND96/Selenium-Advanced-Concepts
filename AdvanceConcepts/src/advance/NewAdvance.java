package advance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAdvance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/* System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver sss=new ChromeDriver();		
		
		sss.get("https://demo.seleniumeasy.com/generate-file-to-download-demo.html");
		
		WebElement txt=sss.findElement(By.id("textbox"));
		txt.sendKeys("sddfsngakdgakdfgagafgfdngjkfgf");
		
		
		WebElement	generate=sss.findElement(By.id("create"));
		generate.click();
		
		Thread.sleep(2000);
		
		WebElement download=	sss.findElement(By.id("link-to-download"));
		
		download.click();
		Thread.sleep(3000);
		*/
		File check=new File("C:\\Users\\SABARINATHAN D\\Downloads");
		File[] okkkk=check.listFiles();
		
		for (File file1 : okkkk) {
			
			if (!file1.getName().equals("easyinfo")) {
				
				System.out.println(file1);
				System.out.println("ok");
				break;
			}
			else {
				System.out.println("somthing wrong");
				break;
			}
			
			
		}
		
		
		
		

	}

}
