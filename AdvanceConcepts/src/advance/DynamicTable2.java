package advance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.misc.Array2DHashSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.ah.A;

public class DynamicTable2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver loki=new ChromeDriver();
		
		loki.navigate().to("http://www.leafground.com/pages/table.html");
		
		
		
		List<WebElement> tabledata2=loki.findElements(By.xpath("//td[2]"));
		

		List<Integer> aa=new ArrayList<Integer>();
		
		
		
		for (WebElement sssss : tabledata2) {
			
		String s1=sssss.getText().replace("%", "");
			
			aa.add(Integer.parseInt(s1));
			
		}
		
		System.out.println(aa);
		
		
			int ttt=Collections.max(aa);
			
			System.out.println(ttt);
		
			String rr	=Integer.toString(ttt)+"%";
			
			String dd="//td[normalize-space()="+"\""+rr+"\""+"]"+"//following::td[1]";
			
			System.out.println(dd);
			Thread.sleep(2000);
			
		WebElement cc=loki.findElement(By.xpath(dd));
		cc.click();
			
			
			
		/*if(ttt.) {
			
			loki.findElement(By.xpath(" //td[]    "))
			
		}else {
			System.out.println("dsf");
			
		}		
		
		
		*/
		
		
		
		/* for (Integer integer1 : aa) {
		
			if(integer1.equals(80)) {
				
				System.out.println("hi");
				break;
			}else {
				
				System.out.println("hh");
				break;
			}
			
		}
		
		*/
		
		
		
	}

}
