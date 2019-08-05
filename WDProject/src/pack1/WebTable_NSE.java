package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_NSE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm?cat=G");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id='gainersDiv']/div[1]/a")).click();
		WebElement table=driver.findElement(By.xpath("//*[@id='topGainers']/tbody"));
		List<WebElement> headers=table.findElements(By.tagName("th"));
		System.out.println("Headers: "+headers.size());
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows: "+rows.size());
		/*List<WebElement> tdata=table.findElements(By.tagName("td"));
		System.out.println("No of tdata: "+tdata.size());*/
		for(int i=2;i<=rows.size();i++)
		{
			String val=table.findElement(By.xpath("tr["+i+"]/td[1]")).getText();
			if(val.equals("HDFC")==true)
			{
				System.out.println(table.findElement(By.xpath("tr["+i+"]/td[1]")).getText());
			}
		}
			
	}

}
