package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4SearchEngine {
	WebDriver Logi;
	long StartTime;
	long EndTime;
	
	
	@BeforeSuite
		public void LunchBrowser() {
			StartTime=System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
			
			 Logi=new ChromeDriver();		
			
		}
	
	@Test
	public void TestCase1() {
		
		Logi.get("http://www.bing.com");
	}
	
	@Test 
		public void TestCase2() {
			
			Logi.get("http://www.google.co.in");
		}
	
	@Test 
		public void TestCase3() {
			
			Logi.get("http://www.yahoo.com");
			Logi.quit();
		}
	
	
	@AfterSuite
	
	public void CalculateBrowerTimes() {
		
		 EndTime=System.currentTimeMillis();
		
		long TotalTime=EndTime-StartTime;
		
		System.out.println("Total MilliSeconds : " +TotalTime);
	}
	
	
	
	
	
	
	
	
	
	
	
}
