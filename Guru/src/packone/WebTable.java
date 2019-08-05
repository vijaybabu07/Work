package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> cols=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("columns:"+cols.size());
		System.out.println("Column headers:");
		for(int i=0;i<cols.size();i++)
		{
			String colheader=cols.get(i).getText();
			System.out.println(colheader);
		}
		List<WebElement> rows=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("No of rows:"+rows.size());
	}
}
