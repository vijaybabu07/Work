package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("html/body/div/div/div[3]/p/a[2]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("vj123");
		driver.findElement(By.xpath("//*[starts-with(@name,'passwd')]")).sendKeys("abcde");
		driver.findElement(By.xpath("//*[@type='password' and contains(@name,'confirm')]")).sendKeys("abcde");
		driver.findElement(By.xpath("//*[starts-with(@name,'altemail')]")).sendKeys("vj@xyz.com");
		WebElement day=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		WebElement month=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]"));
		WebElement year=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Year')]"));
		Select d=new Select(day);
		//d.selectByIndex(1);
		d.selectByVisibleText("19");
		Select m=new Select(month);
		//m.selectByIndex(1);
		m.selectByVisibleText("AUG");
		Select y=new Select(year);
		//y.selectByIndex(1);
		y.selectByValue("1999");
		WebElement country=driver.findElement(By.xpath("//select[starts-with(@name,'country')]"));
		Select c=new Select(country);
		//c.selectByIndex(1);
		c.selectByVisibleText("Aruba");
	}
}
