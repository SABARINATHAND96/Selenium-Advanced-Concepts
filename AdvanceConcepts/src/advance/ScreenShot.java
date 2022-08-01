import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.util.concurrent.TimeUnit;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class ScreenShot{
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver",
      "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
     // driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
      // capture screenshot and store the image
    //  File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     // FileUtils.copyFile(s, new File("tutorialpoint.png"));
    //  driver.quit();
      
      
      File sss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File destination=new File("D:\\sam.png");
      FileHandler.copy(sss, destination);
      
      
   }
}