package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofRowsColumns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("https://money.rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("power")).click();
		
		// Fetch number of rows and columns from Dynamic WebTable
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int no_rows=rows.size();
		System.out.println("Number of rows: "+no_rows);
		
		WebElement tablecol=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/thead/tr"));
		List<WebElement> cols=tablecol.findElements(By.tagName("th"));
		int no_cols=cols.size();
		System.out.println("Number of columns: "+no_cols);
		
		//Fetch cell value of a particular row and column of the Dynamic Table
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[4]/td[3]")).getText());
		
		
	}

}
