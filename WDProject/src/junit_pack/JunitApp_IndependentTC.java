package junit_pack;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitApp_IndependentTC {
	WebDriver driver;
	@Before
	public void launch_app()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@After
	public void close_app()
	{
		driver.close();
	}
	@Test
	public void links_count()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of Links: "+links.size());
		System.out.println("Link names:");
		for(int i=0;i<links.size();i++)
		{
			String lnames=links.get(i).getText();
			if(lnames.contains("terms")==true)
			{
				//System.out.println(lnames);
				links.get(i).click();
				System.out.println(lnames+" window is opened");
			}
		}
	}
	@Test
	public void window_close()
	{
		ArrayList<String> w=new ArrayList(driver.getWindowHandles());
		System.out.println(w.get(0));
		System.out.println(w.get(1));
		//driver.switchTo().window(arg0)
		System.out.println("Terms and conditions window is closed");
	}
}
