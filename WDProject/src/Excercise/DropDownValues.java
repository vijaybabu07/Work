package Excercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValues {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		List<WebElement> day_options=day.findElements(By.tagName("option"));
		System.out.println("No of Days in Day dropdown"+(day_options.size()-1));
		for(int i=1;i<day_options.size();i++)
		{
			System.out.println(day_options.get(i).getText());
		}
		
		WebElement month=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]"));
		List<WebElement> month_options=month.findElements(By.tagName("option"));
		System.out.println("no of months in month dropdown:"+(month_options.size()-1));
		for(int i=1;i<month_options.size();i++)
		{
			System.out.println(month_options.get(i).getText());
		}
		WebElement year=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Year')]"));
		Select s=new Select(year);
		List<WebElement> year_options=s.getOptions();
		System.out.println("No of years in year dropdown"+(year_options.size()-1));
		for(int i=1;i<year_options.size();i++)
		{
			System.out.println(year_options.get(i).getText());
		}
		s.selectByVisibleText("1984");
		Thread.sleep(4000);
		driver.close();

	}

}
