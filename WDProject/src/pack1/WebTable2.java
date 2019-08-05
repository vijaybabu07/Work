package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebTable2 {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://money.rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='power']")).click();
		List<WebElement> rcount_page=driver.findElements(By.tagName("tr"));
		System.out.println("No of rows in a page: "+rcount_page.size());
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> rcount=table.findElements(By.tagName("tr"));
		System.out.println("No of rows in a table: "+rcount.size());

	}

}
