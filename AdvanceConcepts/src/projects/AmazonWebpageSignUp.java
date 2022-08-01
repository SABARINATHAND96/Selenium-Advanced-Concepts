package facebooksignuppage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonWebpageSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver sabari = new ChromeDriver();
		
		sabari.get("https://www.google.co.in/");
		
		WebElement search = sabari.findElement(By.name("q"));
		search.sendKeys("Amazon india"+Keys.ENTER);
		
		WebElement clicklink=sabari.findElement(By.partialLinkText("Online Shopping site in India: Shop Online for Mobiles, Books ..."));
		clicklink.click();
		
		//1.click sign in
		
		WebElement signinclick =sabari.findElement(By.id("nav-link-accountList"));
		signinclick.click();
		
		//2. click create a new account
		
		WebElement createacc=sabari.findElement(By.xpath("//*[@id=\'createAccountSubmit\']"));
		createacc.click();
		
		//3.enter name
		
		WebElement name=sabari.findElement(By.id("ap_customer_name"));
		name.sendKeys("sabari");
		
		//4.Enter email
		
		WebElement email=sabari.findElement(By.id("ap_email"));
		email.sendKeys("ashj@gmail.com"+Keys.ENTER);
		
		WebElement pass=sabari.findElement(By.id("ap_password"));
		pass.sendKeys("djsdjdj45");
		
		Thread.sleep(4000);
		
		WebElement pass1=sabari.findElement(By.id("ap_password_check"));
		pass1.sendKeys("djsdjdj45");
		
		
		
		WebElement submit=sabari.findElement(By.id("continue"));
		submit.click();
		
		
		
		
		
		
		
	}

}
