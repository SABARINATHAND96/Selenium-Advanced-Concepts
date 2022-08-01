package advance;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicTablesEasySelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\msedgedriver.exe");
		
		WebDriver ironman=new EdgeDriver();
		
		ironman.navigate().to("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		WebElement ff=ironman.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[1]"));
		ff.click();
		
		
		WebElement zz=ironman.findElement(By.xpath("//*[@id=\"example_length\"]/label/select"));
		
		Select qq=new Select(zz);
		
		qq.selectByIndex(2);
		
		
		ironman.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("London"+Keys.ENTER);
		
		//1.Find Elements
		List<WebElement> gg=ironman.findElements(By.xpath("//td[4]"));
		
		
		//4.To Get Text value to Integer
		List<Integer> ss=new ArrayList<Integer>();
		
		//2.Iterate Elements, convert Text Format
		
		//3.Then change Text value to Integer value
		
		for (WebElement bb : gg) {
			
			String qqq=bb.getText();
			ss.add(Integer.parseInt(qqq));
			System.out.println(qqq);	
			
		}
		//5.All Integers values Put Collections Class and find Max
		
		int ss1=Collections.max(ss);
		System.out.println(ss1);
		
		String dd=Integer.toString(ss1);
		
		String ff1="//td[normalize-space()="+dd+"]//following::td[1]";
		
		System.out.println(ff1);
		
		WebElement wss=ironman.findElement(By.xpath(ff1));
		String bbb=wss.getText();
		
		System.out.println(bbb);
		
		
		
	
	}

}
