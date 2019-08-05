package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DropDownValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		WebElement Day=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		List<WebElement> day_options=Day.findElements(By.tagName("option"));
		System.out.println("Day Size: "+day_options.size());
		for(int i=1;i<=day_options.size();i++)
		{
			System.out.println(Day.findElement(By.xpath("option["+i+"]")).getText());
		}
		
		WebElement month=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]"));
		List<WebElement> month_options=month.findElements(By.tagName("option"));
		System.out.println("Month Size: "+month_options.size());
		for(int i=1;i<=month_options.size();i++)
		{
			System.out.println(month.findElement(By.xpath("option["+i+"]")).getText());
		}
		
		WebElement year=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Year')]"));
		List<WebElement> year_options=year.findElements(By.tagName("option"));
		System.out.println("Year Size:"+year_options.size());
		for(int i=1;i<=year_options.size();i++)
		{
			System.out.println(year.findElement(By.xpath("option["+i+"]")).getText());
		}
		
		
	}

}
