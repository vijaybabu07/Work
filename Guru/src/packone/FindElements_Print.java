package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Print {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("links count" + links.size());
		for (int i = 0; i < links.size(); i++) {
			String lnames = links.get(i).getText();
			System.out.println(lnames);
		}
		List<WebElement> n = driver.findElements(By.name("name"));
		System.out.println("Names count" + n.size());
		for (int i = 0; i < n.size(); i++) {
			String name = n.get(i).getAttribute("value");
			System.out.println(name);
		}
	}
}
