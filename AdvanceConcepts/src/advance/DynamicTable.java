package advance;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver loki=new ChromeDriver();
		
		loki.navigate().to("http://www.leafground.com/pages/table.html");
		
		//1.FIND NO OF COLUMNS 
		
		List<WebElement> columns=loki.findElements(By.tagName("th"));
		int columncount=columns.size();
		System.out.println("No of Columns : "+columncount);
		
		//1.FIND NO OF ROWS
		
		List<WebElement> rows=loki.findElements(By.tagName("tr"));
		int rowscount=rows.size();
		System.out.println("No of Rows : "+rowscount);
		
		WebElement getpercent=loki.findElement
				(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String ss=getpercent.getText();
		System.out.println(ss);
		
		//3.lIST OF STRING VALUES CONVERT INTO INTEGER
		
		List<WebElement>  allprogress=loki.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberlist=new ArrayList<Integer>();
		
		for (WebElement sss : allprogress) {
			
		String individualvalue=sss.getText().replace("%", "");
		
		numberlist.add(Integer.parseInt(individualvalue));
			
		
		}
		
		System.out.println(numberlist);
		
		
		
		
	}

}
