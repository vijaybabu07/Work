package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class XPaths {

	public static void main(String[] args) {
	/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();*/
	/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();*/
	System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.borland.com/InsuranceWebExtJS/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/div/div[3]/div/div[2]/form/div[2]/input[4]")).click();
	driver.findElement(By.xpath("html/body/div/div[4]/form/fieldset/div/input")).sendKeys("vijay");
	driver.findElement(By.xpath("html/body/div/div[4]/form/fieldset/div[2]/input")).sendKeys("babu");
	driver.findElement(By.xpath("html/body/div/div[4]/form/fieldset/div[3]/div/div/div/input")).sendKeys("02/06/2019");
	driver.findElement(By.xpath("html/body/div/div[4]/form/fieldset/div[7]/select")).sendKeys("Indiana");
	driver.findElement(By.xpath("html/body/div/div[4]/form/fieldset/div[9]/input")).sendKeys("abcdef");
	driver.findElement(By.xpath("html/body/div/div[4]/form/fieldset/div[10]/input")).click();
		
	
	
	
	//driver.findElement(By.xpath("//input[@id='login-form:signup']")).click();
	//driver.findElement(By.xpath("//input[@class='cbutton' and @alt='Signup']")).click();
	
	//driver.findElement(By.xpath("html/body/div/div[3]/div/div[2]/form/div[2]/input")).sendKeys("vijay");
	//driver.findElement(By.xpath("html/body/div/div[3]/div/div[2]/div/div/form/select")).sendKeys("Agent Lookup");
	
	}

}
