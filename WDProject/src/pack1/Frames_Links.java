package pack1;

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
		List<WebElement> links=driver.switchTo().frame("packageListFrame").findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
	}

}
