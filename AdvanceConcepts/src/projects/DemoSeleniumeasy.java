package facebooksignuppage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSeleniumeasy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver nathan = new ChromeDriver();
		 
		nathan.get("https://demo.seleniumeasy.com/");
		Thread.sleep(1000);
		
	WebElement close=	nathan.findElement(By.xpath("//*[@id=\'at-cv-lightbox-close\']"));
	close.click();
	
	Thread.sleep(1000);

	WebElement start=	nathan.findElement(By.xpath("//*[@id=\'btn_basic_example\']"));
		
	start.click();	
	Thread.sleep(1000);

	WebElement start1=	nathan.findElement(By.xpath("//*[@id=\'basic\']/div/a[2]\r\n"));
	
	start1.click();	
		
	
	
	//check boxes
	
	WebElement chek1=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[1]/label/input"));
	chek1.click();
		
	WebElement chek2=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[2]/label/input"));
	chek2.click();

	WebElement chek3=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[3]/label/input"));
	chek3.click();

	WebElement chek4=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[4]/label/input"));
	chek4.click();
	
	WebElement chekoruncheck=	nathan.findElement(By.xpath("//*[@id=\'check1\']"));
	chekoruncheck.click();
	Thread.sleep(1000);

	//click the menu list
	
	
	WebElement menu1=	nathan.findElement(By.xpath("//*[@id=\'treemenu\']/li/ul/li[1]/a"));
	menu1.click();
	Thread.sleep(1000);

	
	WebElement menu2=	nathan.findElement(By.xpath("//*[@id=\'treemenu\']/li/ul/li[1]/ul/li[3]/a"));
	menu2.click();
	
	Thread.sleep(1000);
	
	//Radio button
	
	
	WebElement radiomale=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));
	radiomale.click();
	Thread.sleep(1000);

	
	WebElement radiomale2=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[2]/label[3]/input"));
	radiomale2.click();
	
	WebElement getvalu=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/button"));
	getvalu.click();
	
	//Alert menu

	WebElement menualert1=	nathan.findElement(By.xpath("//*[@id=\'treemenu\']/li/ul/li[5]/a"));
	menualert1.click();
	
	WebElement menualert2=	nathan.findElement(By.xpath("//*[@id=\'treemenu\']/li/ul/li[5]/ul/li[5]/a"));
	menualert2.click();
	Thread.sleep(3000);


	//alert box click
	
	WebElement alert1=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/button"));
	alert1.click();
	
	Thread.sleep(3000);
	Alert alertb = nathan.switchTo().alert();
	alertb.dismiss();
	
	Thread.sleep(2000);

	//Alert with prompt
	WebElement prompt1=	nathan.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[3]/div[2]/button\r\n"));
	prompt1.click();
	Thread.sleep(2000);

	
	Alert prompt2 =	nathan.switchTo().alert();
	prompt2.sendKeys("sshfsjdfhsdfgajfgsahajdfj");
	
	prompt2.accept();
	
	
	
	
	
	
	}

}
