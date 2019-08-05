package Excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> nof=driver.findElements(By.tagName("frame"));
		System.out.println("No of Frames:"+nof.size());
		for(int i=0;i<nof.size();i++)
		{
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			System.out.println("No of links in frame "+i+": "+links.size());
			for(int j=0;j<links.size();j++)
			{
				System.out.println(links.get(j).getText());
			}
			driver.switchTo().parentFrame();
		}

	}

}
