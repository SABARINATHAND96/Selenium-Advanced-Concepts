package facebooksignuppage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver ss1ss= new ChromeDriver();
		ss1ss.manage().window().maximize();
		ss1ss.get("https:\\www.google.co.in");
		
		WebElement google = ss1ss.findElement(By.name("q"));
		google.sendKeys("Youtube"+Keys.ENTER);
		//Thread.sleep(1000);
		WebElement linkk=	ss1ss.findElement(By.partialLinkText("YouTube"));
		linkk.click();
		//Thread.sleep(2000);
		WebElement search = ss1ss.findElement(By.name("search_query"));
		search.sendKeys("TN52 THIRU");
		Thread.sleep(1000);
	WebElement searchbutton =	ss1ss.findElement(By.xpath("//*[@id=\'search-icon-legacy\']/yt-icon"));
		searchbutton.click();
		Thread.sleep(1000);
		WebElement thiru=	ss1ss.findElement(By.partialLinkText("Our TN52 Thiru channel reached 200+ subscribers Thanks to Everyone #TN52Thiru #subscribe"));
		thiru.click();
		Thread.sleep(4000);

		WebElement comment = ss1ss.findElement(By.xpath("//*[@id=\'button\']/yt-icon"));
		comment.click();
		
	}

}
