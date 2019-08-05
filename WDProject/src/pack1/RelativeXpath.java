package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//InternetExplorerDriver driver = new InternetExplorerDriver("E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe"); 
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='login-form:signup' and @alt='Signup']")).click();
		driver.findElement(By.xpath("//*[@id='signup:fname']")).sendKeys("vijay");
		driver.findElement(By.xpath("//*[@id='BirthDate']")).sendKeys("02/06/2019");
		driver.findElement(By.xpath("//select[@id='signup:state']")).sendKeys("Indiana");
		driver.findElement(By.xpath("//input[@id='signup:password']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//*[@id='signup:signup']")).click();
	}

}
