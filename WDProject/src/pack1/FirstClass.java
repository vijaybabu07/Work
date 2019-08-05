package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver cdriver=new FirefoxDriver();
		cdriver.get("https://www.seleniumeasy.com");
		cdriver.manage().window().maximize();*/
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("http://demo.guru99.com/test/newtours/");
		cdriver.manage().window().maximize();
		String title=cdriver.getTitle();
		System.out.println("Title: "+title);
		String tag=cdriver.findElement(By.name("userName")).getTagName();
		System.out.println("Tagname :"+tag);
		//cdriver.close();
	}
}
