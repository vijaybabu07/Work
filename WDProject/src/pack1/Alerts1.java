package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.Alert;

public class Alerts1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.navigate().to("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div/div/div[3]/p/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='Register']")).click();
		
		//org.openqa.selenium.Alert a=driver.switchTo().alert();
		Alert a=driver.switchTo().alert();
		String alertmsg=a.getText();
		System.out.println("Alert Message:");
		System.out.println(alertmsg);
		a.dismiss();

	}

}
