package advance;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreeeenShot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver ptron=new ChromeDriver();
		
		ptron.navigate().to("https://www.guru99.com/images/AdvanceSelenium/");
		
		TakesScreenshot Screeen=(TakesScreenshot) ptron;
		//1
		File source=Screeen.getScreenshotAs(OutputType.FILE);
		
		
		File destinationLocation=new File("D://sa.png");
		
		FileHandler.copy(source, destinationLocation);
		
		//2
		
		Robot robot=new Robot();
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(screensize);
		BufferedImage source2=robot.createScreenCapture(rect);
		File destinationFile=new File("D://robo.png");
		ImageIO.write(source2,"png", destinationFile);
		
	}

}
