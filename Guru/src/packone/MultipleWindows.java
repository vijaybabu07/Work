package packone;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		ArrayList a=new ArrayList(driver.getWindowHandles());
		System.out.println(a.size());
		//System.out.println(driver.switchTo().window((String) a.get(1)).getCurrentUrl());
		String url="http://demo.guru99.com/articles_popup.php";
		System.out.println("Expected url:"+url);
		for(int i=0;i<a.size();i++)
		{
			String act_url=driver.switchTo().window((String) a.get(i)).getCurrentUrl();
			System.out.println("Actual url:"+act_url);
			if(act_url.equals(url)==true)
			{
				driver.switchTo().window((String) a.get(i)).findElement(By.xpath("//input[@name='emailid']")).sendKeys("abc@xyz.com");
				driver.switchTo().window((String) a.get(i)).findElement(By.name("btnLogin")).click();
				driver.switchTo().window((String) a.get(i)).findElement(By.linkText("Click Here")).click();
			}
			else
			{
				System.out.println("URL Not matched");
			}
		}

	}

}
