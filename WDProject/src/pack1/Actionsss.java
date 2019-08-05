package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login-form:signup")).click();
		Actions a=new Actions(driver);
		a.sendKeys(Keys.F5).build().perform();
		WebElement apps=driver.findElement(By.xpath("//*[@id='footer']/div/div[2]/a[3]"));
		a.moveToElement(apps).build().perform();
		/*	WebElement f=driver.findElement(By.xpath("//*[@id='signup:fname']"));
		a.contextClick(f).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		//a.sendKeys(Keys.DOWN).build().perform();
		//a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();*/
		//a.sendKeys(Keys.CONTROL+"t").build().perform();
		a.sendKeys(Keys.CONTROL+"n").build().perform();
	}
}
