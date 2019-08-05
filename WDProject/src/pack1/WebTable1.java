package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='power']")).click();
		//to fetch value from a table
		String val=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[4]/td[3]")).getText();
		System.out.println("value is: "+val);
	}

}
