package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("http://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		WebElement table_rows=driver.findElement(By.xpath("html/body/table/tbody"));
		List<WebElement> rows=table_rows.findElements(By.tagName("tr"));
		int no_rows=rows.size();
		System.out.println("No of Rows: "+no_rows);
		
		/*WebElement table_cols=driver.findElement(By.xpath("html/body/table/tbody/tr"));
		List<WebElement> cols=table_cols.findElements(By.tagName("td"));
		System.out.println("No of Columns: "+cols.size());*/
		
		for(int i=1;i<=no_rows;i++)
		{
			WebElement table_cols=driver.findElement(By.xpath("html/body/table/tbody/tr"));
			List<WebElement> cols=table_cols.findElements(By.tagName("td"));
			int no_cols=cols.size();
			System.out.println("No of cells in row "+i+" is "+no_cols);
			for(int j=1;j<=no_cols;j++)
			{

				String val=driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(i+ " row "+j+" column= "+val);
				/*String cell=cols.get(j).getText();
				System.out.println("cell value of row "+i+" and column "+j+" is "+cell);*/
			}
			System.out.println("--------------------------------");
		}
		

	}

}
