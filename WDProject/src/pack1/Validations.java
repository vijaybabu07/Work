package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Validations {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://google.com");
		driver.navigate().to("http://demo.borland.com/InsuranceWebExtJS/");
		//driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		System.out.println("URL: "+driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://google.com");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());	
	}
}
