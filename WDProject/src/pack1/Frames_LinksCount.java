package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_LinksCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> l1=driver.switchTo().frame("packageListFrame").findElements(By.tagName("a"));
		//driver.switchTo().parentFrame();
		int i,j;
		for(i=0;i<l1.size();i++)
		{
			l1.get(i).click();
			driver.switchTo().parentFrame();
			List<WebElement> l2=driver.switchTo().frame("packageFrame").findElements(By.tagName("a"));
			System.out.println("  count:   "+l2.size());
			//System.out.println(l1.get(i).getText()+"  count:   "+l2.size());
			
			/*for(j=0;j<l2.size();j++)
			{
				
			}*/
		}

	}

}
