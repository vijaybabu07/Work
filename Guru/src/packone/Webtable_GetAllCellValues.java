package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_GetAllCellValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		System.out.println("Row count:"+rows.size());
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("/html/body/table/tbody/tr["+i+"]/td"));
			System.out.println("No of cells in row "+i+" is :"+cols.size());
			for(int j=0;j<cols.size();j++)
			{
				System.out.print(cols.get(j).getText());
			
			}
			System.out.println("\n=====");
		}
	}

}
