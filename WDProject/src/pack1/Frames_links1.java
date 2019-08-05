package pack1;

import java.io.FileOutputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;
import jxl.write.WritableWorkbook;

public class Frames_links1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> f = driver.findElements(By.tagName("frame"));
		System.out.println("No of Frames:" + f.size());
		for (int i = 0; i < f.size(); i++) {
			List<WebElement> links = driver.switchTo().frame(i).findElements(By.tagName("a"));
			System.out.println("No of Links:" + links.size());
			for (int j = 0; j < links.size(); j++) {
				System.out.println(links.get(j).getText());
			}
			System.out.println("==============================================");
			driver.switchTo().parentFrame();
		}

	}

}
