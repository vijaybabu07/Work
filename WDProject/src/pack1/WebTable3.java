package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebTable3 {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("http://money.rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='power']")).click();
		WebElement table=driver.findElement(By.xpath("//div[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> nor=table.findElements(By.tagName("tr"));
		System.out.println("Number of Rows: "+nor.size());
		for(int i=1;i<=nor.size();i++)
		{
			//String val=table.findElement(By.xpath("tr["+i+"]/td[1]")).getText();
			//if(val.equals("Bharat Heavy Electricals Ltd.")==true)
			if(table.findElement(By.xpath("tr["+i+"]/td[1]")).getText().equals("Bharat Heavy Electricals Ltd.")==true)
			{
				System.out.println(table.findElement(By.xpath("tr["+i+"]/td[1]")).getText());
				table.findElement(By.xpath("tr["+i+"]/td[1]")).click();
			}
		}
	}
}
