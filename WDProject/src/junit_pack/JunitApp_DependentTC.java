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

public class JunitApp_DependentTC {
	public static WebDriver driver;

	@BeforeClass
	public static void launch_app() {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		System.out.println("App Launched");
	}

	@AfterClass
	public static void close_app() {
		driver.close();
		System.out.println("App Closed");
	}

	@Test
	public void links() {
		List<WebElement> nol = driver.findElements(By.tagName("a"));
		System.out.println("Links count: " + nol.size());
		for (int i = 0; i < nol.size(); i++) {
			String lname = nol.get(i).getText();
			// System.out.println(lname);
			if (lname.contains("terms") == true) {
				nol.get(i).click();
				System.out.println("Test1: " + lname + " link is clicked");
			}

		}
	}

	@Test
	public void win_close() {
		ArrayList w = new ArrayList(driver.getWindowHandles());
		System.out.println("Test2: No of windows opened " + w.size());
	}

	@Test
	public void inputs() {
		List<WebElement> noi = driver.findElements(By.tagName("input"));
		System.out.println("Test3: No of inputs:" + noi.size());
	}

}
